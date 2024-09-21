import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HomeComponent } from './home/home.component';

@NgModule({
  imports: [
    BrowserModule,
    HomeComponent // Importing the standalone component
  ],
  providers: [],
  bootstrap: []
})
export class AppModule { }
