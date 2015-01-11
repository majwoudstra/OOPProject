import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class GUI extends JFrame implements ActionListener{
	
	static division div = new division();
	public static Team te1 = new Team("Not Set Yet");
	static Team ado = new Team("ADO");
	static Team aja = new Team("Ajax");
	int i = 0;
	
	static Player p1 = new Player("1", 10, 10, 10, 1, 100000, true);
	static Player p2 = new Player("2", 10, 10, 10, 2,100000, true);
	static Player p3 = new Player("3", 10, 10, 10, 3,100000, true);
	static Player p4 = new Player("4", 10, 10, 10, 4,100000, true);
	static Player p5 = new Player("5", 10, 10, 10, 5,100000, true);
	static Player p6 = new Player("6", 10, 10, 10, 6,100000, true);
	static Player p7 = new Player("7", 10, 10, 10, 7,100000, true);
	static Player p8 = new Player("8", 10, 10, 10, 8,100000, true);
	static Player p9 = new Player("9", 10, 10, 10, 9,100000, true);
	static Player p10 = new Player("10", 10, 10, 10, 10,100000, true);
	static Player p11 = new Player("11", 10, 10, 10, 11,100000, true);
	static Player p12 = new Player("12", 10, 10, 10, 12,100000,false);
	static Player p13 = new Player("13", 10, 10, 10, 13,100000, false);
	static Player p14 = new Player("14", 10, 10, 10, 14,100000, false);
	static Player p15 = new Player("15", 10, 10, 10, 15,100000, false);
	static Player p16 = new Player("16", 10, 10, 10, 16,100000, false);
	static Player p17 = new Player("17", 10, 10, 10, 17,100000, false);
	static Player p18 = new Player("18", 10, 10, 10, 18,100000, false);
	static Player p19 = new Player("19", 10, 10, 10, 19,100000, false);
	static Player p20 = new Player("20", 10, 10, 10, 20,100000, false);
	static Player p21 = new Player("21", 10, 10, 10, 21,100000, false);
	
	static Player a1 = new Player("Ajax1", 10, 10,10, 1,300000, true);
	static Player a2 = new Player("Ajax2", 10, 10,10, 2,200000, true);
	static Player a3 = new Player("Ajax3", 10, 10,10, 3,100000, true);
	static Player a4 = new Player("Ajax4", 10, 10,10, 4,100000, true);
	static Player a5 = new Player("Ajax5", 10, 10,10, 5,100000, true);
	static Player a6 = new Player("Ajax6", 10, 10,10, 6,100000, true);
	static Player a7 = new Player("Ajax7", 10, 10,10, 7,100000, true);
	static Player a8 = new Player("Ajax8", 10, 10,10, 8,100000, true);
	static Player a9 = new Player("Ajax9", 10, 10,10, 9,100000, true);
	static Player a10 = new Player("Ajax10", 10, 10,10, 10, 100000,true);
	static Player a11 = new Player("Ajax11", 10, 10,10, 11,100000, true);
	
	static ArrayList<Player> selectie = new ArrayList<Player>();
	static ArrayList<Player> wissels = new ArrayList<Player>();
	
	public static int defence = 4;
	public static int midfield = 3;
	public static int offence = 3;
	
	public static String team = "Not Set Yet";
	GridBagLayout k = new GridBagLayout();
	JPanel pane = new JPanel(k);
	JPanel jp = new JPanel();
    JComboBox<String> spelersList1 = new JComboBox<String>();
    JComboBox<String> spelersList2 = new JComboBox<String>();
    JComboBox<String> spelersList3 = new JComboBox<String>();
    JComboBox<String> spelersList4 = new JComboBox<String>();
    JComboBox<String> spelersList5 = new JComboBox<String>();
    JComboBox<String> spelersList6 = new JComboBox<String>();
    JComboBox<String> spelersList7 = new JComboBox<String>();
    JComboBox<String> spelersList8 = new JComboBox<String>();
    JComboBox<String> spelersList9 = new JComboBox<String>();
    JComboBox<String> spelersList10 = new JComboBox<String>();
    JComboBox<String> spelersList11 = new JComboBox<String>();
    boolean change = false;


    public GUI() {
    	setSize(1080,720);
        initUI();
    }

    private final void initUI() {
    	

    	pane.setLayout(k);
    	GridBagConstraints c = new GridBagConstraints();
    	c.fill = GridBagConstraints.BOTH;
    	
    	Insets def = new Insets(5,5,5,5);
        
        JButton b1 = new JButton("NEW");
        c.weightx = 0.5;
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,50,5);
        c.anchor = GridBagConstraints.PAGE_START;
        pane.add(b1, c);
        
        JButton b2 = new JButton("SAVE");
        c.gridx = 1;
        pane.add(b2, c);
        
        JButton b3 = new JButton("LOAD");
        c.gridx = 2;
        pane.add(b3,c);
        
        JButton b4 = new JButton("QUIT");
        c.gridx = 3;
        pane.add(b4,c);
        c.insets = def;
        c.weighty = 0.5;
        
        
        jp.setLayout(new BoxLayout(jp, BoxLayout.PAGE_AXIS));
        c.ipady = 100;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.gridheight = 2;
        c.insets = new Insets(5,5,5,30);
        pane.add(jp, c);
        jp.add(new JLabel("Opstelling"));

        
        JLabel t3 = new JLabel("Lijst Wisselspelers");
        t3.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        c.ipady = 60;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(t3,c);
        
//        JButton b7 = new JButton("Lijst Wisselspelers");
//        c.ipady = 50;
//        c.gridx = 0;
//        c.gridy = 4;
//        pane.add(b7,c);
        
        c.insets = def;
        c.gridwidth = 1;
        c.gridheight = 1;
        
        JButton b8 = new JButton("Koop/Verkoop");
        c.ipady = 20;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(b8,c);
        
        JButton b9 = new JButton("Opstelling");
        c.gridx = 3;
        c.gridy = 1;
        pane.add(b9,c);
        
        JLabel t4 = new JLabel("Vorig Resultaat");
        t4.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        c.gridx = 2;
        c.gridy = 2;
        pane.add(t4,c);
        
        JButton b10 = new JButton("Start Wedstrijd");
        c.gridx = 2;
        c.gridy = 3;
        c.gridheight = 2;
        pane.add(b10,c);
        
        JLabel t1 = new JLabel();
		t1.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        String rang = "<html>" + "Stand" + "<br>" + "1e<br>2e<br>etc.." + "</html>";
        t1.setText(rang);
        c.weightx = 1;
        c.gridx = 3;
        c.gridy = 2;
        c.gridheight = 2;
        pane.add(t1,c);
        
        JLabel t2 = new JLabel();
        t2.setBorder(BorderFactory.createLineBorder(new Color(0,0,100)));
        t2.setText("Notificaties:");
        c.gridx = 3;
        c.gridy = 4;
        pane.add(t2,c);
        
        
        spelersList1.addItem(selectie.get(0).toStringRug());
        for(int i = 1; i < wissels.size(); i++)
        	spelersList1.addItem(wissels.get(i).toStringRug());
        spelersList1.addActionListener(this);
        spelersList2.addItem(selectie.get(1).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList2.addItem(wissels.get(i).toStringRug());
        spelersList2.addActionListener(this);
        spelersList3.addItem(selectie.get(2).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList3.addItem(wissels.get(i).toStringRug());
        spelersList3.addActionListener(this);
        spelersList4.addItem(selectie.get(3).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList4.addItem(wissels.get(i).toStringRug());
        spelersList4.addActionListener(this);
        spelersList5.addItem(selectie.get(4).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList5.addItem(wissels.get(i).toStringRug());
        spelersList5.addActionListener(this);
        spelersList6.addItem(selectie.get(5).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList6.addItem(wissels.get(i).toStringRug());
        spelersList6.addActionListener(this);
        spelersList7.addItem(selectie.get(6).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList7.addItem(wissels.get(i).toStringRug());
        spelersList7.addActionListener(this);
        spelersList8.addItem(selectie.get(7).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList8.addItem(wissels.get(i).toStringRug());
        spelersList8.addActionListener(this);
        spelersList9.addItem(selectie.get(8).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList9.addItem(wissels.get(i).toStringRug());
        spelersList9.addActionListener(this);
        spelersList10.addItem(selectie.get(9).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList10.addItem(wissels.get(i).toStringRug());
        spelersList10.addActionListener(this);
        spelersList11.addItem(selectie.get(10).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList11.addItem(wissels.get(i).toStringRug());
        spelersList11.addActionListener(this);
        
        spelersList1.setName("1");
        spelersList2.setName("2");
        spelersList3.setName("3");
        spelersList4.setName("4");
        spelersList5.setName("5");
        spelersList6.setName("6");
        spelersList7.setName("7");
        spelersList8.setName("8");
        spelersList9.setName("9");
        spelersList10.setName("10");
        spelersList11.setName("11");
        
        jp.add(new JLabel("Keeper"));
        jp.add(spelersList1);
        jp.add(new JLabel("Defense"));
        jp.add(spelersList2);
        
        if(defence == 1){
            jp.add(new JLabel("Midfield"));
        }
        
        jp.add(spelersList3);
        
        if(defence == 2){
            jp.add(new JLabel("Midfield"));
        }
        
        jp.add(spelersList4);
        
        if(defence == 3){
            jp.add(new JLabel("Midfield"));
        }
        jp.add(spelersList5);
        if(defence == 4){
            jp.add(new JLabel("Midfield"));
        }
    
        jp.add(spelersList6);
        if(defence == 5){
            jp.add(new JLabel("Midfield"));
        }
        if(midfield + defence == 5){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList7);
        if(midfield + defence == 6){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList8);
        if(midfield + defence == 7){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList9);
        if(midfield + defence == 8){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList10);
        if(midfield + defence == 9){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList11);

        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
//        b6.addActionListener(this);
//        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);

        pane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(pane);
        change = true;

    }

    public static void main(String[] args) {
    	

    	ado.add(p1);
    	ado.add(p2);
    	ado.add(p3);
    	ado.add(p4);
    	ado.add(p5);
    	ado.add(p6);
    	ado.add(p7);
    	ado.add(p8);
    	ado.add(p9);
    	ado.add(p10);
    	ado.add(p11);
    	ado.add(p12);
    	ado.add(p13);
    	ado.add(p14);
    	ado.add(p15);
    	ado.add(p16);
    	ado.add(p17);
    	ado.add(p18);
    	ado.add(p19);
    	ado.add(p20);
    	ado.add(p21);
    	
    	aja.add(a1);
    	aja.add(a2);
    	aja.add(a3);
    	aja.add(a4);
    	aja.add(a5);
    	aja.add(a6);
    	aja.add(a7);
    	aja.add(a8);
    	aja.add(a9);
    	aja.add(a10);
    	aja.add(a11);
    	
    	div.add(ado);
    	div.add(aja);

    	if(!te1.getName().equals("Not Set Yet")){
	    	for(int i = 0; i < 11; i++){
	    		selectie.add(te1.get(i));
	    	}
	
	    	for(int i = 0; i < te1.getTeam().size(); i++){
	    		if(!te1.getTeam().get(i).GetIsActive()){
	    			wissels.add(te1.getTeam().get(i));
	    		}
	    	}
    	}
    	else{
    		for(int i = 0; i < 11; i++){
    			selectie.add(new Player("Blank", 10,10,10,(i+1),100000, true));
    		}
    	}
    	
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI ex = new GUI();
                ex.setVisible(true);
            }
        });
    }
    

	@Override
	public void actionPerformed(ActionEvent e)  {
		if(change){
			String choice = e.getActionCommand();
			if (choice.equals("NEW")){
				NewGameGUI n = new NewGameGUI(pane, this);
				//pane.setVisible(false);
				n.setVisible(true);
				//this.setVisible(false);
				System.out.println("You pressed the new button");
			}
			else if (choice.equals("SAVE")){
				System.out.println("You pressed the save button");
			}
			else if (choice.equals("LOAD")){
				System.out.println(ado.toString());
			}else if (choice.equals("QUIT")){
				dispose();
			}else if (choice.equals("Spelers aanpassen")){
				System.out.println("You pressed the spelers aanpassen button");
			}else if (choice.equals("Lijst Wisselspelers")){
				System.out.println("You pressed the lijst wisselspelers button");
			}else if (choice.equals("Koop/Verkoop")){
				BuySellGUI b = new BuySellGUI(pane, this);
				b.setVisible(true);
				this.setVisible(false);
			}else if (choice.equals("Start Wedstrijd")){
				System.out.println("You pressed the start wedstrijd button");
			}else if (choice.equals("Opstelling")){
				OpstellingGUI o = new OpstellingGUI(pane, this);
				this.setVisible(false);
				o.setVisible(true);
				System.out.println("You pressed the opstelling button");
			}else if (choice.equals("comboBoxChanged")){
				change = false;
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				String speler = (String)cb.getSelectedItem();
				String[] parts = speler.split("-");
				int rn = Integer.parseInt(parts[0]);			
				String source = e.getSource().toString();
				String[] naam = source.split(",");
				String nm = naam[0].substring(22);
				Player wissel = null;
				boolean found = false;
				for(int i = 0; i < wissels.size(); i++){
					if (wissels.get(i).GetPlayerNumber() == rn && !found){
						wissel = wissels.get(i);
						found = true;
					}
				}
				int loc = wissels.indexOf(wissel);
				int box = Integer.parseInt(nm);
				if(loc != -1){
					wissels.set(loc, selectie.get(box-1));
					selectie.set(box-1,wissel);
					update();
					repaint();
					revalidate();
				}
				change = true;
			}
		}
	}
	public static void updateTeam(){
		selectie = new ArrayList<Player>();
		wissels = new ArrayList<Player>();
		
		if(team.equals("ADO")){
			te1 = ado;
		}
		else if(team.equals("Ajax")){
			te1 = aja;
		}
		else if(team.equals("AZ")){
			//te1 = aja;
		}
		else if(team.equals("Excelsior")){
			//te1 = aja;
		}
		else if(team.equals("FC Dordrecht")){
			//te1 = aja;
		}
		else if(team.equals("FC Groningen")){
			//te1 = aja;
		}
		else if(team.equals("FC Twente")){
			//te1 = aja;
		}
		else if(team.equals("FC Utrecht")){
			//te1 = aja;
		}
		else if(team.equals("Feyenoord")){
			//te1 = aja;
		}
		else if(team.equals("Go Ahead Eagles")){
			//te1 = aja;
		}
		else if(team.equals("Heracles Almelo")){
			//te1 = aja;
		}
		else if(team.equals("NAC Breda")){
			//te1 = aja;
		}
		else if(team.equals("PEC Zwolle")){
			//te1 = aja;
		}
		else if(team.equals("PSV")){
			//te1 = aja;
		}
		else if(team.equals("SC Cambuur")){
			//te1 = aja;
		}
		else if(team.equals("SC Heereveen")){
			//te1 = aja;
		}
		else if(team.equals("Vitesse")){
			//te1 = aja;
		}
		else if(team.equals("Willem II")){
			//te1 = aja;
		}
		
    	if(!te1.getName().equals("Not Set Yet")){
	    	for(int i = 0; i < 11; i++){
	    		selectie.add(te1.get(i));
	    	}
	
	    	for(int i = 0; i < te1.getTeam().size(); i++){
	    		if(!te1.getTeam().get(i).GetIsActive()){
	    			wissels.add(te1.getTeam().get(i));
	    		}
	    	}
    	}
	}
	
	public void update(){
		change = false;
		jp.removeAll();
		spelersList1.removeAllItems();
		spelersList2.removeAllItems();
		spelersList3.removeAllItems();
		spelersList4.removeAllItems();
		spelersList5.removeAllItems();
		spelersList6.removeAllItems();
		spelersList7.removeAllItems();
		spelersList8.removeAllItems();
		spelersList9.removeAllItems();
		spelersList10.removeAllItems();
		spelersList11.removeAllItems();
		
        spelersList1.addItem(selectie.get(0).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList1.addItem(wissels.get(i).toStringRug());
        spelersList1.addActionListener(this);
        spelersList2.addItem(selectie.get(1).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList2.addItem(wissels.get(i).toStringRug());
        spelersList2.addActionListener(this);
        spelersList3.addItem(selectie.get(2).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList3.addItem(wissels.get(i).toStringRug());
        spelersList3.addActionListener(this);
        spelersList4.addItem(selectie.get(3).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList4.addItem(wissels.get(i).toStringRug());
        spelersList4.addActionListener(this);
        spelersList5.addItem(selectie.get(4).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList5.addItem(wissels.get(i).toStringRug());
        spelersList5.addActionListener(this);
        spelersList6.addItem(selectie.get(5).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList6.addItem(wissels.get(i).toStringRug());
        spelersList6.addActionListener(this);
        spelersList7.addItem(selectie.get(6).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList7.addItem(wissels.get(i).toStringRug());
        spelersList7.addActionListener(this);
        spelersList8.addItem(selectie.get(7).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList8.addItem(wissels.get(i).toStringRug());
        spelersList8.addActionListener(this);
        spelersList9.addItem(selectie.get(8).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList9.addItem(wissels.get(i).toStringRug());
        spelersList9.addActionListener(this);
        spelersList10.addItem(selectie.get(9).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList10.addItem(wissels.get(i).toStringRug());
        spelersList10.addActionListener(this);
        spelersList11.addItem(selectie.get(10).toStringRug());
        for(int i = 0; i < wissels.size(); i++)
        	spelersList11.addItem(wissels.get(i).toStringRug());
        spelersList11.addActionListener(this);
		
        jp.add(new JLabel("Opstelling"));
        jp.add(new JLabel("Keeper"));
        jp.add(spelersList1);
        jp.add(new JLabel("Defense"));
        jp.add(spelersList2);
        
        if(defence == 1){
            jp.add(new JLabel("Midfield"));
        }
        
        jp.add(spelersList3);
        
        if(defence == 2){
            jp.add(new JLabel("Midfield"));
        }
        
        jp.add(spelersList4);
        
        if(defence == 3){
            jp.add(new JLabel("Midfield"));
        }
        jp.add(spelersList5);
        if(defence == 4){
            jp.add(new JLabel("Midfield"));
        }
    
        jp.add(spelersList6);
        if(defence == 5){
            jp.add(new JLabel("Midfield"));
        }
        if(midfield + defence == 5){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList7);
        if(midfield + defence == 6){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList8);
        if(midfield + defence == 7){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList9);
        if(midfield + defence == 8){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList10);
        if(midfield + defence == 9){
            jp.add(new JLabel("Offense"));
        }
        jp.add(spelersList11);
        repaint();
        revalidate();
        change = true;
	}
}
