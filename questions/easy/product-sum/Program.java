import java.util.List;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return productSum(array,1);
  }
	public static int productSum(List<Object> array,int level) {
		int totalSum=0;
		for(Object obj:array){
			if(obj instanceof Integer){
				totalSum+=(Integer)obj;
			}else{
				totalSum+=productSum((List<Object>)obj,level+1);
			}
		}
		return level*totalSum;
	}
}
