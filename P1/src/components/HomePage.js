import React from 'react'
import './css/header.css'
import Banner from './Banner';
import Footer from './Footer';
import Header from './Header';
import health from './images/health.png';
import tele from './images/tele.png';
import apple from './images/apple.png';
import cloud from './images/cloud.png';
import turb from './images/turb.png';
import talent from './images/talent.png';
import engi from './images/engi.png';
import iphone from './images/iphone.png';






export default function HomePage() {
    return (
        <div>
            <Header/> 
            <Banner />
        
            <div className="apple">
            <img src={apple} alt="" /></div>
            <Footer/> 

            <div className="health">
            <img src={health} alt="" /></div>
            <Footer/> 

            <div className="cloud">
            <img src={cloud} alt="" /></div>
            <Footer/> 

            <div className="health">
            <img src={tele} alt="" /></div>
            <Footer/> 
            <Banner />

            <div className="turb">
            <img src={turb} alt="" /></div>
            <Footer/> 

            <div className="talent">
            <img src={talent} alt="" /></div>

            <div className="iphone">
            <img src={iphone} alt="" /></div>
            


            <div className="engi">
            <img src={engi} alt="" /></div>



            

            
            <Footer/> 
        </div>
        
    )
}
