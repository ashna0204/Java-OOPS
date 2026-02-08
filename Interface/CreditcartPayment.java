package Interface;

public class CreditcartPayment implements Payment{
    
    public void Pay(double amount)
    {
        System.out.println("paid " + amount + " using credit card.");
    }
}
