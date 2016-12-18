import java.io.Console;

public class LeapYear {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Find out how many leap years have occured since you were born.");
    System.out.println("Please enter your birth year:");
    int birthYear = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter current year:");
    int currentYear = Integer.parseInt(myConsole.readLine());
    int leapYearCount = calculateLeapYears(birthYear, currentYear);
    System.out.println("The total leap years between your birth year and now are: " + leapYearCount);
  }

  public static int calculateLeapYears(int birthYear, int currentYear) {
    Integer leapYearCount = 0;
    for (int i = birthYear; i<= currentYear; i++) {
      if ((i % 4) == 0) {
        leapYearCount ++;
      }
    }
    return leapYearCount;
  }
}
