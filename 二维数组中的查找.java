// 从左下角开始遍历， 直至找到tatget元素或者右上角结束。
public class Solution {
    public boolean Find(int target, int [][] array) {
		int height = array.length - 1;
        if (height == -1) {
            return false;
        }
        int column = array[0].length - 1;
        if(column == -1) {
            return false;
        }
        int i = height, j = 0;
        while(true) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                i--;
            } else if (array[i][j] < target) {
                j++;
            }
            if (j > column || i < 0) {
                break;
            }
        }
        return false;
    }
}
