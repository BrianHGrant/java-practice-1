import java.io.Console;

public class Subtract {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter number to subtract from:");
    Integer firstNum = Integer.parseInt(myConsole.readLine());
    System.out.println("First number is: " + Integer.toString(firstNum) + ". Enter number to subtract:");
    Integer secondNum = Integer.parseInt(myConsole.readLine());
    Integer totalNum = firstNum - secondNum;
    System.out.println("Subtracting " + Integer.toString(secondNum) + " from " + Integer.toString(firstNum) + " equals: " + Integer.toString(totalNum));
  }
}
