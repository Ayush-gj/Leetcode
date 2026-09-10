class Solution {
    public int reverse(int x) {
        long n=0;
        while(x!=0){
            int z=x%10;
            n=n*10+z;
            x/=10;
        }
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE) {
            return 0;
        }
        return (int)n; 
    }
}