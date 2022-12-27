import React from 'react'
import { Link } from 'react-router-dom'
import './css/Login.css'


export default function LoginPage() {
    return (
        <center>
        <div className="text-center m-5-auto">
            <h2>Sign in to us</h2>
            <form action="/home">
                <p>
                    <label>Apple_ID </label>
                    <input type="text" placeholder="Enter Your_Apple_ID" required />
                </p>

                <div>
                    <label>Passcode</label>
                    <input type="password" placeholder="Enter Your_Passcode" required />
                </div>
                    <br></br>
                    
                <p>
                    <button id="sub_btn" type="submit">Login</button>
                </p>
                <br></br>
                <Link to="/ForgetPasscode"><label className="left-label">Forget Apple ID or Passcode?</label></Link>

            </form>
            <footer>
                <p>First time? <Link to="/register">Create an account</Link>.</p>
              
                <p><Link to="/">Back to Homepage</Link>.</p>
                <br></br>
            </footer>
        </div>
        </center>
    )
}
