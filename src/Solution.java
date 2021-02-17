import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        var solution = new Solution();
        int[] abc = {9,3,9,3,9,7,9};
        System.out.println(solution.solution2(abc));
    }


    public int solution (int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i : A) {
            if(set.contains(i))
                set.remove(i);
            else
                set.add(i);
        }

        for (Integer integer : set) {
            return integer;
        }
        return 0;

/*        int element = 0;
        for (int i = 0; i < A.length; i++) {
            element ^= A[i];
        }
        return element;*/
    }

    public int solution2(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length-2; i+=2) {
            if (A[i] != A[i+1])
                return A[i];
        }
        return A[A.length-1];
    }

    public int solution3(int[] A) {
        int element = 0;
        for (int j : A) {
            element ^= j;
        }
        return element;
    }
}
