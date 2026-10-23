class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long n = x;

        long low = 1, high = n / 2;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            
            if (mid * mid == x) {
                return (int)mid;
            } else if (mid * mid < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return (int)high;
    }
}