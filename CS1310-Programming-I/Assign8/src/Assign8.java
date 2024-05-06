public class Assign8 {

    private static int[][] intar = {
            {10, 13, 26, 34, 60, 90},
            {25, 46, 57, 88, 77, 91},
            {29, 30, 41, 52, 82, 92}
    };

    // Method to print the array as is
    public static void printArrayAsIs() {
        for (int i = 0; i < intar.length; i++) {
            for (int j = 0; j < intar[i].length; j++) {
                System.out.print(intar[i][j] + " ");
            }
        }
    }

    // Method to print the array column-wise
    public static void printArrayColumnWise() {
        for (int j = 0; j < intar[0].length; j++) {
            for (int i = 0; i < intar.length; i++) {
                System.out.print(intar[i][j] + " ");
            }
        }
    }

    // Method to print the sum of differences
    public static void sumDifference() {
        int sum = 0;
        boolean add = true;
        for (int i = 0; i < intar.length; i++) {
            for (int j = 0; j < intar[i].length; j++) {
                if (add) {
                    sum += intar[i][j];
                } else {
                    sum -= intar[i][j];
                }
                add = !add;
            }
        }
        System.out.println("Sum of differences: " + sum);
    }
    

    // Main method
    public static void main(String[] args) {
        System.out.println("Printing array as is:");
        printArrayAsIs();
        System.out.println("\n\nPrinting array column-wise:");
        printArrayColumnWise();
        System.out.println("\n\nCalculating sum of differences:");
        sumDifference();
    }
}
