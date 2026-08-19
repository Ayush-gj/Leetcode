class Solution {

    static int solve(int n , int[] dp){
        if(n <= 2) return n;

        if(dp[n] != -1){
            return dp[n];
        }

        int first = solve(n - 1 , dp);
        int second = solve(n - 2 , dp);

        dp[n] = first + second;

        return dp[n];
    }

    public int climbStairs(int n) {
        // if(n<=2) return n;
        // int first=1,second=2,third=0;
        // for(int i=3;i<=n;i++){
        //     third=first+second;
        //     first=second;
        //     second=third;
        // }
        // return third;
        int[] dp = new int[n + 1];
        Arrays.fill(dp , -1);

        return solve(n , dp);
    }
}