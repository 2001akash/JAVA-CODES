//Encapsulation

//Encapsulation is a practice of defining the access of class members.
//Enacpsualtion Help us Exposoe Data Members and Functions to right security level.
//Encalsulation is practiced by using acccess modifiers ,getters &setters.
class PhonePay {
    private float serviceCharge = .05f;// here is a problrm .this variable isn't secured.any one can change the value.

    float getServiceCharge() {
        return serviceCharge;
    }

    void setServiceCharge(float newCharge) {
        if (newCharge < .05f) {
            System.out.println("ouch! Service Charge cannot be less than 5%");
            return;
        }
        serviceCharge = newCharge;
    }
}

class Customer {
    void pay(int bill) {
        PhonePay phonePay = new PhonePay();
        phonePay.setServiceCharge(.01f);
        float phonePayCharge = bill * phonePay.getServiceCharge();
        float finalAmount = bill + phonePayCharge;
        System.out
                .println(String.format("BILL %s , PhonePay Service Charge %s , final Amount %s ", bill, phonePayCharge,
                        finalAmount));
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Customer akash = new Customer();
        akash.pay(200);
    }
}
