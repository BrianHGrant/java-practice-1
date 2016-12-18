import java.io.Console;

public class Divide {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter number to Divide:");
    Integer firstNum = Integer.parseInt(myConsole.readLine());
    System.out.println("First number is: " + Integer.toString(firstNum) + ". Enter number to divide by:");
    Integer secondNum = Integer.parseInt(myConsole.readLine());
    Integer totalNum = firstNum / secondNum;
    System.out.println("Dividing " + Integer.toString(firstNum) + " by " + Integer.toString(secondNum) + " equals: " + Integer.toString(totalNum));
  }
}
