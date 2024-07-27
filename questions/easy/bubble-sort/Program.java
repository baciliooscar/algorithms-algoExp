

class Program {
  public static int[] bubbleSort(int[] array) {
    int pivot=0;
	for(int i=1;i<array.length;i++){
      for(int j=i;j>0;j--){
        if(array[j]<array[j-1]){
          pivot=array[j];
          array[j]=array[j-1];
          array[j-1]=pivot;
        }else{
          break;
        }
      }
    }
    return array;
  }
}
