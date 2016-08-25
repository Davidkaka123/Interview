import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by davidshuvli on 2016/8/25.
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
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(8);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        System.out.println(KthNode(t1, 9).val);

    }

    public static TreeNode KthNode(TreeNode pRoot, int k) {
        int count = 0;
        if(count > k || pRoot == null)
            return null;
        TreeNode p = pRoot;
        Stack<TreeNode> LDRStack = new Stack<TreeNode>();
        TreeNode kthNode = null;
        while(p != null || !LDRStack.isEmpty()){
            while(p != null){
                LDRStack.push(p);
                p = p.left;
            }
            TreeNode node = LDRStack.pop();
            System.out.print(node.val+",");
            count++;
            if(count == k){
                kthNode = node;
            }
            p = node.right;
        }
        return kthNode;

    }
}
