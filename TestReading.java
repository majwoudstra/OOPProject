
public class TestReading implements ReadAndWriteCombiner{
	Team in;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Division res = new Division();
		readXML test = new readXML();
		
		test.runExample(res);
		for (int i = 0; i< res.get(0).size(); i++) {
			
		}
		writeXMLtest tess = new writeXMLtest();
		tess.runExample(res);
		}
		
	}
	

