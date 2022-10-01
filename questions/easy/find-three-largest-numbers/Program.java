class Program {
  public static int[] findThreeLargestNumbers(int[] array) {
	int[] solutions=new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
	for(int val:array){
		if(val<=solutions[0]){continue;}
		if(val>solutions[0] && val<=solutions[1]){
			solutions[0]=val;
		}
		else if(val>solutions[1] && val<=solutions[2]){
			solutions[0]=solutions[1];
			solutions[1]=val;
		}
		else if(val>solutions[2]){
			solutions[0]=solutions[1];
			solutions[1]=solutions[2];
			solutions[2]=val;
		}
	}
    return solutions;
  }
}
