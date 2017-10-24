import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> map = new HashMap<>();

    /**
     * 空间换时间
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target == 1) {
            return 1;
        }
        if(map.containsKey(target)) {
            return map.get(target);
        }
        int sum = 0;
        for(int n = 1; n < target; n++) {
            int val = JumpFloorII(n);
            map.put(n, val);
            sum += val;
        }
        return sum + 1;
    }
}
