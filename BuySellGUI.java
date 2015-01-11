import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BuySellGUI extends JFrame implements ActionListener{
    JComboBox<String> teamList = new JComboBox<String>();
    JComboBox<String> spelerList = new JComboBox<String>();
    private boolean change = true;
    JButton b3;
	
	GridBagLayout k = new GridBagLayout();
	JPanel pane = new JPanel();
	
	public BuySellGUI(JPanel k){
	   	setSize(1080,720);
		initUI(k);
	}
	
	
	private final void initUI(JPanel p) {

    	pane.setLayout(k);
    	GridBagConstraints c = new GridBagConstraints();
    	c.fill = GridBagConstraints.BOTH;
    	
    	c.insets = new Insets(5,5,5,5);
    	
        pane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        JLabel t1 = new JLabel();
        t1.setText("<html>Current offer<br>Name Price By<br>Henk 200 ADO</html>");
		t1.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        pane.add(t1,c);
        
        JButton b1 = new JButton("Accept");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        pane.add(b1,c);
        b1.addActionListener(this);
        
        JButton b2 = new JButton("Decline");
        c.gridx = 1;
        c.gridy = 1;
        pane.add(b2,c);
        b2.addActionListener(this);
        
    	String[] teams = {"ADO", "Ajax", "AZ", "Excelsior", "FC Dordrecht", "FC Groningen", "FC Twente", "FC Utrecht", "Feyenoord", "Go Ahead Eagles", "Heracles Almelo", "NAC Breda", "PEC Zwolle", "PSV", "SC Cambuur", "SC Heereveen", "Vitesse", "Willem II"};
        for(int i = 0; i < teams.length; i++){
        	if(!teams[i].equals(GUI.team))
        		teamList.addItem(teams[i].toString());
        }
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        pane.add(teamList,c);
        teamList.addActionListener(this);
        
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        pane.add(spelerList,c);
        spelerList.addActionListener(this);
        spelerList.setVisible(false);
        
        b3 = new JButton("Buy");
        c.gridx = 0;
        c.gridx = 4;
        c.gridwidth = 2;
        pane.add(b3,c);
        b3.addActionListener(this);
        b3.setVisible(false);
        
        add(pane);
	}
	
	public void actionPerformed(ActionEvent e) {
		String choice = e.getActionCommand();
		if (choice.equals("Accept")){
			
		}
		else if (choice.equals("Decline")){
			
		}
		else if(choice.equals("Buy")){
			int speler = spelerList.getSelectedIndex();
			
		}
		else if (change && e.getSource() == teamList){
			change = false;
			String team = teamList.getSelectedItem().toString();
			
			Team t1 = getTeam(team);
			if(t1 != null){
				spelerList.removeAllItems();
				for(int i = 0; i < t1.size(); i++){
					spelerList.addItem(t1.get(i).toStringRug());
				}
				spelerList.setVisible(true);
				b3.setVisible(true);
				repaint();
				revalidate();
			}
			change = true;
		}
		else{
			System.out.println(spelerList.getSelectedItem());
		}
	}
	
	public static Team getTeam(String team){
		Team t1 = null;
		for(int i = 0; i < GUI.div.Size(); i++){
			if(GUI.div.get(i).getName().equals(team)){
				t1 = GUI.div.get(i);
			}
		}
		return t1;
	}
}
