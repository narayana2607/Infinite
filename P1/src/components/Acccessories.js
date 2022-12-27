import React from 'react'

import ass from './images/ass.png'
import ass1 from './images/ass1.png'
import ass2 from './images/ass2.png'
import ass3 from './images/ass3.png'



import Footer from './Footer';


export default function Acccessories() {
    return(
        <div>
            <br></br>
            <br></br>
            <h1>/Home/Acccessories/</h1>
        <center>
        <div className="ass">
            <img src={ass} alt="" />
        </div>
        
        <div className="ass">
            <img src={ass1} alt="" />
        </div>
        
        <div className="ass2">
            <img src={ass2} alt="" />
        </div>

        <div className="ass3">
            <img src={ass3} alt="" />
        </div>

        </center>
        <Footer/>
        </div>
        
        
    )

}