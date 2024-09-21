import { bootstrapApplication } from '@angular/platform-browser';
import { HomeComponent } from './app/home/home.component';
// import { appConfig } from './app/app.config.server';

const bootstrap = () => bootstrapApplication(HomeComponent);

export default bootstrap;