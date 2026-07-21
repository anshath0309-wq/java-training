public class ShipCapacityCalculator {

    static boolean canShip(int[] weights, int days, int capacity) {

        int current = 0;
        int requiredDays = 1;

        for (int weight : weights) {

            if (current + weight > capacity) {
                requiredDays++;
                current = 0;
            }

            current += weight;
        }

        return requiredDays <= days;
    }

    static int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid))
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};

        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }
}
