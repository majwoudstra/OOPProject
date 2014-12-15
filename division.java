
import java.util.ArrayList;


public class division extends Team {

	private static ArrayList<Team> division = new ArrayList<Team>();
	
	public void add (Team team){
		division.add(team);
	}
	public static int GetSize(){
		return division.size();
	}
	public static Team getTeam(int i){
		return division.get(i);
	}
	
}
