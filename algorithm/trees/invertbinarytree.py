
from  util.treenode import TreeNode

# Time complexity : O(n)
# Space complexity : O(1)

class InvertBinaryTree:

    # @param {TreeNode} root
    # @return {TreeNode}

    def invertTree(self, root):
        if not root:
            return None
        else:
            # invert each part of tree for each one
            root.left, root.right = \
                Solution.invertTree(self, root.right), \
                Solution.invertTree(self, root.left)
            return root

