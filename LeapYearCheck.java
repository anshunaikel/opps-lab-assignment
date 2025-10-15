import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year as input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check leap year using conditional operator
        String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                        ? "Leap Year"
                        : "Not a Leap Year";

        // Display result
        System.out.println(year + " is a " + result);

        sc.close();
    }
}

