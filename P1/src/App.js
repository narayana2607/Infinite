import React from 'react'
import HomePage from './components/HomePage';
import { BrowserRouter as Router, Routes, Route,Link } 
from 'react-router-dom';
import ForgetPasscode from'./components/ForgetPasscode';
import LoginPage from './components/LoginPage';
import RegisterPage from'./components/RegisterPage';
import './App.css'
import Support from './components/Support';
import Store from './components/Store';
import About from './components/About';
import Acccessories from './components/Acccessories';
import Cart from './components/Cart';
import Stripe from './components/Stripe';
import Checkout from'./components/Checkout';



const App = () => {
      return (
        <> 
         <Router>   
            <div>
                <Routes>
                <Route exact path="/" element={< HomePage/>} />
                    <Route path="/Login" element={ <LoginPage></LoginPage> } />
                    <Route path="/Register" element={ <RegisterPage></RegisterPage> } />
                     <Route path="/ForgetPasscode" element={ <ForgetPasscode></ForgetPasscode> } />
                     <Route path="/Support" element={ <Support></Support>} />
                     <Route path="/Store" element={ <Store></Store>} />
                     <Route path="/About" element={ <About></About>} />
                     <Route path="/Acccessories" element={ <Acccessories></Acccessories>} />
                     <Route path="/Cart" element={ <Cart></Cart>} />      
                     <Route path="/Stripe" element={ <Stripe></Stripe>} />         
                     <Route path="/Checkout" element={ <Checkout></Checkout>} />                 
        
           
                  </Routes>
            


            </div>
         </Router>
         </>
         
    );
};
export default App;