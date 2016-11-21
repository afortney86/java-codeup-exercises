/**
 * Created by anthonyfortney on 11/21/16.
 *
 * Implement the JS exercise using Java enums, instead of numbers,
 use colors. Use an enum for the colors.

 If your lucky color is red you have no discount,
 if your lucky color is blue you'll get a 10% discount,
 if it's yellow, discount is 25%,
 if it's green, discount is 35%,
 if it's purple, 50%, and
 if it's pink you'll get all for free!.

 Ask for the original amount to pay, then show the total amount to pay
 after the discount.

 The enum should have a property `discountPercentage` and a method
 `applyDiscount(double payment)`. For instance:

 `Color.RED.applyDiscount(payment);`

 Repeat this process if there are more customers.

 -->Ryan's solution<--
 */

public enum LuckyColor {
    RED(0.0), BLUE(.10), YELLOW(.25), GREEN(.35), PURPLE(.50), PINK(1.0);

    private final double discount;

    LuckyColor(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double payment) {
        double totalDiscount;
        totalDiscount = payment * this.discount;
        return totalDiscount;
    }
}

//public enum LuckyColor {
//    RED(0), BLUE(.10), YELLOW(.25), GREEN(.35), PURPLE(.5), PINK(1);
//
//   LuckyColor(float value){
//   }
//}


