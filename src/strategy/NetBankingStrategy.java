package strategy;

public class NetBankingStrategy implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return String.format("%d paid using NetBanking",amount);
    }
}
