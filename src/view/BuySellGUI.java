package view;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controller.*;
import model.*;

public class BuySellGUI extends JFrame implements ActionListener{
    JComboBox<String> teamList = new JComboBox<String>();
    JComboBox<String> spelerList = new JComboBox<String>();
    private boolean change = true;
    JButton b3;
    JLabel t2;
    JLabel t3;
    JLabel t4;
    GUI gui;
	
	GridBagLayout k = new GridBagLayout();
	JPanel pane = new JPanel();
	
	public BuySellGUI(JPanel k, GUI gu){
	   	setSize(1080,720);
		initUI(k);
		gui = gu;
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
        
    	String[] teams = {"ADO Den Haag", "Ajax", "AZ", "Excelsior", "FC Dordrecht", "FC Groningen", "FC Twente", "FC Utrecht", "Feyenoord", "Go Ahead Eagles", "Heracles Almelo", "NAC Breda", "PEC Zwolle", "PSV", "SC Cambuur", "SC Heerenveen", "Vitesse", "Willem II"};
        for(int i = 0; i < teams.length; i++){
        	if(!teams[i].equals(FootballManager.getPc().getName()))
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
        c.gridy = 4;
        c.gridwidth = 2;
        pane.add(b3,c);
        b3.addActionListener(this);
        b3.setVisible(false);
        
        t2 = new JLabel("Not enough Money");
        t2.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        c.gridy = 5;
        c.gridwidth = 2;
        pane.add(t2,c);
        t2.setVisible(false);
        
        t4 = new JLabel("Player Bought!");
        t4.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        c.gridy = 5;
        c.gridwidth = 2;
        pane.add(t4,c);
        t4.setVisible(false);
        
        JButton b4 = new JButton("Go Back");
        c.gridy = 7;
        pane.add(b4,c);
        b4.addActionListener(this);
        
        t3 = new JLabel();
        String bud = Integer.toString(FootballManager.getPc().getBudget());
        t3.setText("Budget: " + bud);
        c.gridy = 6;
        pane.add(t3,c);
        
        add(pane);
	}
	
	public void actionPerformed(ActionEvent e) {
		String choice = e.getActionCommand();
		if (choice.equals("Accept")){
			
		}
		else if (choice.equals("Decline")){
			
		}
		else if(choice.equals("Go Back")){
			gui.update();
			gui.repaint();
			gui.revalidate();
			gui.setVisible(true);
			dispose();
		}
		else if(choice.equals("Buy")){
			t2.setVisible(false);
			t4.setVisible(false);
			int speler = spelerList.getSelectedIndex();
			String team = teamList.getSelectedItem().toString();
			Team t1 = getTeam(team);
			Player p1 = t1.get(speler);
			if(FootballManager.getPc().getBudget() >= p1.GetPrice()){
				t3.removeAll();
				t4.setVisible(true);
				FootballManager.getPc().setBudget((FootballManager.getPc().getBudget() - p1.GetPrice()));
				FootballManager.getPc().buy(p1);
				getTeam(team).removePlayer(speler);
				String bg = Integer.toString(FootballManager.getPc().getBudget());
				t3.setText("Budget:" + bg);
				t3.repaint();
				t3.revalidate();
			}
			else{
				t2.setVisible(true);
			}
			change = false;
			if(t1 != null){
				spelerList.removeAllItems();
				for(int i = 0; i < t1.size(); i++){
					spelerList.addItem(t1.get(i).toStringTransfer());
				}
			repaint();
			revalidate();
			change = true;
			}
		}
		else if (change && e.getSource() == teamList){
			change = false;
			String team2 = teamList.getSelectedItem().toString();
		
			Team t2 = getTeam(team2);
			if(t2 != null){
				spelerList.removeAllItems();
				for(int i = 0; i < t2.size(); i++){
					spelerList.addItem(t2.get(i).toStringTransfer());
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
		for(int i = 0; i < FootballManager.getDiv().Size(); i++){
			if(FootballManager.getDiv().get(i).getName().equals(team)){
				t1 = FootballManager.getDiv().get(i);
			}
		}
		return t1;
	}
}
