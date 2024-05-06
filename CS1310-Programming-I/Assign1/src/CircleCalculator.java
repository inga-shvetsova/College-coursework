public class CircleCalculator {
    public static void main(String[] args) {
        double radius = 5.5;
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("The area for a circle with a radius of " + radius + " is " + area);
        System.out.println("The circumference for a circle with a radius of " + radius + " is " + circumference);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}


