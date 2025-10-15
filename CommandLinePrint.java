public class CommandLinePrint {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide text as command line arguments.");
        } else {
            // Print all arguments in one line
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
            }
        }
    }
}

