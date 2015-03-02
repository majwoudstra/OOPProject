
public class Rankings {

	int[] temp;
	Division tem = new Division(1, true);
	Division res = new Division(1, true);
	@SuppressWarnings("static-access")
	public void Rankingslist(Division i){

		tem = i;
		temp = new int[i.Size()];
		for(int z = 0; z<i.Size(); z++){
			temp[z] = i.get(z).GetPuntenSaldo();
			
		}
	}
	
	@SuppressWarnings("static-access")
	public void sortbyrank(){
		java.util.Arrays.sort(temp);
		
		for(int i = 0; i<temp.length;i++){
			for(int j = 0; j < tem.Size(); j++){
				if(temp[i] == tem.get(j).GetPuntenSaldo()){
					res.add(tem.get(j));
				}
			}
		}
	}
	@SuppressWarnings("static-access")
	public void showranks(){
		Division red = new Division(1, true);
		red = res;
		for(int i = 0; i<red.Size();i++){
			System.out.println(i+1 + "." + red.get(i).getName() + ":" + red.get(i).GetPuntenSaldo() + "punten," + red.get(i).GetDoelpuntenVoor() + "doelpunten");
		}
	}
}
