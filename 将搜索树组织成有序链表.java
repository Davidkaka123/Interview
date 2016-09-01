
/**
 * Created by davidshuvli on 2016/9/1.
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

    public static TreeNode leftLast = null;

    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            leftLast = pRootOfTree;//最后一个节点可能为最右侧的叶子节点
            return pRootOfTree;
        }
        //将左子树构造成双链表，并返回链表头结点
        TreeNode left = Convert(pRootOfTree.left);
        //如果左子树链表不为空，将当前root追加到左子树链表
        if (left != null) {
            pRootOfTree.left = leftLast;
            leftLast.right = pRootOfTree;
        }
        //当根节点只含左子树时，则该根节点为最后一个节点
        leftLast = pRootOfTree;
        //将右子树构造成双链表，并返回链表头结点
        TreeNode right = Convert(pRootOfTree.right);
        //如果右子树不为空，将该链表追加到root节点之后
        if (right != null) {
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }

        if (left != null) {
            return left;
        } else {
            return pRootOfTree;
        }
    }

}
