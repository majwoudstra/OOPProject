
import java.util.ArrayList;
import java.util.Iterator;

public class Team {

	private ArrayList<Player> Team = new ArrayList<Player>();
	private String name;
	
	public Team(String nm){
		name = nm;
	}

	public void add(Player player) {
		Team.add(player);
	}

	public int size(){
		return Team.size();
	}

	public String getName(){
		return name;
	}
	

	public Player get(int i) {
	 return	Team.get(i);
	}

	
	public Iterator<Player> iterator() {
		return Team.iterator();
	}

	public Team getTeam(){
		return this;
	}
	
	
}
