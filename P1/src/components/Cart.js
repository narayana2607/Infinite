import React, { useState, useEffect } from "react";
import "./css/cart.css";
import { useNavigate } from "react-router-dom";


const Cart = ({ cart, setCart, handleChange }) => {
  const [price, setPrice] = useState(0);
const navigate=useNavigate();



  const handleRemove = (id) => {
    const arr = cart.filter((item) => item.id !== id);
    setCart(arr);
    handlePrice();
  };

  const handlePrice = () => {
    let ans = 0;
    cart.map((item) => (ans += item.amount * item.price));
    setPrice(ans);
  };

  useEffect(() => {
    handlePrice();
  });

  return (
    <article>
      {cart.map((item) => (
        <div className="cart_box" key={item.id}>
          <div className="cart_img">
            <img src={item.img} alt="" />
            <p>{item.title}</p>
          </div>
          <div>
            <button onClick={() => handleChange(item, 1)}>+</button>
            <button>{item.amount}</button>
            <button onClick={() => handleChange(item, -1)}>-</button>
          </div>
          <div>
          <br></br>
            <span>{item.price}</span>
            
            <button onClick={() => handleRemove(item.id)}>Remove</button>
            <br></br>
        <br></br><br></br>
          </div>
        </div>
        
      ))}
      
      <br></br>
      <br></br>
      <div className="total">
        
        <span>Total Price of your Cart</span>
        <br></br>
        <span>Rs = {price}/-</span>
        <br></br>

        <div>
        <button  id="sub_btn" onClick={() => navigate('/Checkout')}>Checkout</button>
        </div>
        
      </div>
      <br></br>
    
    </article>
    
    
  );
};

export default Cart;
