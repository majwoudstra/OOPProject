

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
public class writeXML {
	Team res = new Team("", 0, true, 0, 0, 0, 0);
	Document dom;

	private void createDocument() {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();
			dom = db.newDocument();
		} catch (ParserConfigurationException pce) {
			System.out
					.println("Error while trying to instantiate Documentbuilder"
							+ pce);
			System.exit(1);
		}

	}

	private void createDOMTree(Division in) {
		Element rootEle = dom.createElement("Division");
		Element roundEle = dom.createElement("Round");
		Text roundText = dom.createTextNode(Integer.toString(in.GetRound()));
		Element offerEle = dom.createElement("Offer");
		Text offerText = dom.createTextNode(String.valueOf(in.GetOffer()));
		offerEle.appendChild(offerText);
		roundEle.appendChild(roundText);
		dom.appendChild(rootEle);
		rootEle.appendChild(roundEle);
		rootEle.appendChild(offerEle);
		for (int i = 0; i < Division.Size(); i++) {

			Element teamEle = createTeamElement(Division.get(i));
			
			rootEle.appendChild(teamEle);
		}

	}

	private Element createPlayerElement(Player p) {
		Element playEle = dom.createElement("Speler");

		Element firstnEle = dom.createElement("Voornaam");
		Text firstnText = dom.createTextNode(p.GetFirstName());
		firstnEle.appendChild(firstnText);

		Element lastnEle = dom.createElement("Achternaam");
		Text lastnText = dom.createTextNode(p.GetLastName());
		lastnEle.appendChild(lastnText);

		Element offEle = dom.createElement("Aanval");
		Text offText = dom.createTextNode(Integer.toString(p.GetOffence()));
		offEle.appendChild(offText);

		Element defEle = dom.createElement("Verdediging");
		Text defText = dom.createTextNode(Integer.toString(p.GetDefence()));
		defEle.appendChild(defText);

		Element stamEle = dom.createElement("Uithoudingsvermogen");
		Text stamText = dom.createTextNode(Integer.toString(p.GetStamina()));
		stamEle.appendChild(stamText);

		Element pnumEle = dom.createElement("Rugnummer");
		Text pnumText = dom
				.createTextNode(Integer.toString(p.GetPlayerNumber()));
		pnumEle.appendChild(pnumText);

		Element actEle = dom.createElement("Beschikbaarheid");
		Text actText = dom.createTextNode(String.valueOf(p.GetIsActive()));
		actEle.appendChild(actText);

		Element priceEle = dom.createElement("Prijs");
		Text priceText = dom.createTextNode(Integer.toString(p.GetPrice()));
		priceEle.appendChild(priceText);

		playEle.appendChild(firstnEle);
		playEle.appendChild(lastnEle);
		playEle.appendChild(offEle);
		playEle.appendChild(defEle);
		playEle.appendChild(stamEle);
		playEle.appendChild(pnumEle);
		playEle.appendChild(actEle);
		playEle.appendChild(priceEle);

		return playEle;
	}

	private void printToFile(String infile) {

		try {
			// print
			OutputFormat format = new OutputFormat(dom);
			format.setIndenting(true);

			// to generate output to console use this serializer
			// XMLSerializer serializer = new XMLSerializer(System.out, format);

			FileOutputStream out = new FileOutputStream(new File(infile));

			XMLSerializer serializer = new XMLSerializer(out, format);

			serializer.serialize(dom);

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public void SaveXMLFile(Division in, String infile) {
		createDocument();
		System.out.println("Started .. ");
		createDOMTree(in);
		printToFile(infile);
		System.out.println("Generated file successfully.");
	}

	

	private Element createTeamElement(Team in) {
		Element teamEle = dom.createElement("Team");
		
		Element nameEle = dom.createElement("Name");
		Text nameText = dom.createTextNode(in.getName());
		nameEle.appendChild(nameText);
		
		Element budgetEle = dom.createElement("Budget");
		Text budgetText = dom.createTextNode(Integer.toString(in.getBudget()));
		budgetEle.appendChild(budgetText);
		
		Element controlledEle = dom.createElement("Spelergestuurd");
		Text controlledText = dom.createTextNode(String.valueOf(in.GetPcControlled()));
		controlledEle.appendChild(controlledText);
		
		Element dpvoorEle = dom.createElement("DoelpuntenVoor");
		Text dpvoorText = dom.createTextNode(Integer.toString(in.GetDoelpuntenVoor()));
		dpvoorEle.appendChild(dpvoorText);
		
		Element dptegenEle = dom.createElement("DoelpuntenTegen");
		Text dptegenText = dom.createTextNode(Integer.toString(in.GetDoelpuntenTegen()));
		dptegenEle.appendChild(dptegenText);
		
		Element dpsaldoEle = dom.createElement("Doelsaldo");
		Text dpsaldoText = dom.createTextNode(Integer.toString(in.GetDoelpuntenSaldo()));
		dpsaldoEle.appendChild(dpsaldoText);
		
		Element psaldoEle = dom.createElement("Punten");
		Text psaldoText = dom.createTextNode(Integer.toString(in.GetPuntenSaldo()));
		psaldoEle.appendChild(psaldoText);
		
		teamEle.appendChild(nameEle);
		teamEle.appendChild(budgetEle);
		teamEle.appendChild(controlledEle);
		teamEle.appendChild(dpvoorEle);
		teamEle.appendChild(dptegenEle);
		teamEle.appendChild(dpsaldoEle);
		teamEle.appendChild(psaldoEle);
		
		for (int i = 0; i < in.size(); i++) {
			Element playEle = createPlayerElement(in.get(i));
			teamEle.appendChild(playEle);

		}
		return teamEle;
	}
}
