package tk.kunliu.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class BlogController {
    
    @GetMapping(value="/getMyName")
    public String getMyName(){
        return "liukun";
    }
}
