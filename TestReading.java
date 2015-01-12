
public class TestReading implements ReadAndWriteCombiner{
	Team in;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Division res = new Division();
		readXML test = new readXML();
		
		test.runExample(res);
		for (int i = 0; i< res.Size(); i++) {
			for (int ii = 0; i < res.get(i).size(); ii++){
				System.out.println(res.get(i).get(ii).toString());
			}
		}
		writeXMLtest tess = new writeXMLtest();
		tess.runExample(res);
		}
		
	}
	

