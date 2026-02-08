package Interface;

public class Main {
    
    public static void main(String[] args)
    {
        Payment paypal = new PaypalPayment();
        CreditcartPayment credit = new CreditcartPayment();
        paypal.Pay(323);
        credit.Pay(23000);
    }
}
