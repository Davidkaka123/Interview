
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
            leftLast = pRootOfTree;//���һ���ڵ����Ϊ���Ҳ��Ҷ�ӽڵ�
            return pRootOfTree;
        }
        //�������������˫��������������ͷ���
        TreeNode left = Convert(pRootOfTree.left);
        //�������������Ϊ�գ�����ǰroot׷�ӵ�����������
        if (left != null) {
            pRootOfTree.left = leftLast;
            leftLast.right = pRootOfTree;
        }
        //�����ڵ�ֻ��������ʱ����ø��ڵ�Ϊ���һ���ڵ�
        leftLast = pRootOfTree;
        //�������������˫��������������ͷ���
        TreeNode right = Convert(pRootOfTree.right);
        //�����������Ϊ�գ���������׷�ӵ�root�ڵ�֮��
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
