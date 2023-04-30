public class Main {
    public static void main(String[] args) {
        Customer federico = new Customer();
        federico.makePurchase(50);
        federico.makePurchase(60);
        System.out.println(federico.returnBill()); // should output 100.0
        System.out.println(federico.discountReached()); // should output true
        federico.makePurchase(90);
        System.out.println(federico.returnBill()); // should output 180.0
        System.out.println(federico.discountReached()); // should output false
        federico.makePurchase(20);
        System.out.println(federico.returnBill()); // should output 190.0
        System.out.println(federico.discountReached()); // should output true
        federico.makePurchase(80);
        System.out.println(federico.returnBill()); // should output 260.0
        System.out.println(federico.discountReached()); // should output false
        federico.makePurchase(30);
        System.out.println(federico.returnBill()); // should output 260.0
        System.out.println(federico.discountReached()); // should output false
    }
}
