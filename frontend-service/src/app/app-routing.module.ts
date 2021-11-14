import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ShopComponent } from './shop/shop.component';
import { AboutComponent } from './about/about.component';


const routes: Routes = [
{ path: '', redirectTo: 'login', pathMatch: 'full'},
{ path: 'login', component: LoginComponent },
{ path: 'shop', component: ShopComponent },
{ path: 'about', component: AboutComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
