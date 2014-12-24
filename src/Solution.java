/**
 * Created by Sab3r on 2014/12/24.
 */

import java.util.*;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> allLevels = new LinkedList<List<Integer>>();

        breadth(root,allLevels);
        return allLevels;
    }

    private void breadth(TreeNode root, LinkedList<List<Integer>> allLevels) {
        if (root == null) return;
        int currentLevel = 0;
        Queue<Kvp> queue = new LinkedList<Kvp>();
        queue.add(new Kvp(root,currentLevel));
        while(!queue.isEmpty()){
            Kvp kvp = queue.remove();
            currentLevel = kvp.Level;
            if (currentLevel > allLevels.size()-1){
                allLevels.add(new LinkedList<Integer>());
            }
            allLevels.get(currentLevel).add(kvp.Node.val);

            if(kvp.Node.left != null) {
                queue.add(new Kvp(kvp.Node.left, currentLevel+1));
            }
            if (kvp.Node.right != null) {
                queue.add(new Kvp(kvp.Node.right,currentLevel+1));
            }
        }
    }

    class Kvp
    {
        public TreeNode Node;
        public int Level;

        public Kvp(TreeNode node, int level) {
            Node = node;
            Level = level;
        }
    }

}
