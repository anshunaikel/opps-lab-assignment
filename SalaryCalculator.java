import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take basic pay as input
        System.out.print("Enter the basic pay of the employee: ");
        double basic = sc.nextDouble();

        // Calculate AGP (50% of basic)
        double agp = 0.5 * basic;

        // Calculate merged basic
        double mergedBasic = basic + agp;

        // Calculate DA (50% of merged basic)
        double da = 0.5 * mergedBasic;

        // Calculate HRA (15% of merged basic)
        double hra = 0.15 * mergedBasic;

        // Calculate total salary
        double totalSalary = mergedBasic + da + hra;

        // Display result
        System.out.println("Total Salary of the Employee = " + totalSalary);

        sc.close();
    }
}

