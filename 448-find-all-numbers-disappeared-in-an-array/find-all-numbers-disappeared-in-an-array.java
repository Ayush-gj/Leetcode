class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        // for(int x : nums){
        //     set.add(x);
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        boolean[] seen = new boolean[nums.length+1];
        for(int x : nums){
            seen[x] = true;
        }
        for(int i = 1; i <= nums.length; i++){
            if(seen[i] == false){
                list.add(i);
            }
        }
        return list;
    }
}