import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class $637_AverageOfLevelsInBinaryTree {
    static void main() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(14);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(3);
        System.out.println(averageOfLevels(root));
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root != null) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            System.out.println(root);
            queue.add(root);

            while (!queue.isEmpty()) {
                long lavelSize = queue.size();
                System.out.println(lavelSize);
                long lavelSum = 0L;

                for (int i = 0; i < lavelSize; i++) {
                    TreeNode node = queue.remove();
                    lavelSum += node.val;

                    if (node.left != null) {
                        System.out.println(node.left);
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        System.out.println(node.right);
                        queue.add(node.right);
                    }
                }

                result.add((double) lavelSum / lavelSize);
            }
        }

        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      @Override
      public String toString() {
          return "TreeNode{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
      }
}
