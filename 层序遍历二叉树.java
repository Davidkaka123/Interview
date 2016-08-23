import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by davidshuvli on 2016/8/23.
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
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) return res;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> line = new ArrayList<Integer>();
        queue.add(pRoot);
        int start = 0;
        int end = 1;
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.remove();
            line.add(tmp.val);
            start ++;
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
            if (start == end) {
                res.add(line);
                end = queue.size();
                start = 0;
                line = new ArrayList<Integer>();
            }
        }
        return res;
    }
}
