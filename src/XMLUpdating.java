import java.util.ArrayList;


public class XMLUpdating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division res = new Division();
		readXML test = new readXML();
		test.runExample(res, "src/XML5.xml");
		
		writeXMLtest tess = new writeXMLtest();
		//tess.runExample(res);
	}

}
