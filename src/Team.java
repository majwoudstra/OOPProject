
import java.util.ArrayList;
import java.util.Iterator;

public class Team {

	
	private ArrayList<Player> Team = new ArrayList<Player>();
	private String name;
	private int budget = 200000;
	private boolean pccontrolled;
	
	public Team(String name, int budget, boolean pccontrolled){
		this.name = name;
		this.budget = budget;
		this.pccontrolled = pccontrolled;
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

	public int getBudget(){
		return budget;
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
	
	//hier komen de getters voor het spelen van een wedstrijd.
	public int getOff(){
		int getoff = 0;
		for(int i = 0; i < 11; i++){
			getoff = getoff + this.get(i).GetDefence();
		}
		int total = getoff/11;
		return total;
	}

	public int getDef(){
		int getoff = 0;
		for(int i = 0; i < 11; i++){
			getoff = getoff + this.get(i).GetDefence();
		}
		int total = getoff/11;
		return total;
	}
	
	public int getStam(){
		int getoff = 0;
		for(int i = 0; i < 11; i++){
			getoff = getoff + this.get(i).GetStamina();
		}
		int total = getoff/11;
		return total;
	}
	
	public boolean GetPcControlled(){
		return this.pccontrolled;
	}
	public int GetBudget(){
		return this.budget;
	}
	public void SetBudget(int budget){
		this.budget = budget;
	}
	public void SetPcControlled(boolean controlled){
		this.pccontrolled = controlled;
	}
}


