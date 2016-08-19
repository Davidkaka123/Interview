/**
 * Created by davidshuvli on 2016/8/19.
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Main {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) return true;
        return checkTree(pRoot.left, pRoot.right);

    }

    public static boolean checkTree(TreeNode left, TreeNode right) {
        if (left == null) {
            return right == null;
        }
        if (right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return checkTree(left.left, right.right) && checkTree(left.right, right.left);
    }
}
