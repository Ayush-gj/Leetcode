class Solution {
    public int sumOfMultiples(int n) {
        // int[] arr = new int[n];
        // int j=0;
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     if(i%3==0 || i%5==0 || i%7==0){
        //         arr[j] = i;
        //         j++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     sum += arr[i];
        // }

        // List<Integer> list = new ArrayList<>();
        // int sum = 0;
        // for(int i=1;i<=n;i++){
        //     if(i%3==0 || i%5==0 || i%7==0){
        //         list.add(i);
        //     }
        // }

        // for(int i=0;i<list.size();i++){
        //     sum += list.get(i);
        // }

        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum += i;
            }
        }
        return sum;
    }
}