class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}
public class MaximumPathsumLeaftoleaf {
    int maxsum=Integer.MIN_VALUE;
    public int solve(TreeNode node){
        
        if(node == null){
            return 0;
        }
        int left = solve(node.left);
        int right = solve(node.right);
        if (node.left != null && node.right != null) {
        int currentpath=node.val+left+right;

        maxsum=Math.max(maxsum,currentpath);

        return Math.max(left,right)+node.val;

    }
    return (node.left == null ? right : left) + node.val;
}

    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxsum;
        
        
    }
   
        public static void main(String[] args) {
            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(-2);
            root.right = new TreeNode(7);
            root.left.left = new TreeNode(8);
            root.left.right = new TreeNode(-4);
    
            MaximumPathsumLeaftoleaf tree = new MaximumPathsumLeaftoleaf();
            System.out.println("Max leaf-to-leaf path sum: " + tree.maxPathSum(root));  // Output should be 23
        }
    }
    


