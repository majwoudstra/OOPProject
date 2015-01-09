import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class GUI extends JFrame implements ActionListener{
	
	static Team te1 = new Team();
	int i = 0;
	
	static Player p1 = new Player("1", 10, 10, 10, 1, true);
	static Player p2 = new Player("2", 10, 10, 10, 2, true);
	static Player p3 = new Player("3", 10, 10, 10, 3, true);
	static Player p4 = new Player("4", 10, 10, 10, 4, true);
	static Player p5 = new Player("5", 10, 10, 10, 5, true);
	static Player p6 = new Player("6", 10, 10, 10, 6, true);
	static Player p7 = new Player("7", 10, 10, 10, 7, true);
	static Player p8 = new Player("8", 10, 10, 10, 8, true);
	static Player p9 = new Player("9", 10, 10, 10, 9, true);
	static Player p10 = new Player("10", 10, 10, 10, 10, true);
	static Player p11 = new Player("11", 10, 10, 10, 11, true);
	static Player p12 = new Player("12", 10, 10, 10, 12, false);
	static Player p13 = new Player("13", 10, 10, 10, 13, false);
	static Player p14 = new Player("14", 10, 10, 10, 14, false);
	static Player p15 = new Player("15", 10, 10, 10, 15, false);
	static Player p16 = new Player("16", 10, 10, 10, 16, false);
	static Player p17 = new Player("17", 10, 10, 10, 17, false);
	static Player p18 = new Player("18", 10, 10, 10, 18, false);
	static Player p19 = new Player("19", 10, 10, 10, 19, false);
	static Player p20 = new Player("20", 10, 10, 10, 20, false);
	static Player p21 = new Player("21", 10, 10, 10, 21, false);
	
	static ArrayList<Player> selectie = new ArrayList<Player>();
	static ArrayList<Player> wissels = new ArrayList<Player>();
	
	public static int defence = 4;
	public static int midfield = 3;
	public static int offence = 3;
	
	private String[] wedTeam = {"0- CurrentPlayer", "1- Player1", "2- Player 2", "4- Player 4"};
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
    	

    	te1.add(p1);
    	te1.add(p2);
    	te1.add(p3);
    	te1.add(p4);
    	te1.add(p5);
    	te1.add(p6);
    	te1.add(p7);
    	te1.add(p8);
    	te1.add(p9);
    	te1.add(p10);
    	te1.add(p11);
    	te1.add(p12);
    	te1.add(p13);
    	te1.add(p14);
    	te1.add(p15);
    	te1.add(p16);
    	te1.add(p17);
    	te1.add(p18);
    	te1.add(p19);
    	te1.add(p20);
    	te1.add(p21);

    	for(int i = 0; i < 11; i++){
    		selectie.add(te1.get(i));
    	}

    	for(int i = 0; i < te1.getTeam().size(); i++){
    		if(!te1.getTeam().get(i).GetIsActive()){
    			wissels.add(te1.getTeam().get(i));
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
				NewGameGUI n = new NewGameGUI(pane);
				//pane.setVisible(false);
				n.setVisible(true);
				System.out.println("You pressed the new button");
			}
			else if (choice.equals("SAVE")){
				System.out.println("You pressed the save button");
			}
			else if (choice.equals("LOAD")){
				System.out.println(te1.toString());
			}else if (choice.equals("QUIT")){
				dispose();
			}else if (choice.equals("Spelers aanpassen")){
				System.out.println("You pressed the spelers aanpassen button");
			}else if (choice.equals("Lijst Wisselspelers")){
				System.out.println("You pressed the lijst wisselspelers button");
			}else if (choice.equals("Koop/Verkoop")){
				BuySellGUI b = new BuySellGUI(pane);
				b.setVisible(true);
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
				int loc2 = loc - 1;
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
	
	public void update(){
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
	}
}
