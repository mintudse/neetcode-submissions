/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }

 Test:
 empty tree,
 unbalanced tree
 balanced tree
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return root;
        }
        // root -> 1
        else{
            // tmp_left -> null
            TreeNode tmp_left = root.left;
            // tmp_right -> null
            TreeNode tmp_right = root.right;
            // root.left -> null
            root.left = tmp_right;
            // root.right -> null
            root.right = tmp_left;
            // null
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
