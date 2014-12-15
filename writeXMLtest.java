import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


//For jdk1.5 with built in xerces parser






@SuppressWarnings("deprecation")
public class writeXMLtest {
Team res = new Team();
Document dom;

private void loadData(){
	res.add(new Player("Ronald van Gool", 10, 50, 100, 7, 6, true));
	res.add(new Player("Robin van Persie", 100, 30, 70, 11, 4, true));
	
}
	private void createDocument(){
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	
		DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();
			dom = db.newDocument();
		} catch (ParserConfigurationException pce) {
			System.out.println("Error while trying to instantiate Documentbuilder" + pce);
			System.exit(1);
		}
		
	
	}
	private void createDOMTree(){
		Element rootEle = 
				dom.createElement("team");
		dom.appendChild(rootEle);
		@SuppressWarnings("rawtypes")
		Iterator it = res.iterator();
		while(it.hasNext()){
			Player e = (Player)it.next();
			Element playEle = createPlayerElement(e);
			rootEle.appendChild(playEle);
		}
		
	}
	private Element createPlayerElement(Player p){
		Element playEle = dom.createElement("player");
		Element nameEle = dom.createElement("name");
		Text nameText = dom.createTextNode(p.GetName());
		nameEle.appendChild(nameText);
		
		Element offEle = dom.createElement("offence");
		Text offText = dom.createTextNode(Integer.toString(p.GetOffence()));
		offEle.appendChild(offText);
		
		Element defEle = dom.createElement("defence");
		Text defText = dom.createTextNode(Integer.toString(p.GetDefence()));
		defEle.appendChild(defText);
		
		Element stamEle = dom.createElement("stamina");
		Text stamText = dom.createTextNode(Integer.toString(p.GetStamina()));
		stamEle.appendChild(stamText);
		
		Element pnumEle = dom.createElement("playernumber");
		Text pnumText = dom.createTextNode(Integer.toString(p.GetPlayerNumber()));
		pnumEle.appendChild(pnumText);
		
		Element pidEle = dom.createElement("id");
		Text pidText = dom.createTextNode(Integer.toString(p.GetId()));
		pidEle.appendChild(pidText);
		
		Element actEle = dom.createElement("isactive");
		Text actText = dom.createTextNode(String.valueOf(p.GetIsActive()));
		actEle.appendChild(actText);
		
		playEle.appendChild(nameEle);
		playEle.appendChild(offEle);
		playEle.appendChild(defEle);
		playEle.appendChild(stamEle);
		playEle.appendChild(pnumEle);
		playEle.appendChild(pidEle);
		playEle.appendChild(actEle);
		
		return playEle;
	}
	
	@SuppressWarnings("deprecation")
	private void printToFile(){

		try
		{
			//print
			OutputFormat format = new OutputFormat(dom);
			format.setIndenting(true);

			//to generate output to console use this serializer
			//XMLSerializer serializer = new XMLSerializer(System.out, format);
			
			FileOutputStream out = new FileOutputStream(new File("book.xml"));
			
			XMLSerializer serializer = new XMLSerializer(out, format);
			
			
			serializer.serialize(dom);

		} catch(IOException ie) {
		    ie.printStackTrace();
		}
	}
	public void runExample(){
		System.out.println("Started .. ");
		createDOMTree();
		printToFile();
		System.out.println("Generated file successfully.");
	}
	public writeXMLtest(){
		loadData();
		createDocument();
	}
	public static void main(String args[]) {

		//create an instance
		writeXMLtest xce = new writeXMLtest();

		//run the example
		xce.runExample();
	}
}
