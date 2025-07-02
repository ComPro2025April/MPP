package midterm.prob5;

public sealed interface Payment permits BankTransferPayment, CreditCardPayment, PayPalPayment {

    public default void process(){
        System.out.println(getPaymentDetails());
    }
    
    public abstract String getPaymentDetails();
}
