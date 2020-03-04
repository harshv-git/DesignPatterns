package strategy;

public class CODStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return String.format("You need to pay %d at the time of delivery",amount);
    }
}
