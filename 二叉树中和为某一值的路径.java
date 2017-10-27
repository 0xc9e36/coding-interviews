import java.util.ArrayList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        dfs(root, target, new ArrayList(), res);
        return res;
    }
    
    public void dfs(TreeNode root, int target, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res) {
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null) {
            if(target == root.val) {
                list.add(root.val);
                res.add(new ArrayList(list));
            }
            return ;
        }
        list.add(root.val);
        ArrayList<Integer> temp = new ArrayList<>(list);
        dfs(root.left, target - root.val, list, res);
        dfs(root.right, target - root.val, temp, res);      
    }
}
