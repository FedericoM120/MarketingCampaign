public class Customer {
    private double purchases;
    private int total;
    private int discountTracker;

    public Customer() {
    }

    public void makePurchase(double amount) {
        if (discountReached()){
            purchases = amount - 10;
        } else {
            purchases = amount;
        }
        total += purchases;
        discountTracker += purchases;
    }

    public boolean discountReached() {
        if (total > 100) {
            discountTracker = 0;
            return true;
        }
        return false;
    }

    public double returnBill() {
        return total;
    }
}
