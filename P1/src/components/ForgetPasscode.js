import React from 'react'
import { Link } from 'react-router-dom'




export default function ForgetPasscode() {
    return (
        <div className="text-center m-5-auto">
            <center>
            <h2>Reset your password</h2>
            <br></br>
            <h5>Enter your email address and we will send you a new password</h5>
            <form action="/login">
                <p>
                    <label id="reset_pass_lbl"> Email address</label>&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="email" name="email" required />
                </p>
                <br></br>
                <br></br>
                <br></br>

                <p>
                &nbsp; <button id="sub_btn" type="submit">Send password reset email</button>
                </p>
            </form>
            <footer>
                <p>First time? <Link to="/register">Create an account</Link>.</p>
                <br></br>

                <p><Link to="/">Back to Homepage</Link>.</p>
            </footer>
            <br></br>
            {/* <Footer/> */}
            </center>
        </div>
    )
}
