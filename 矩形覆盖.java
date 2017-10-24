public class Solution {
    public int RectCover(int target) {
		if(target <= 2) {
            return target;
        }
        int[] f = new int[target + 1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        for(int i = 3; i <= target; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[target];
    }
}
