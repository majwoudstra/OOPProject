package model;

public class TestReading implements ReadAndWriteCombiner{
	Team in;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Division res = new Division();
		readXML test = new readXML();
		
		test.runExample(res, "src/XML5.xml");
		
		writeXMLtest tess = new writeXMLtest();
		//tess.runExample(res);
		System.out.println(res.get(5).get(3).toString());
		}
		
	}
	

