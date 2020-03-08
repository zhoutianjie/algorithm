import java.util.LinkedList;
import java.util.Queue;

public class Single {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null || (root.left == null && root.right == null)){
            return sum;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            boolean loop = true;
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node!=null && loop
                        && node.left!=null
                        && node.left.left == null
                        && node.left.right == null){
                    sum+=node.left.val;
                    loop = false;
                }
                if(node!=null && node.left!=null){
                    queue.add(node.left);
                }
                if(node!=null && node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return sum;
    }

}
