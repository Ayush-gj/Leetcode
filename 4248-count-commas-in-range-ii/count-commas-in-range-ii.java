class Solution {
    public long countCommas(long n) {
        long count = 0;
        long m = 1000;
        while(m <= n){
            count += n - m + 1;
            m *= 1000;
        }
        return count;
    }
}