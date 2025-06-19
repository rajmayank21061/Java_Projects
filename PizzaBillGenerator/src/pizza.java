public class pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 59;
    private int extraToppingPrice = 69;
    private int backPackPrice = 29;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isBackPackAdded = false;

    public pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 500;
        }
        this.basePizzaPrice = this.price;
    }

    public void getPizzaPrice() {
        System.out.println(this.price);
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraTopping() {
        isExtraToppingAdded = true;
        this.price += extraToppingPrice;
    }

    public void addBackPack() {
        isBackPackAdded = true;
        this.price += backPackPrice;
    }

    public void totalBill() {
        String bill = "The base pizza price: " + basePizzaPrice + "\n";

        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingAdded) {
            bill += "Extra Topping Added: " + extraToppingPrice + "\n";
        }
        if (isBackPackAdded) {
            bill += "Back Packing Added: " + backPackPrice + "\n";
        }
        bill += "Total Price/Bill: " + this.price;
        System.out.println(bill);
    }
}
