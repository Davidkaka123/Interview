import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by davidshuvli on 2016/8/26.
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
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        Print(t1);

    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return res;
        }


        Stack<TreeNode> dan = new Stack<>();
        Stack<TreeNode> shuang = new Stack<TreeNode>();
        dan.push(pRoot);
        while (!dan.isEmpty() || !shuang.isEmpty()) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            if (!dan.isEmpty()) {
                while (!dan.isEmpty()) {
                    TreeNode cur = dan.pop();
                    line.add(cur.val);
                    if (cur.left != null) { shuang.push(cur.left); }
                    if (cur.right != null) { shuang.push(cur.right);}
                }
            } else if (! shuang.isEmpty()) {
                while (!shuang.isEmpty()) {
                    TreeNode cur = shuang.pop();
                    line.add(cur.val);
                    if (cur.right != null) { dan.push(cur.right); }
                    if (cur.left != null) {dan.push(cur.left);}
                }
            }
            res.add(line);
        }
        return res;
    }
}
