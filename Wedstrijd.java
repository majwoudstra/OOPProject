import java.util.Random;
import java.util.ArrayList;

public class Wedstrijd {

	@SuppressWarnings("static-access")
	public Division playmatch(Team a, Team b, Division input) {
		
		
		Division res = input;
		Random rng = new Random();
		int defa = 0;
		int atta = 0;
		int stama = 0;

		int defb = 0;
		int attb = 0;
		int stamb = 0;
		
		int punta = 0;
		int puntb = 0;

		int tota = 0;
		int totb = 0;

		int diff = 0;
		int result = 0;

		Team aa = new Team(null, stamb, false, stamb, stamb, stamb, stamb);
		Team ba = new Team(null, stamb, false, stamb, stamb, stamb, stamb);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).GetIsActive() == true) {
				aa.add(a.get(i));
			}
		}
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i).GetIsActive() == true) {
				ba.add(b.get(i));
			}
		}
		for (int i = 0; i < aa.size(); i++) {
			defa += aa.get(i).GetDefence();
			atta += aa.get(i).GetOffence();
			stama += aa.get(i).GetStamina();
		}

		for (int i = 0; i < ba.size(); i++) {
			defb += ba.get(i).GetDefence();
			attb += ba.get(i).GetOffence();
			stamb += ba.get(i).GetStamina();
		}

		defa = defa / aa.size();
		atta = atta / aa.size();
		stama = stama / aa.size();

		defb = defb / ba.size();
		attb = attb / ba.size();
		stamb = stamb / ba.size();

		tota = (defa + atta + stama) / 3;
		totb = (defb + attb + stamb) / 3;
		
		
		if (tota < totb){
			diff = 3;
		}
		if(tota == totb){
			diff = 5;
		}
		if(tota > totb){
			diff = 7;
		}
		result = resultgen(diff);

		punta = rng.nextInt(6);
		puntb = rng.nextInt(6);
		
		if (result == 0) {
			
			System.out.println(b.getName() + " Has won!");
			
			while(punta >= puntb){
				punta = rng.nextInt(6);
				puntb = rng.nextInt(6);
			}
			
			a.SetDoelpuntenVoor(a.GetDoelpuntenVoor()+punta);
			b.SetDoelpuntenVoor(b.GetDoelpuntenVoor()+puntb);
			
			b.SetPuntenSaldo((b.GetPuntenSaldo()+3));
		}
		if (result == 1){
			
			System.out.println(" It's a draw!");
			
			while(punta != puntb){
				punta = rng.nextInt(6);
				puntb = rng.nextInt(6);
			}
			
			a.SetDoelpuntenVoor(a.GetDoelpuntenVoor()+punta);
			b.SetDoelpuntenVoor(b.GetDoelpuntenVoor()+puntb);
			
			a.SetPuntenSaldo((a.GetPuntenSaldo()+1));
			b.SetPuntenSaldo((b.GetPuntenSaldo()+1));
		}
		if(result == 2){
			
			System.out.println(a.getName() + " Has won!");
			
			while(punta <= puntb){
				punta = rng.nextInt(6);
				puntb = rng.nextInt(6);
			}
			
			a.SetDoelpuntenVoor(a.GetDoelpuntenVoor()+punta);
			b.SetDoelpuntenVoor(b.GetDoelpuntenVoor()+puntb);
			
			a.SetPuntenSaldo((a.GetPuntenSaldo()+3));
		}

		for(int i = 0; i<res.Size();i++){
			if(a.getName() == res.get(i).getName()){
				res.set(i, a);
			}
			if(b.getName() == res.get(i).getName()){
				res.set(i, b);
			}
			
		}
		
		
		
		return res;
	}

	public int resultgen(int input) {
		int res = 0;
		int comparator = 0;
		int average = 0;
		Random rng = new Random();
		for (int i = 0; i < 11; i++) {
			average += rng.nextInt(10);
		}
		average = average % 11;
		comparator = average;
		if (input < comparator) {
			res = 0;
		}
		if (input == comparator) {
			res = 1;
		}
		if (input > comparator) {
			res = 2;
		}

		return res;
	}
}
