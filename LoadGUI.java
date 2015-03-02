import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LoadGUI extends JFrame implements ActionListener{

	GridBagLayout k = new GridBagLayout();
	JPanel pane = new JPanel(k);
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JLabel t1;
	int cs;
	Division div = null;
	String team1 = null;
	
	public LoadGUI(){
		setSize(1080,720);
		initUI();
	}

	private final void initUI() {

		GridBagLayout k = new GridBagLayout();
		JPanel pane = new JPanel(k);
		
    	pane.setLayout(k);
    	GridBagConstraints c = new GridBagConstraints();
    	c.fill = GridBagConstraints.BOTH;
    	
    	c.insets = new Insets(5,5,5,5);
    	
        pane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        b1 = new JButton("Save 1");
        c.gridx = 0;
        c.gridy = 0;
        pane.add(b1,c);
        b1.addActionListener(this);
        
        b2 = new JButton("Save 2");
        c.gridx = 0;
        c.gridy = 1;
        pane.add(b2,c);
        b2.addActionListener(this);
        
        b3 = new JButton("Save 3");
        c.gridx = 0;
        c.gridy = 2;
        pane.add(b3,c);
        b3.addActionListener(this);
        
        b4 = new JButton("Start");
        c.gridx = 0;
        c.gridy = 3;
        pane.add(b4,c);
        b4.addActionListener(this);
        b4.setVisible(false);
        
        b5 = new JButton("Back");
        c.gridx = 1;
        c.gridy = 3;
        pane.add(b5,c);
        b5.addActionListener(this);
        
        t1 = new JLabel();
        t1.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 3;
        pane.add(t1,c);
        
        add(pane);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Save 1
		if(e.getSource().equals(b1)){
			//Laad save 1
			b4.setVisible(true);
			Division res = new Division(1,true);
			readXML test = new readXML();
			test.LoadXMLFile(res, "src/save1.xml");

			for(int i = 0; i < 18; i++){
				if(res.get(i).GetPcControlled()){
					String team2 = res.get(i).getName();
					team1 = team2;
				}
			}
			t1.removeAll();
			t1.setText("Team: " + team1);
			t1.repaint();
			t1.revalidate();
			repaint();
			revalidate();
			div = res;
		}
		else if(e.getSource().equals(b2)){
			//Laad save 2
			b4.setVisible(true);
			Division res = new Division(1, true);
			readXML test = new readXML();
			test.LoadXMLFile(res, "src/save2.xml");
			for(int i = 0; i < 18; i++){
				if(res.get(i).GetPcControlled()){
					String team2 = res.get(i).getName();
					team1 = team2;
				}
			}
			t1.removeAll();
			t1.setText("Team: " + team1);
			t1.repaint();
			t1.revalidate();
			repaint();
			revalidate();
			div = res;
		}
		else if(e.getSource().equals(b3)){
			//Laad save 3
			b4.setVisible(true);
			Division res = new Division(1, true);
			readXML test = new readXML();
			test.LoadXMLFile(res, "src/save3.xml");
			for(int i = 0; i < 18; i++){
				if(res.get(i).GetPcControlled()){
					String team2 = res.get(i).getName();
					team1 = team2;
				}
			}
			t1.removeAll();
			t1.setText("Team: " + team1);
			t1.repaint();
			t1.revalidate();
			repaint();
			revalidate();
			div = res;
		}
		else if(e.getSource().equals(b4)){
			FootballManager.setDiv(div);
			FootballManager.update();
			dispose();
			GUI g = new GUI();
			g.setVisible(true);
		}
		
		else if(e.getSource().equals(b5)){
			dispose();
		}
	}
}
