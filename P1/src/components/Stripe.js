import StripeCheckout from 'react-stripe-checkout';

function Stripe() {
  const onToken=(token)=>{
    console.log(token);

  };
  return (
    <center>
    <div className="Stripe">
      <StripeCheckout
      token={onToken}
      stripeKey="pk_test_51M3b0sSFM9ldRMMLa0gEY9fohDXd40B71UXckyx9MDrNrXzxoSraZVOG05GKcArFBS5yX05bgAHqPESCLXQSjjlW00bITF2K1q"
      />

    </div>
    </center>
  );
}

export default Stripe;
