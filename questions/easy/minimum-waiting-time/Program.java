import java.util.Arrays;

class Program {

    public int minimumWaitingTime(int[] queries) {
          int n=queries.length;
          if(n==1) return 0;
          
          Arrays.sort(queries);
          
          int sum=0;
          for(int i=0;i<n-1;i++){
              sum+=queries[i]*(n-1-i);
          }
      return sum;
    }
  }
  