package strategyPattern;

public class Main {
    public static void main(String[] args) {
        ApplyDiscount applyDiscountObj = new ApplyDiscount(new CashbackDiscount());
        applyDiscountObj.giveDiscount();

        applyDiscountObj.setStrategy(new FlatDiscount());
        applyDiscountObj.giveDiscount();
    }
}
