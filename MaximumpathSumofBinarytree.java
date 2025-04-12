class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}
public class MaximumpathSumofBinarytree {
    int maxsum=Integer.MIN_VALUE;
    public int solve(TreeNode node){
        
        if(node == null){
            return 0;
        }
        int left = Math.max(solve(node.left),0);
        int right = Math.max(solve(node.right),0);

        int currentpath=node.val+left+right;

        maxsum=Math.max(maxsum,currentpath);

        return Math.max(left,right)+node.val;

    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxsum;
        
        
    }
   
        public static void main(String[] args) {
            TreeNode root = new TreeNode(-10);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);
    
            MaximumpathSumofBinarytree mps = new MaximumpathSumofBinarytree();
            System.out.println("Maximum Path Sum: " + mps.maxPathSum(root)); // Should print 42
        }
    }
    

    



