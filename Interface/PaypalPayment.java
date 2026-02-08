package Interface;

public class PaypalPayment implements Payment {
    
    public void Pay(double amount){
        System.out.println("Paid " + amount + " using Paypal.");
    }
}
