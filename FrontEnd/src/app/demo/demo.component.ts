import { Component, OnInit } from '@angular/core';
import { BaseService } from '../service/base.service';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.scss']
})
export class DemoComponent implements OnInit {

  constructor(private baseService: BaseService) { }

  userName: string;

  ngOnInit() {
    this.baseService.getUserName().subscribe(data=>(this.userName=data));
  }

}
