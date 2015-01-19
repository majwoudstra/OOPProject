import java.util.ArrayList;


public class FootballManager {
	private static Division res;
	private static Team pc;
	private static ArrayList<Player> selectie;
	private static ArrayList<Player> wissels;
	Team in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		res = new Division();
		selectie = new ArrayList<Player>();
		wissels = new ArrayList<Player>();

		LoadGUI l = new LoadGUI();
		l.setVisible(true);
		
	}

	public static Division getDiv() {
		return res;
	}
	
	public static void update(){
		for(int i = 0; i < 18; i++){
			if(res.get(i).GetPcControlled()){
				pc = res.get(i);
			}
		}
		
		for(int i = 0; i < pc.size(); i++){
			if(pc.get(i).GetIsActive()){
				selectie.add(pc.get(i));
			}
			else{
				wissels.add(pc.get(i));
			}
		}	
	}

	public static void setDiv(Division div) {
		FootballManager.res = div;
	}

	public static Team getPc() {
		return pc;
	}

	public static void setPc(Team pc) {
		FootballManager.pc = pc;
	}

	public static ArrayList<Player> getSelectie() {
		return selectie;
	}

	public static void setSelectie(ArrayList<Player> selectie) {
		FootballManager.selectie = selectie;
	}

	public static ArrayList<Player> getWissels() {
		return wissels;
	}

	public static void setWissels(ArrayList<Player> wissels) {
		FootballManager.wissels = wissels;
	}

}
