public class SimpleIntroProblems {
    public static void main(String[] args) {
        System.out.println("=== Simple Intro Problems & Pre-Assessment ===");

        // 1. Calculate sum and average of three numbers
        int num1 = 15, num2 = 25, num3 = 35;
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("----------------------------------------------");

        // 2. Convert Celsius to Fahrenheit introductory problem
        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        System.out.println("----------------------------------------------");

        // 3. Simple rectangle area calculation
        double length = 10.5;
        double width = 4.2;
        double area = length * width;
        System.out.println("Rectangle Length: " + length + ", Width: " + width);
        System.out.println("Area of Rectangle: " + area);
    }
}
