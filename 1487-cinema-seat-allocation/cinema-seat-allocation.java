import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            if (!map.containsKey(row)) {
                map.put(row, new HashSet<>());
            }
            map.get(row).add(seat[1]);
        }

        int maxCount = 0;
        for (Set<Integer> reserved : map.values()) {
            boolean left = !(reserved.contains(2) || reserved.contains(3) || reserved.contains(4) || reserved.contains(5));
            boolean middle = !(reserved.contains(4) || reserved.contains(5) || reserved.contains(6) || reserved.contains(7));
            boolean right = !(reserved.contains(6) || reserved.contains(7) || reserved.contains(8) || reserved.contains(9));

            if (left && right) {
                maxCount += 2;
            } else if (left || middle || right) {
                maxCount += 1;
            }
        }
        maxCount += (n - map.size()) * 2;

        return maxCount;
    }
}
