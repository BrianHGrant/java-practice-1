import java.io.Console;

public class Add {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter first of two numbers to add:");
    Integer firstNum = Integer.parseInt(myConsole.readLine());
    System.out.println("First number is: " + Integer.toString(firstNum) + ". Enter Second of two numbers to add:");
    Integer secondNum = Integer.parseInt(myConsole.readLine());
    Integer totalNum = firstNum + secondNum;
    System.out.println("Adding " + Integer.toString(firstNum) + " to " + Integer.toString(secondNum) + " equals: " + Integer.toString(totalNum));
  }
}
