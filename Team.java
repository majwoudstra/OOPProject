
import java.util.ArrayList;
import java.util.Iterator;


public class Team {
	private String name;
	private ArrayList<Player> Team = new ArrayList<Player>();
	private int budget = 200000;

	public Team(String nm){
		name = nm;
	}
	
	public void add(Player player) {
		Team.add(player);
	}
	
	public void buy(Player player) {
		ArrayList<Integer> rn = new ArrayList<Integer>();
		ArrayList<Integer> grn = new ArrayList<Integer>();
		for(int i = 0; i < Team.size(); i++){
			if(!rn.contains(Team.get(i).GetPlayerNumber())){
				rn.add(Team.get(i).GetPlayerNumber());
			}
			else{
				grn.add(Team.get(i).GetPlayerNumber());
			}
		}
		if (grn.size() == 0){
			int res = 1;
			for(int i = 0; i < rn.size(); i++){
				if(rn.get(i)>res){
					res = rn.get(i);
				}
			}
			res++;
			player.setPlayerNumber(res);
		}
		else{
			player.setPlayerNumber(grn.get(0));
		}
		player.setIsActive(false);
		Team.add(player);
		GUI.wissels.add(player);
	}

	public int size(){
		return Team.size();
	}

	public String getName(){
		return name;
	}
	
	public int getBudget(){
		return budget;
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
	
	public void setBudget(int prijs){
		this.budget = prijs;
	}
	public void removePlayer(int speler){
		ArrayList<Player> res = new ArrayList<Player>();
		for (int i = 0; i < Team.size(); i++){
			if(i != speler){
				res.add(Team.get(i));
			}
		}
		Team = res;
	}
	
	public String toString(){
		String team = "";
		for(int i=0; i< this.size(); i++){
			team = team + this.get(i);
		}
		return team;
	}

	
}
