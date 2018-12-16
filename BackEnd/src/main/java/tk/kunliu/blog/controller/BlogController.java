package tk.kunliu.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.kunliu.blog.entity.User;
import tk.kunliu.blog.repository.UserRepository;

@RestController
@RequestMapping(value = "/rest")
public class BlogController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping(value="/getMyName")
    public String getMyName(){
        return "liukun";
    }

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

}
