public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements might be equal).");
        } else {
            System.out.println("The largest element is: " + largest);
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
