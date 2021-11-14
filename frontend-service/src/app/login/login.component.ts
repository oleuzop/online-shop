import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onLogin(event: any) {
    console.log(event.target.username.value);
    console.log(event.target.password.value);
    this.router.navigate(['shop']);
  }

}
