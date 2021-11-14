import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';

/* Routing */
import { AppRoutingModule } from './app-routing.module';

/* Angular Material */
import { NgModule } from '@angular/core';
import { AngularMaterialModule } from './angular-material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { HttpClientModule } from '@angular/common/http';

/* FormsModule */
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

/* Angular Flex Layout */
import { FlexLayoutModule } from "@angular/flex-layout";

/* Components */
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';
import { ShopComponent } from './shop/shop.component';


@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    LoginComponent,
    ShopComponent
  ],
  imports: [
    BrowserModule,
    AngularMaterialModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    FlexLayoutModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
