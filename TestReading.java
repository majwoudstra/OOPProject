
public class TestReading extends readXML{
	Team in;
	public static void main(String[] args) {
		Team res = new Team();
		readXML test = new readXML();
		test.runExample(res);
		for(int i=0;i<res.size();i++){
		System.out.println(res.get(i));
		}
		
	}
	
}
