import java.util.*;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> answer = new LinkedList<>();
        for (int[] person : people) {
            answer.add(person[1], person);
        }

        return answer.toArray(new int[answer.size()][]);
    }
}