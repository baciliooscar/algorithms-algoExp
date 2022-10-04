class Program {
  public static int getNthFib(int n) {
		if(n<=2) return n-1;
		
		int[] fib=new int[n];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<n;i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		
    return fib[n-1];
  }
}
