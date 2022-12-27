import React from "react";

import{useNavigate}from 'react-router-dom'




export default function Checkout() {
  const navigate=useNavigate();
    return (
        <center>
        <div className="text-center m-2-auto">
            
            
        <form action="/home">
                <p>
                    <label>Email Address</label>
                    <br></br><br></br>
                    <input type="Email" placeholder="Enter Your_Email Address" required />
                </p>
                <p>
                <br></br><br/>

                    <label>Mobile No</label><br></br><br></br>

                    <input type="Mobile" placeholder="Enter Your_Mobile" required />
                </p>
                <br></br><br/>
                <p>
                    <label>Pincode</label><br></br>
                    <input type="Pincode" placeholder="EnterYour_Pincode" requiredc />
                </p>
                
                   
                <p>
                    <br></br>
                    <br></br>

                   <center><button id="sub_btn" onClick={() => navigate('/Stripe')}>Buy</button></center> 
                </p>
            </form>
        </div>
        </center>
    )

}
