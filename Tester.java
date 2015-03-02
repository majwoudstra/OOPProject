
public class Tester {
public static void main(String[] args) {
		
		Division div = new Division(1, true);
		String baselist = "XML.xml";
		String save1 = "src/offertest.xml";
		String save2 = "src/save2.xml";
		String save3 = "src/save3.xml";
		Rankings tes = new Rankings();
		
		readXML test = new readXML();
		test.LoadXMLFile(div, baselist);
		writeXML tess = new writeXML();
		tess.SaveXMLFile(div, save1);
	}
}
