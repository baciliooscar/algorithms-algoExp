class Program {
  public int[] sortedSquaredArray(int[] array) {
		array=formatArray(array);
		if(array[0]>array[array.length-1]){
			array=revertArray(array);
		}
    return array;
  }
	public int[] formatArray(int[] array){
		int leftP=findPeak(array);
		int n=array.length;
		if(leftP==-1){
			for(int i=0;i<n;i++){
				array[i]=array[i]*array[i];
			}
			return array;
		}
		int[] formated=new int[n];
		int leftV,rightV;
		int rightP=leftP+1;
		for(int i=0;leftP>=0||rightP<n;i++){
			if(leftP>=0&&rightP<n){
				leftV=array[leftP]*array[leftP];
				rightV=array[rightP]*array[rightP];
				if(leftV<rightV){
					formated[i]=leftV;
					leftP--;
				}else if(leftV>rightV){
					formated[i]=rightV;
					rightP++;
				}else{
					formated[i]=leftV;
					leftP--;
				}
			}else if(rightP==n){
				formated[i]=array[leftP]*array[leftP];
				leftP--;
			}else if(leftP==-1){
				formated[i]=array[rightP]*array[rightP];
				rightP++;
			}
		}
		return formated;
	}
	public int findPeak(int[] array){
		boolean foundDirrection=false,startsAs=false;
		int a,b;
		for(int i=0;i<array.length-1;i++){
			a=Math.abs(array[i]);b=Math.abs(array[i+1]);
			if(foundDirrection==false){
				if(a<b){
					foundDirrection=true;
					startsAs=true;
				}else if(a>b){
					foundDirrection=true;
					startsAs=false;
				}
			}else{
				if(a<b){
					if(!startsAs){
						return i;
					}
				}else if(a>b){
					if(startsAs){
						return i;
					}
				}
			}
		}
		return -1;
	}
	public int[] revertArray(int[] array){
		if(array.length<2){
			return array;
		}
		int helper,n=array.length;
		for(int i=0;i<n/2;i++){
			helper=array[i];
			array[i]=array[n-1-i];
			array[n-1-i]=helper;
		}
		return array;
	}
}

