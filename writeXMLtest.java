import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;









@SuppressWarnings("deprecation")
public class writeXMLtest {
Team res = new Team();
Document dom;



	

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
	private void createDOMTree(Division in){
		Element rootEle = 
				dom.createElement("Division");
		dom.appendChild(rootEle);
		
		for(int i=0;i<Division.Size();i++){
			
			Element teamEle = createTeamElement(Division.get(i));
			
			switch (i){
			case 0:
				teamEle.setAttribute("name", "Ado");
				break;
			case 1:
				teamEle.setAttribute("name", "Ajax");
				break;
			case 2:
				teamEle.setAttribute("name", "AZ");
				break;
			case 3:
				teamEle.setAttribute("name", "Cambuur");
				break;
			case 4:
				teamEle.setAttribute("name", "Dordrecht");
				break;
			case 5:
				teamEle.setAttribute("name", "Excelsior");
				break;
			case 6:
				teamEle.setAttribute("name", "Feyenoord");
				break;
			case 7:
				teamEle.setAttribute("name", "GoAhead");
				break;
			case 8:
				teamEle.setAttribute("name", "Groningen");
				break;
			case 9:
				teamEle.setAttribute("name", "Heerenveen");
				break;
			case 10:
				teamEle.setAttribute("name", "Heracles");
				break;
			case 11:
				teamEle.setAttribute("name", "NAC");
				break;
			case 12:
				teamEle.setAttribute("name", "PEC");
				break;
			case 13:
				teamEle.setAttribute("name", "PSV");
				break;
			case 14:
				teamEle.setAttribute("name", "Twente");
				break;
			case 15:
				teamEle.setAttribute("name", "Utrecht");
				break;
			case 16:
				teamEle.setAttribute("name", "Vitesse");
				break;
			case 17:
				teamEle.setAttribute("name", "WillemII");
				break;
			}
			rootEle.appendChild(teamEle);
		}
		
	}
	private Element createPlayerElement(Player p){
		Element playEle = dom.createElement("player");
		playEle.setAttribute("name", p.GetName());
		
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
		
		
		
		Element actEle = dom.createElement("isactive");
		Text actText = dom.createTextNode(String.valueOf(p.GetIsActive()));
		actEle.appendChild(actText);
		
		
		playEle.appendChild(offEle);
		playEle.appendChild(defEle);
		playEle.appendChild(stamEle);
		playEle.appendChild(pnumEle);
		playEle.appendChild(actEle);
		
		return playEle;
	}
	
	private void printToFile(){

		try
		{
			//print
			OutputFormat format = new OutputFormat(dom);
			format.setIndenting(true);

			//to generate output to console use this serializer
			//XMLSerializer serializer = new XMLSerializer(System.out, format);
			
			FileOutputStream out = new FileOutputStream(new File("save2.xml"));
			
			XMLSerializer serializer = new XMLSerializer(out, format);
			
			
			serializer.serialize(dom);

		} catch(IOException ie) {
		    ie.printStackTrace();
		}
	}
	public void runExample(Division in){
		System.out.println("Started .. ");
		createDOMTree(in);
		printToFile();
		System.out.println("Generated file successfully.");
	}
	public writeXMLtest(){
		
		createDocument();
	}
	private Element createTeamElement(Team in){
		Element teamEle = dom.createElement("team");
		for (int i=0;i<in.size();i++){
			Element playEle = createPlayerElement(in.get(i));
			teamEle.appendChild(playEle);
			
		}
		return teamEle;
	}
}
