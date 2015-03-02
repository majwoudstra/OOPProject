import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class WedstrijdTest {

	private Division test;
	
	private Team ajax;
	private Team psv;
	
	private Player Henk;
	private Player Harry;
	private Player Bob;
	private Player Mik;
	private Player Karel;
	private Player Gijs;
	private Player Edwin;
	private Player Klaas;
	private Player Barry;
	private Player Daan;
	private Player Sander;
	
	private Player Mike;
	private Player Menno;
	private Player Robbert;
	private Player Bruce;
	private Player Joost;
	private Player Joris;
	private Player Leon;
	private Player Jim;
	private Player Lars;
	private Player Thomas;
	private Player Danny;
	
	@Before
	public void Before(){
		Henk = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Harry = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Bob = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Mik = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Karel = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Gijs = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Edwin = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Klaas = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Barry = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Daan = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Sander = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Mike = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Menno = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Robbert = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Bruce = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Joost = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Joris = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Leon = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Jim = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Lars = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Thomas = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Danny = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		ajax = new Team("Ajax", 20000, true, 40, 20, 20, 30);
		psv = new Team("PSV", 20000, true, 40, 20, 20, 30);
		test = new Division(1, true);
		
	}
	
	@Test
	public void testPlaymatch() {
		ajax.add(Henk);
		ajax.add(Harry);
		ajax.add(Bob);
		ajax.add(Mik);
		ajax.add(Karel);
		ajax.add(Gijs);
		ajax.add(Edwin);
		ajax.add(Klaas);
		ajax.add(Barry);
		ajax.add(Daan);
		ajax.add(Sander);
		psv.add(Mike);
		psv.add(Menno);
		psv.add(Robbert);
		psv.add(Bruce);
		psv.add(Joost);
		psv.add(Joris);
		psv.add(Leon);
		psv.add(Jim);
		psv.add(Lars);
		psv.add(Thomas);
		psv.add(Danny);
		
		
		Wedstrijd tess = new Wedstrijd();
		tess.playmatch(ajax, psv, test);
	}

	@Test
	public void testResultgen() {
	
	
	}

}
