import util.TreeNode;

public class LowestCommonAncestorBST {

    // O(log(n))
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        int lv = p.val;
        int rv = q.val;
        
        if (lv > rv){
            int tmp = rv;
            rv = lv;
            lv = tmp;
        }
        // lv is smaller than rv
        // BST property guarantee LCA between two node
        while (root.val < lv || root.val > rv){
            if (root.val < lv){
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return root;
    }
}
