
public class Player {

	String firstname;
	String lastname;
	int offence;
	int defence;
	int stamina;
	int playernumber;
	int price;
	boolean isactive;

	public Player(String firstname, String lastname, int offence, int defence, int stamina,
			int playernumber, boolean isactive, int price) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.offence = offence;
		this.defence = defence;
		this.stamina = stamina;
		this.playernumber = playernumber;
		this.isactive = isactive;
		this.price = price;
	}

	public String GetFirstName() {
		return this.firstname;
	}
	public String GetLastName(){
		return this.lastname;
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
	public int GetPrice(){
		return this.price;
	}
	public void setFirstName(String firstname){
		this.firstname = firstname;
	}
	public void setLastName(String lastname){
		this.lastname = lastname;
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
	
	public void setPrice(int price){
		this.price = price;
	}
	public String toString(){
		String res = "";
		res += "name: " + this.GetFirstName() + " " + this.GetLastName() + "\n";
		res += "offence: " + this.GetOffence() + "\n";
		res += "defence: " + this.GetDefence() + "\n";
		res += "stamina: " + this.GetStamina() + "\n";
		res += "playernumber: " + this.GetPlayerNumber() + "\n";
		res += "isactive: " + this.GetIsActive() + "\n";
		res += "price: " + this.GetPrice() + "\n";
		return res;
	}
}
