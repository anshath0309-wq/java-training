public class SwapTwoVariables {
    public static void main(String[] args) {
        // Method 1: Using a temporary variable
        int a = 10;
        int b = 20;
        System.out.println("Before Swap (Using Temp): a = " + a + ", b = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (Using Temp): a = " + a + ", b = " + b);
        
        System.out.println("----------------------------------------");
        
        // Method 2: Without using a temporary variable (Arithmetic)
        int x = 15;
        int y = 25;
        System.out.println("Before Swap (Without Temp): x = " + x + ", y = " + y);
        
        x = x + y; // x becomes 40
        y = x - y; // y becomes 15
        x = x - y; // x becomes 25
        System.out.println("After Swap (Without Temp): x = " + x + ", y = " + y);
    }
}
