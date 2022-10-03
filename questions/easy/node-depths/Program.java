class Program {
	static int totalSum;

  public static int nodeDepths(BinaryTree root) {
		totalSum=0;
		sumDepths(root,0);
    return totalSum;
  }
  public static void sumDepths(BinaryTree node,int depth) {
    if(node==null){return;}
		totalSum+=depth;
		sumDepths(node.left,depth+1);
		sumDepths(node.right,depth+1);
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
