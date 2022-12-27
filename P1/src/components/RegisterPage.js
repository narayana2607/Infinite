import React, {Component} from 'react';
import { Link } from 'react-router-dom';
import './css/Login.css'
import axios from 'axios'


export default class RegisterPage extends Component {
    constructor(props) {
        super(props);
        this.state = {
          Apple_Id :'',
          Mobile_No:'',
          Passcode:''
        };
    }
    SigninChangeApple_Id = event => {
      this.setState({Apple_Id : event.target.value})
    }

    SigninChangeMobile_No = event => {
      this.setState({Mobile_No :event.target.value})
    }

    SigninChangePasscode = event => {
      this.setState({Passcode : event.target.value})
    }

    submitSignin = event => {
      event.preventDefault();
      alert(this.state.Mobile_No)
      alert(this.state.Passcode)
      axios.post("http://localhost:9911/signin/addsignins", {
            mobile_No:this.state.Mobile_No,passcode:this.state.Passcode
      })
    }
    render() {
      return (
         <center>
        <div className="text-center m-2-auto">
            <h2>Join us</h2>
            <h5>Create your personal account</h5>
            <form action="/home"></form>
 

      <form onSubmit={this.submitSignin}>
      <div>
      Mobile_No : 
      <input type="text" name="Mobile_No" placeholder="Enter Your_Mobile No" onChange={this.SigninChangeMobile_No} />
      </div>
      <div>
          &nbsp;
      </div>

      <div>
       Passcode  : 
      <input type="text" name="password" placeholder="Enter Your_Passcode" onChange={this.SigninChangePasscode} />
      </div>

      <div>
          &nbsp;
      </div>
    
      <input id="sub_btn" type="submit" value="Register" />


        </form>
      </div>
      <footer>

                <p><Link to="/">Back to Homepage</Link>.</p><br></br>

               

            </footer>
      </center>
      )
    }

}
