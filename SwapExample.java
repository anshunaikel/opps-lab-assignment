public class SwapExample {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // --- Swapping using a third variable ---
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping (using third variable):");
        System.out.println("a = " + a + ", b = " + b);

        // --- Swapping without using a third variable ---
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping (without using third variable):");
        System.out.println("a = " + a + ", b = " + b);
    }
}

