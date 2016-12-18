import java.io.Console;

public class Multiply {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter first of two numbers to Multiply:");
    Integer firstNum = Integer.parseInt(myConsole.readLine());
    System.out.println("First number is: " + Integer.toString(firstNum) + ". Enter Second of two numbers to Multiply:");
    Integer secondNum = Integer.parseInt(myConsole.readLine());
    Integer totalNum = firstNum * secondNum;
    System.out.println("Multiplying " + Integer.toString(firstNum) + " by " + Integer.toString(secondNum) + " equals: " + Integer.toString(totalNum));
  }
}
