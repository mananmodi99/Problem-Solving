package LeetcodeProblems.Trees.BST;

import javax.swing.tree.TreeNode;

public class LCAofBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        if((p.val>root.val && q.val<root.val) || (p.val<root.val && q.val>root.val)){
            return root;
        }
        if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left, p, q);
        }

        return null;
    }
}
