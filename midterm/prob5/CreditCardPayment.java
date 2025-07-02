package midterm.prob5;

import java.time.LocalDate;

public non-sealed class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolder;
    private LocalDate expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, LocalDate expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
    }

    public String getPaymentDetails(){
        return "Paid with card ending " + cardNumber.substring(cardNumber.length()-4, cardNumber.length());
    }
}
