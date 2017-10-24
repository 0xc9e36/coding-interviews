public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return dfs(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    /*
     * pre：1 2 4 7 3 5 6 8
     * in：4 7 2 1 5 3 8 6
     *
     */
    public TreeNode dfs(int[] pre, int pre_start, int pre_end, int[] in, int in_start, int in_end) {
        if (pre_start > pre_end) {
            return null;
        }
        int val = pre[pre_start];
        TreeNode x = new TreeNode(val);
        int start = in_start;
        while(start <= in_end && in[start] != val) {
            start++;
        }
        x.left = dfs(pre, pre_start + 1, pre_start + start - in_start, in, in_start, start - 1);
        x.right = dfs(pre, pre_start + start - in_start + 1, pre_end, in, start + 1, in_end);
        return x;
    }
}
