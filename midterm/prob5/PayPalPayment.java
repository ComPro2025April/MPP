package midterm.prob5;

public non-sealed class PayPalPayment implements Payment {
    private String email;
    private String transactionId;

    public PayPalPayment(String email, String transactionId) {
        this.email = email;
        this.transactionId = transactionId;
    }

    public String getPaymentDetails(){
        return "Paid via PayPal: " + email;
    }
}
