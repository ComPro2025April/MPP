package midterm.prob5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();

        CreditCardPayment ccp = new  CreditCardPayment("1234-4123-5123-3123","Orgil", LocalDate.now());
        payments.add(ccp);

        PayPalPayment ppp = new PayPalPayment("orgil@gmail.com","1231d123213");
        payments.add(ppp);

        BankTransferPayment btp = new BankTransferPayment("12312321","12312312");
        payments.add(btp);

        for (Payment payment : payments) {
            payment.process();
        }
    }
}
