public class Customer {
    private double purchases;
    private double total;
    private int discountTracker;

    public Customer() {
    }                       //50+60 = 110 - 10 = 100 THEN 100 + 90 = 190 THEN 190 + 20 = 210 - 10 =200

    public void makePurchase(double amount) {
        total += amount;
        discountTracker += amount;
        if (discountReached()){
            total = total - 10;
        }

    }

    public boolean discountReached() {
        if (discountTracker > 100) {
            discountTracker = 0;
            return true;
        }
        return false;
    }

    public double returnBill() {

        return total;
    }
}
