import java.util.ArrayList;
import java.util.Collections;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
		int n=redShirtHeights.size();
		
		Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		Boolean startRed=redShirtHeights.get(0)<blueShirtHeights.get(0);
		for(int i=0;i<n;i++){
            if(redShirtHeights.get(i)==blueShirtHeights.get(i)){
                return false;
            }
            if(startRed){
                if(redShirtHeights.get(i)>blueShirtHeights.get(i)){
                    return false;
                }
            }else{
                if(blueShirtHeights.get(i)>redShirtHeights.get(i)){
                    return false;
                }
            }
		}
    return true;
  }
	
}