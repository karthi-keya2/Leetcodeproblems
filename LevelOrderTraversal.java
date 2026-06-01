import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LevelOrderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List< Integer >> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelsize);

            for(int i=0;i<levelsize;i++){
                TreeNode currentnode = queue.poll();
                currentlevel.add(currentnode.val);

                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }

                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            }
            result.add(currentlevel);
        }
        return result;
    }
    public static void main(String[] args) {

    LevelOrderTraversal obj = new LevelOrderTraversal();
    


    LevelOrderTraversal.TreeNode root = obj.new TreeNode(3);

    root.left = obj.new TreeNode(9);
    root.right = obj.new TreeNode(20);

    root.right.left = obj.new TreeNode(15);
    root.right.right = obj.new TreeNode(7);

    List<List<Integer>> result = obj.levelOrder(root);

    System.out.println(result);
}
}