class Program {
	public static int closest;
  public static int findClosestValueInBst(BST root, int target) {
		closest=root.value;
		solution(root,target);
		return closest;
		
  }
	private static int solution(BST tree, int target){
		if(Math.abs(target-tree.value)<Math.abs(target-closest)){
			closest=tree.value;
		}
		
		if(target==tree.value){
			return target;
		}else if(target>tree.value){
			if(tree.right!=null){
				return solution(tree.right,target);
			}else{
				return tree.value;
			}
		}else if(target<tree.value){
			if(tree.left!=null){
				return solution(tree.left,target);
			}else{
				return tree.value;
			}
		}
    return -1;
	}
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
