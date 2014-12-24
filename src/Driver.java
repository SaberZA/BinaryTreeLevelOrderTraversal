import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sab3r on 2014/12/24.
 */
public class Driver {
    public static void main(String[] args){
        TreeNode binaryTree = CreateTree();
        Solution sol = new Solution();
        LinkedList<LinkedList<Integer>> levels = (LinkedList) sol.levelOrder(binaryTree);

        for (int i = 0; i < levels.size(); i++) {
            for (int j = 0; j < levels.get(i).size(); j++) {
                Integer obj = levels.get(i).get(j);
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }

    private static TreeNode CreateTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(4);

        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);

        return root;
    }
}
