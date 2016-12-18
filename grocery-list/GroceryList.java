public class GroceryList {
  // public static void main(String[] args) {
  //   String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"};
  //   Integer[] eachItemPrices = { 3,6,4,2,4,4};
  //
  //   for ( String eachItem : myGroceryList) {
  //     System.out.println(eachItem);
  //   }
  //
  //   Integer total = 0;
  //   for ( Integer price : eachItemPrices) {
  //     total += price;
  //   }
  //
  //   System.out.println("Your total for this shopping trip will be: $" + total);
  // }
  public static void main(String[] args) {
    String[] myGroceryList = {"eggs", "milk", "bread", "bananas", "cereal", "rice"};

    for ( Integer index = 0; index < myGroceryList.length; index++) {
      System.out.println(myGroceryList[index] );
    }
  }
}
