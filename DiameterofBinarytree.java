// import javax.swing.tree.TreeNode;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}
public class DiameterofBinarytree{
    int diameter=0;
    public  int solve(TreeNode node){
    
        if(node == null){
            return 0;
        }
        int left = solve(node.left);
        int right = solve(node.right);

        diameter=Math.max(diameter,left+right);

        return Math.max(left,right)+1;

    }
    public  int diameterBinarytree(TreeNode root) {
        solve(root);
        return diameter;
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterofBinarytree tree = new DiameterofBinarytree();
        System.out.println("Diameter: " + tree.diameterBinarytree(root)); // Output: 3
    }
}

