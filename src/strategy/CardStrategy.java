package strategy;

public class CardStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return String.format("%d paid using card",amount);
    }
}
