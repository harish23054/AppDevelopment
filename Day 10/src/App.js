import React from 'react'
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom'

import LandingPage from './components/pages/LandingPage'
import LoginPage from './components/pages/LoginPage'
import RegisterPage from './components/pages/RegisterPage'
import ForgetPasswordPage from './components/pages/ForgetPasswordPage'
import HomePage from './components/pages/HomePage'
import Contact from './components/pages/Contact'
import Services from './components/pages/Services'
import './App.css'
import FAQ from './components/pages/FAQ'
import Flights from './components/pages/Flights'
import PrivacyPolicy from './components/pages/PrivacyPolicy'
import AdminDashboard from './components/pages/AdminDashboard'

export default function App() {
    return (
        <Router>
            <div>
                <Switch>
                <Route path="/admin" component={AdminDashboard} />
                <Route exact path="/" component={ LandingPage } />
                <Route path="/login" component={ LoginPage } />
                <Route path="/register" component={ RegisterPage } />
                <Route path="/forget-password" component={ ForgetPasswordPage } />
                <Route path="/home" component={ HomePage } />
                <Route path="/FAQ" component={ FAQ } />
               <Route path="/Contact" component={Contact}/>
               <Route path="/Flights" component={Flights}/>
               <Route path="/Services" component={Services}/>
               <Route path="/PrivacyPolicy" component={PrivacyPolicy}/>
                </Switch>
                </div>
        </Router>
    )
}