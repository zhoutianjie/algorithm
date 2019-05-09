import bean.TreeNode;

/**
 * 二叉树相关练习题
 */
public class BinaryTree {

    public int maxDepth(TreeNode root){
        if(null == root){
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return Math.max(lh,rh)+1;
    }

    /**
     * 翻转二叉树
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
      if(null == root){
          return null;
      }
      inverse(root);
      return root;
    }

    private void inverse(TreeNode root){
        if(null == root.left && null == root.right){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if(null!=root.left){
            inverse(root.left);
        }
        if(null!=root.right){
            inverse(root.right);
        }
    }

    /**
     * 单值二叉树判断(所有的结点值一样)
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNode root) {
        if(null == root){
            return false;
        }
        return isUnival(root,root.val);
    }

    private boolean isUnival(TreeNode root,int val){
        if(val!=root.val){
            return false;
        }else {
            if(root.left == null && root.right!=null){
                return isUnival(root.right,val);
            }else if(root.left == null && root.right == null){
                return true;
            }else if(root.left != null && root.right == null){
                return isUnival(root.left,val);
            }else {
                return isUnival(root.left,val)&&isUnival(root.right,val);
            }
        }
    }

    /**
     * 判断是否是平衡二叉树(左右子树的高度差不能超过1)
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return isBalancedTree(root);
    }


    private boolean isBalancedTree(TreeNode root){

        if(root.left == null){
            return getHeight(root.right)<=1;
        }

        if(root.right == null){
            return getHeight(root.left)<=1;
        }

        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        int abs = Math.abs(lh-rh);
        if(abs>1){
            return false;
        }else {
            return isBalancedTree(root.left) && isBalancedTree(root.right);
        }
    }

    /**
     * 求树的高度
     * @param root
     * @return
     */
    private int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh,rh)+1;
    }

    /**
     * 对称二叉树
     */

    public boolean isSymmetric(TreeNode root){
       if(null == root){
           return true;
       }
       return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode left,TreeNode right){
        if(left == null) return right == null;
        if(right == null)return left == null;

        return left.val == right.val
                && isMirror(left.left,right.right)
                && isMirror(left.right,right.left);
    }

    /**
     * 最小深度
     */

}
