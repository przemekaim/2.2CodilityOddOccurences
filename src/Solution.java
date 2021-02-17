import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        var solution = new Solution();
        int[] abc = {9,3,9,3,9,7,9,9999999};
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
    }
}
