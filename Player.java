
public class Player {

	String name;
	int offence;
	int defence;
	int stamina;
	int playernumber;
	
	boolean isactive;

	public Player(String name, int offence, int defence, int stamina,
			int playernumber, boolean isactive) {
		this.name = name;
		this.offence = offence;
		this.defence = defence;
		this.stamina = stamina;
		this.playernumber = playernumber;
		
		this.isactive = isactive;
	}

	public String GetName() {
		return this.name;
	}

	public int GetOffence() {
		return this.offence;
	}

	public int GetDefence() {
		return this.defence;
	}

	public int GetStamina() {
		return this.stamina;
	}

	public int GetPlayerNumber() {
		return this.playernumber;
	}
	
	public boolean GetIsActive(){
		return this.isactive;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setOffence(int offence){
		this.offence = offence;
	}
	public void setDefence(int defence){
		this.defence = defence;
	}
	public void setStamina(int stamina){
		this.stamina = stamina;
	}
	public void setPlayerNumber(int playernumber){
		this.playernumber = playernumber;
	}
	
	public void setIsActive(boolean isactive){
		this.isactive = isactive;
	}
	public String toString(){
		String res = "";
		res += "name: " + this.GetName() + "\n";
		res += "offence: " + this.GetOffence() + "\n";
		res += "defence: " + this.GetDefence() + "\n";
		res += "stamina: " + this.GetStamina() + "\n";
		res += "playernumber: " + this.GetPlayerNumber() + "\n";
		res += "isactive: " + this.GetIsActive() + "\n";
		return res;
	}
	public String toStringRug(){
		String res = this.playernumber + "- " + this.name + "Off:" + this.offence + " Def: " + this.defence + " Stam:" + this.stamina;
		return res;
	}
}
