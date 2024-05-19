package strategyPattern;

public class ApplyDiscount {
    DiscountStrategy discountStrategyObj;
    ApplyDiscount(DiscountStrategy discountStrategyObj) {
        this.discountStrategyObj= discountStrategyObj;
    }
    public void giveDiscount() {
        discountStrategyObj.giveDiscount();
    }
    public void setStrategy(DiscountStrategy newDiscountStrategyObj) {
        this.discountStrategyObj=newDiscountStrategyObj;
    }
}
