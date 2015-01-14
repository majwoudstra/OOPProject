import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class readXML {



	// No generics
	Team res;
	Document dom;

	public readXML() {
		// create a list to hold the employee objects
		 res = new Team("", 0, true);
	}

	public void runExample(division in) {

		// parse the xml file and get the dom object
		parseXmlFile();

		// get each employee element and create a Employee object
		parseDocument(in);

		// Iterate through the list and print the data
		
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

	private void parseDocument(division in) {
		// get the root elememt
		Element docEle = dom.getDocumentElement();
		Team res;
		String name = "";
		int budget = 0;
		boolean pccontrolled;
		// get a nodelist of <employee> elements
		NodeList nl = docEle.getElementsByTagName("Team");
		if (nl != null && nl.getLength() > 0) {
			for (int i = 0; i < nl.getLength(); i++) {

				// get the employee element
				Element el = (Element) nl.item(i);
				name = getTextValue(el, "Name");
				budget = getIntValue(el,"Budget");
				pccontrolled = Boolean.parseBoolean(getTextValue(el, "Spelergestuurd"));

				res = new Team(name, budget, pccontrolled);
				res = AddToTeam(el, name, budget, pccontrolled);

				// add it to list
				
				in.add(res);
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
		Player e = new Player(firstname, lastname, offence, defence, stamina, playernumber, price, isactive);
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

	private Team AddToTeam(Element el, String name, int budget, boolean controlled) {
		Team res = new Team(name, budget, controlled);
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

	
}
