package strategy;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    private boolean authenticateClient(final String token){
        return true;
    }

    public String pay(final String token,int amount){
        if(authenticateClient(token) && paymentStrategy!=null){
            return paymentStrategy.pay(amount);
        }
        return "Something went wrong";
    }
}
