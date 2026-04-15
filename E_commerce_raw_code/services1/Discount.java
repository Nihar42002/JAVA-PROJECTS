package E_commerce_raw_code.services1;

public class Discount {
    String code;
    double percent;
    double minPurchase;


    public Discount(String code, double percent, double minPurchase) {
        this.code = code;
        this.percent = percent;
        this.minPurchase = minPurchase;
    }

    public boolean isApplicable(String inputCode, double total) {
       return code.equalsIgnoreCase(inputCode) && total >= minPurchase;
    }
 public double apply(double total) {
        return total * percent / 100;
    }
}
