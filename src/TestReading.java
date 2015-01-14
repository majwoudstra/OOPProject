
public class TestReading implements ReadAndWriteCombiner{
	Team in;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		division res = new division();
		readXML test = new readXML();
		
		test.runExample(res);
		
		writeXMLtest tess = new writeXMLtest();
		tess.runExample(res);
		}
		
	}
	

