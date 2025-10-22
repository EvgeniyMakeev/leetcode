import java.util.ArrayDeque;
import java.util.Queue;

public class $111_MinimumDepthOfBinaryTree {

    static void main() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(14);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(1);
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int minDepth = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove();

                if (node.left == null && node.right == null) {
                    return minDepth;
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            minDepth++;
        }

        return minDepth;
    }
}
