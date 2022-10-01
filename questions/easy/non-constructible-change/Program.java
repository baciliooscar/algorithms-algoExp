import java.util.Arrays;

class Program {

  public int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
		int coinSum=0;
		for(int coin:coins){
			if(coin>coinSum+1){
				return coinSum+1;
			}
			coinSum+=coin;
		}
    return coinSum+1;
  }
}
