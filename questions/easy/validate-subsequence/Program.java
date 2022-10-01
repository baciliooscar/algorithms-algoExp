import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    if(array.size()<sequence.size())
			return false;
		int piv=0;
		for(int i=0;i<array.size();i++)
			if(array.get(i)==sequence.get(piv)){
				piv++;
				if(piv==sequence.size()) 
					return true;
			}
    return false;
  }
}
