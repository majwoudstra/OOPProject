
import java.util.ArrayList;
import java.util.Iterator;

public class Team {

	
	private ArrayList<Player> Team = new ArrayList<Player>();
	private String name;
	private int budget;
	private boolean pccontrolled;
	private int doelpuntenvoor;
	private int doelpuntentegen;
	private int doelpuntensaldo;
	private int puntensaldo;
	
	
	public Team(String name, int budget, boolean pccontrolled, int doelpuntenvoor, int doelpuntentegen, int doelpuntensaldo, int puntensaldo){
		this.name = name;
		this.budget = budget;
		this.pccontrolled = pccontrolled;
		this.doelpuntenvoor = doelpuntenvoor;
		this.doelpuntentegen = doelpuntentegen;
		this.doelpuntensaldo = doelpuntensaldo;
		this.puntensaldo = puntensaldo;
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
	
	public int GetDoelpuntenVoor(){
		return this.doelpuntenvoor;
	}
	public int GetDoelpuntenTegen(){
		return this.doelpuntentegen;
	}
	public int GetDoelpuntenSaldo(){
		return this.doelpuntensaldo;
	}
	public int GetPuntenSaldo(){
		return this.puntensaldo;
	}
	public void SetDoelpuntenVoor(int voor){
		this.doelpuntenvoor = voor;
	}
	public void SetDoelpuntenTegen(int tegen){
		this.doelpuntentegen = tegen;
	}
	public void SetDoelpuntenSaldo(int saldo){
		this.doelpuntensaldo = saldo;
	}
	public void SetPuntenSaldo(int saldo){
		this.puntensaldo = saldo;
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


