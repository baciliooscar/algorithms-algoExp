import java.util.*;

class Program {
  	public static int[] twoNumberSum(int[] array, int targetSum) {
		Set<Integer> numbers = new HashSet<Integer>();
		for(int val:array){
			if(numbers.contains(targetSum-val)){
				return new int[]{val,targetSum-val};
			}else{
				numbers.add(val);
			}
		}
    	return new int[0];
  	}
}