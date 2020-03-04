package strategy;

import java.util.Scanner;

public class StrategyClient {
    public static final int CARD = 1;
    public static final int NETBANKING = 2;
    private static final int COD = 3;

    public static void main(String[] args){
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(getPaymentMethod());
        String response = paymentContext.pay("XXXX",100);
        System.out.println(response);
    }

    private static PaymentStrategy getPaymentMethod() {
        switch (selectPaymentMethod()){
            case CARD : return new CardStrategy();
            case NETBANKING : return new NetBankingStrategy();
            case COD : return new CODStrategy();
            default: return null;
        }
    }

    private static int selectPaymentMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : card , 2 : netBanking , 3 : cod");
        return scanner.nextInt();
    }
}
