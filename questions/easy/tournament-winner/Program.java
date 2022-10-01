import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Program {

  public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		Map<String,Integer> teams = new HashMap<String,Integer>();
		ArrayList<Integer> points = new ArrayList<Integer>();
		String loopWinner,maxTeam="";
		int teamCounter=-1;
		for(int i=0;i<results.size();i++){
			loopWinner=competitions.get(i).get(results.get(i)==0?1:0);
			if(!teams.containsKey(loopWinner)){
				teamCounter++;
				teams.put(loopWinner,teamCounter);
				points.add(0);
			}
    	points.set(teams.get(loopWinner), points.get(teams.get(loopWinner))+1);
			if(maxTeam=="" || (points.get(teams.get(loopWinner))>points.get(teams.get(maxTeam)))){
				maxTeam=loopWinner;
			}
		}
			
    return maxTeam;
  }
}
