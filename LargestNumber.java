import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take three numbers as input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Find largest using conditional operator
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        // Display result
        System.out.println("The largest number is: " + largest);

        sc.close();
    }
}
