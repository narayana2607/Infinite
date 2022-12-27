import React from 'react'
import './css/header.css'
import{Link}from 'react-router-dom'



export default function Header() {
    return (
        <nav className="navbar">
        <div className="logo">

        <h3 className="logo-h">  &nbsp; &nbsp;Apple.Inc </h3>
        </div>
        <li className="classlists">
            <li><Link to="/Store">Store</Link></li>
            <li><Link to="/Acccessories">Acccessories</Link></li>
            <li><Link to="/About">About Us</Link></li>
            <li><Link to="/Support">Support</Link></li> 
        </li>
        <div className="search">
            <input type="text" placeholder="Search Your iPhone Here" className="in" />
        </div>

        <div className="classlists">
            <Link to="/login">Login</Link>
            <Link to="/register">Sign Up</Link>
        </div>
    
      
       
       
            
        
    </nav>
    )}