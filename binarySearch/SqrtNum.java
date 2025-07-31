class SqrtNum {
    static int floorSqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1, end = x, ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            // If mid*mid == x, return mid
            if (mid == x / mid)  // Avoids overflow
                return mid;

            // If mid*mid < x, move to right half
            if (mid < x / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                // Else move to left half
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.println(floorSqrt(x));  // Output: 3
    }
}

