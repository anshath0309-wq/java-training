public class GuessNumberGame {

    static int picked = 6; // Assume the picked number is 6

    static int guess(int num) {
        if (num == picked) return 0;
        if (num > picked) return -1;
        return 1;
    }

    static int guessNumber(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = guess(mid);

            if (result == 0)
                return mid;
            else if (result < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
