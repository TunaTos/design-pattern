package creation.factory_method.excercise;

interface Payment {
    void processPayment(int amount);
    String getPaymentInfo();
}

class CreditCardPayment implements Payment {

    private final String paymentMethod = "신용카드";

    @Override
    public void processPayment(int amount) {
        System.out.println(paymentMethod + "로 " + amount + "원 결제 완료");
    }

    @Override
    public String getPaymentInfo() {
        return paymentMethod;
    }
}

class KakaoPayPayment implements Payment {
    private final String paymentMethod = "카카오페이";
    
    @Override
    public void processPayment(int amount) {
        System.out.println(paymentMethod + "로 " + amount + "원 결제 완료");
    }

    @Override
    public String getPaymentInfo() {
        return paymentMethod;
    }
}

class NaverPayPayment implements Payment {

    private final String paymentMethod = "네이버페이";

    @Override
    public void processPayment(int amount) {
        System.out.println(paymentMethod + "로 " + amount + "원 결제 완료");
    }

    @Override
    public String getPaymentInfo() {
        return paymentMethod;
    }
}

abstract class PaymentFactory {

    abstract Payment createPayment();

    public void  planPayment() {
        Payment payment = createPayment();
        System.out.println("결제 수단은 " + payment.getPaymentInfo());
        payment.processPayment(1000);
    }
}

class CreditCard extends PaymentFactory {
    @Override
    Payment createPayment() {
        return new CreditCardPayment();
    }
}
class Kakao extends  PaymentFactory {
    @Override
    Payment createPayment() {
        return new KakaoPayPayment();
    }
}

class Naver extends PaymentFactory {
    @Override
    Payment createPayment() {
        return new NaverPayPayment();
    }
}


public class BankTest {
    public static void main(String[] args) {
        PaymentFactory payment;
        payment = new Naver();
        payment.planPayment();
    }
}
