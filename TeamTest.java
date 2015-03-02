import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TeamTest {

	private Team ajax;  
	private Division test;  
	private Player Robin;
	private Player Patrick;
	
	@Before
	public void before(){
		ajax = new Team("Ajax", 20000, true, 40, 20, 20, 30);
		test = new Division(1, true);
		Robin = new Player("Robin", "van Persie", 100, 100, 100, 1, 10000, true);
		Patrick = new Player("Patrick", "Kluivert", 80, 80, 80, 2, 15000, false);
	}
	
	
	
	@Test
	public void testTeam() {
		assertEquals(ajax, ajax);
	}

	@SuppressWarnings("static-access")
	@Test
	public void testAdd() {
		test.add(ajax);
		assertEquals(ajax, test.get(0));
	}

	@Test
	public void testSize() {
		ajax.add(Patrick);
		ajax.add(Robin);
		assertEquals(test.Size(), 2);
	}

	@Test
	public void testGetName() {
		assertEquals(ajax.getName(), "Ajax");
	}

	@Test
	public void testGet() {
		test.add(ajax);
		assertEquals(test.get(1), ajax);
	}

	

	@Test
	public void testGetTeam() {
		assertEquals(ajax.getTeam(), ajax);
	}

	@Test
	public void testBuy() {
		ajax.buy(Robin);
		assertEquals(ajax.get(0),Robin);
	}

	@Test
	public void testGetBudget() {
		assertEquals(ajax.getBudget(), 20000);
	}

	@Test
	public void testSetBudget() {
		ajax.setBudget(10000);
		assertEquals(ajax.getBudget(), 10000);
	}

	@Test
	public void testRemovePlayer() {
		ajax.add(Patrick);
		ajax.add(Robin);
		ajax.removePlayer(1);
		assertEquals(ajax.size(), 1);
	}

	@Test
	public void testToString() {
		ajax.add(Robin);
		assertEquals(ajax.toString(), Robin.toString());
	}

	
	@Test
	public void testGetDoelpuntenVoor() {
		assertEquals(ajax.GetDoelpuntenVoor(), 40);
	}

	@Test
	public void testGetDoelpuntenTegen() {
		assertEquals(ajax.GetDoelpuntenTegen(), 20);
	}

	@Test
	public void testGetDoelpuntenSaldo() {
		assertEquals(ajax.GetDoelpuntenSaldo(), 20);
	}

	@Test
	public void testGetPuntenSaldo() {
		assertEquals(ajax.GetPuntenSaldo(), 30);
	}

	@Test
	public void testSetDoelpuntenVoor() {
		ajax.SetDoelpuntenVoor(50);
		assertEquals(ajax.GetDoelpuntenVoor(), 50);
	}

	@Test
	public void testSetDoelpuntenTegen() {
		ajax.SetDoelpuntenTegen(30);
		assertEquals(ajax.GetDoelpuntenTegen(), 30);
	}

	@Test
	public void testSetDoelpuntenSaldo() {
		ajax.SetDoelpuntenSaldo(40);
		assertEquals(ajax.GetDoelpuntenSaldo(), 40);
	}

	@Test
	public void testSetPuntenSaldo() {
		ajax.SetPuntenSaldo(50);
		assertEquals(ajax.GetPuntenSaldo(), 50);
	}

	@Test
	public void testGetPcControlled() {
		assertEquals(ajax.GetPcControlled(), true);
	}


	@Test
	public void testSetPcControlled() {
		ajax.SetPcControlled(false);
		assertEquals(ajax.GetPcControlled(), false);
	}

}
