import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class readXML {

	Team Ado = new Team();
	Team Ajax = new Team();
	Team PSV = new Team();
	Team AZ = new Team();
	Team Feyenoord = new Team();
	Team Vitesse = new Team();
	Team Cambuur = new Team();
	Team GoAhead = new Team();
	Team Heerenveen = new Team();
	Team Excelsior = new Team();
	Team Dordrecht = new Team();
	Team Groningen = new Team();
	Team Twente = new Team();
	Team Utrecht = new Team();
	Team Heracles = new Team();
	Team NAC = new Team();
	Team PEC = new Team();
	Team WillemII = new Team();

	// No generics
	Team res;
	Document dom;

	public readXML() {
		// create a list to hold the employee objects
		res = new Team();
	}

	public void runExample(Division in) {

		// parse the xml file and get the dom object
		parseXmlFile();

		// get each employee element and create a Employee object
		parseDocument();

		// Iterate through the list and print the data
		FillDivision(in);
	}

	private void parseXmlFile() {
		// get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {

			// Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			// parse using builder to get DOM representation of the XML file
			dom = db.parse("XML.xml");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (SAXException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private void parseDocument() {
		// get the root elememt
		Element docEle = dom.getDocumentElement();
		Team res;
		String name = "";
		// get a nodelist of <employee> elements
		NodeList nl = docEle.getElementsByTagName("Team");
		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {

				// get the employee element
				Element el = (Element) nl.item(i);
				name = getTextValue(el, "Name");
				// get the Employee object

				res = new Team();
				res = AddToTeam(el);

				// add it to list
				switch (name) {
				case "Ado Den Haag":
					Ado = res;
					break;
				case "Ajax":
					Ajax = res;
					break;
				case "AZ":
					AZ = res;
					break;
				case "Excelsior":
					Excelsior = res;
					break;
				case "FC Dordrecht":
					Dordrecht = res;
					break;
				case "FC Groningen":
					Groningen = res;
					break;
				case "FC Twente":
					Twente = res;
					break;
				case "FC Utrecht":
					Utrecht = res;
					break;
				case "Feyenoord":
					Feyenoord = res;
					break;
				case "Go Ahead Eagles":
					GoAhead = res;
					break;
				case "Heracles Almelo":
					Heracles = res;
					break;
				case "NAC Breda":
					NAC = res;
					break;
				case "PEC Zwolle":
					PEC = res;
					break;
				case "PSV":
					PSV = res;
					break;
				case "SC Cambuur":
					Cambuur = res;
					break;
				case "SC Heerenveen":
					Heerenveen = res;
					break;
				case "Vitesse":
					Vitesse = res;
					break;
				case "Willem II":
					WillemII = res;
					break;

				}
			}
		}
	}

	/**
	 * I take an employee element and read the values in, create an Employee
	 * object and return it
	 * 
	 * @param empEl
	 * @return
	 */
	private Player getPlayer(Element PlayEl) {
		String firstname = getTextValue(PlayEl, "Voornaam");
		String lastname = getTextValue(PlayEl, "Achternaam");
		int offence = getIntValue(PlayEl, "Aanval");
		int defence = getIntValue(PlayEl, "Verdediging");
		int stamina = getIntValue(PlayEl, "Uithoudingsvermogen");
		int playernumber = getIntValue(PlayEl, "Rugnummer");
		
		boolean isactive = Boolean.parseBoolean(getTextValue(PlayEl,
				"Beschikbaarheid"));
		int price = getIntValue(PlayEl, "Prijs");
		Player e = new Player(firstname, lastname, offence, defence, stamina, playernumber, isactive, price);
		return e;
	}

	/**
	 * I take a xml element and the tag name, look for the tag and get the text
	 * content i.e for <employee><name>John</name></employee> xml snippet if the
	 * Element points to employee node and tagName is name I will return John
	 * 
	 * @param ele
	 * @param tagName
	 * @return
	 */
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}

	/**
	 * Calls getTextValue and returns a int value
	 * 
	 * @param ele
	 * @param tagName
	 * @return
	 */
	private int getIntValue(Element ele, String tagName) {
		// in production application you would catch the exception
		return Integer.parseInt(getTextValue(ele, tagName));
	}

	private Team AddToTeam(Element el) {
		Team res = new Team();
		NodeList nl = el.getElementsByTagName("Speler");
		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {
				Element ez = (Element) nl.item(i);
				Player e = getPlayer(ez);

				res.add(e);

			}

		}
		return res;
	}

	private void FillDivision(Division in) {
		in.add(Ado); // 0
		in.add(Ajax); // 1
		in.add(AZ); // 2
		in.add(Cambuur); // 3
		in.add(Dordrecht); // 4
		in.add(Excelsior); // 5
		in.add(Feyenoord); // 6
		in.add(GoAhead); // 7
		in.add(Groningen); // 8
		in.add(Heerenveen); // 9
		in.add(Heracles); // 10
		in.add(NAC); // 11
		in.add(PEC); // 12
		in.add(PSV); // 13
		in.add(Twente); // 14
		in.add(Utrecht); // 15
		in.add(Vitesse); // 16
		in.add(WillemII); // 17
	}
}
