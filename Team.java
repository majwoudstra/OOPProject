
import java.util.ArrayList;
import java.util.Iterator;

public class Team {

	private ArrayList<Player> Team = new ArrayList<Player>();

	public void add(Player player) {
		Team.add(player);
	}

	public int size(){
		return Team.size();
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
