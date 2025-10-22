import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class $100_SameTree {

    static void main() {
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(14);
        root1.right = new TreeNode(20);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        root1.left.left.left = new TreeNode(1);

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(14);
        root2.right = new TreeNode(20);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(2);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);
        root2.left.left.left = new TreeNode(1);

        System.out.println(isSameTree(root1, root2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while(!queue.isEmpty()) {
            p = queue.remove();
            q = queue.remove();

            if (p == null && q == null) {
                continue;
            }

            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }

            queue.add(p.left);
            queue.add(q.left);
            queue.add(p.right);
            queue.add(q.right);
        }

        return true;
    }
}
