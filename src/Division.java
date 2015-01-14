
import java.util.ArrayList;


public class division {

	private static ArrayList<Team> division = new ArrayList<Team>();
	
	public void add (Team team){
		division.add(team);
	}
	public static int Size(){
		return division.size();
	}
	public static Team get(int i){
		return division.get(i);
	}
	
}
