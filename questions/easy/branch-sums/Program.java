import java.util.ArrayList;
import java.util.List;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    return calculateSum(root,0,new ArrayList<Integer>());
    
  }
	private static List<Integer> calculateSum(BinaryTree node,int sum,List<Integer> res){
		sum+=node.value;
		if(node.left==null && node.right==null){
			res.add(sum);
		}else{
			if(node.left!=null){
				res=calculateSum(node.left, sum,res);
			}
			if(node.right!=null){
				res=calculateSum(node.right, sum,res);
			}
		}
		return res;
	}
}
