
import java.util.ArrayList;


public class Division {

	private static ArrayList<Team> division = new ArrayList<Team>();
	private int round;
	private boolean offer;
	
	public Division(int round, boolean offer){
		this.round = round;
		this.offer = offer;
	}
	
	public void add (Team team){
		division.add(team);
	}
	public static int Size(){
		return division.size();
	}
	public static Team get(int i){
		return division.get(i);
	}
	
	public static void set(int i, Team input){
		division.set(i, input);
	}
	
	public int GetRound(){
		return this.round;
	}
	
	public void SetRound(int i){
		this.round = i;
	}
	public boolean GetOffer(){
		return this.offer;
	}
	public void SetOffer(boolean i){
		this.offer = i;
	}
	
}
