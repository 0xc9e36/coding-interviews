public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return isPostOrder(sequence, 0, sequence.length - 1);
    }
    
    public boolean isPostOrder(int [] sequence, int left, int right) {
        if(left >= right) {
            return true;
        }
        int root = sequence[right];
        int i = left;
        while(i < right && sequence[i] < root) {
            i++;
        }
        int j = i;
        boolean leftOrder = isPostOrder(sequence, left, i - 1);
        while(i < right && sequence[i] > root) {
            i++;
        }
        if (i < right) {
            return false;
        }
        boolean rightOrder = isPostOrder(sequence, j, right - 1);
        return leftOrder && rightOrder;
    }
}
