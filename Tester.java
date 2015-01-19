
public class Tester {
public static void main(String[] args) {
		
		division div = new division();
		String baselist = "XML.xml";
		String save1 = "src/save1.xml";
		String save2 = "src/save2.xml";
		String save3 = "src/save3.xml";

		
		readXML test = new readXML();
		test.LoadXMLFile(div, baselist);
		loadXML tess = new loadXML();
		tess.SaveXMLFile(div, save1);
	}
}
