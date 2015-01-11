
import java.util.ArrayList;
import java.util.Iterator;


public class Team {
	private String name;
	private ArrayList<Player> Team = new ArrayList<Player>();

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

	
//	public Iterator<Player> iterator() {
//		return Team.iterator();
//	}

	public Team getTeam(){
		return this;
	}
	
	public String toString(){
		String team = "";
		for(int i=0; i< this.size(); i++){
			team = team + this.get(i);
		}
		return team;
	}

	
}
