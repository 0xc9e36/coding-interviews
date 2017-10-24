import java.util.ArrayList;
public class Solution {

    /**
     * 3 4 5 1 2
     * @param array
     * @return
     */
    public int minNumberInRotateArray(int [] array) {
        int lo = 0, hi = array.length - 1;
        int res = 0;
        while(lo <= hi) {
            if(lo + 1 == hi) {
                res = array[hi];
                break;
            }
            int mid = lo + (hi - lo) / 2;
            if(array[mid] == array[lo] && array[lo] == array[hi]) {
                res = min(array);
            }
            if (array[mid] < array[lo]) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        return res;
    }

    public int min(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; ++i) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
}
