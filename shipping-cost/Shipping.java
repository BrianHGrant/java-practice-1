import java.io.Console;

public class Shipping {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Thanks for shipping with All-Ship. What is your package weight in oz?");
    Double packageWeight = Double.parseDouble(myConsole.readLine());
    System.out.println("How far are you shipping in miles?");
    Double distanceToTravel = Double.parseDouble(myConsole.readLine());
    System.out.println("Vetern? (true/false)");
    boolean veternStatus = Boolean.parseBoolean(myConsole.readLine());
    System.out.println(veternStatus);
    System.out.println("Over 65? (true/false)");
    boolean seniorStatus = Boolean.parseBoolean(myConsole.readLine());
    Double discount = 0.0;
    discount = calculateDiscount(veternStatus, discount);
    discount = calculateDiscount(seniorStatus, discount);
    calculateShipping(packageWeight, distanceToTravel, discount);
  }

  public static double calculateDiscount(boolean discountCode, Double discount) {
    if (discountCode == true) {
      discount = discount + 0.1;
    }
    return discount;
  }

  public static void calculateShipping(Double packageWeight, Double distanceToTravel, Double discount) {
    Double shippingCost = packageWeight / 10 + distanceToTravel / 5;
    shippingCost = shippingCost - shippingCost * discount;
    System.out.println("Your final shipping cost, including your discount of " + (discount*100) + "% is: $" + shippingCost + ".");
  }

}
