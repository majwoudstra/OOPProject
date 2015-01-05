import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
	
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
    static Team t1 = new Team();


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
        JLabel label = new JLabel("Opstelling");
        jp.add(label);

        
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
        
        
        wedTeam[0] = "0- Keeper";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList1.addItem(wedTeam[i].toString());
        spelersList1.addActionListener(this);
        wedTeam[0] = "0- Defense 1";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList2.addItem(wedTeam[i].toString());
        spelersList2.addActionListener(this);
        wedTeam[0] = "0- Defense 2";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList3.addItem(wedTeam[i].toString());
        spelersList3.addActionListener(this);
        wedTeam[0] = "0- Defense 3";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList4.addItem(wedTeam[i].toString());
        spelersList4.addActionListener(this);
        wedTeam[0] = "0- Defense 4";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList5.addItem(wedTeam[i].toString());
        spelersList5.addActionListener(this);
        wedTeam[0] = "0- Midfield 1";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList6.addItem(wedTeam[i].toString());
        spelersList6.addActionListener(this);
        wedTeam[0] = "0- Midfield 2";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList7.addItem(wedTeam[i].toString());
        spelersList7.addActionListener(this);
        wedTeam[0] = "0- Midfield 3";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList8.addItem(wedTeam[i].toString());
        spelersList8.addActionListener(this);
        wedTeam[0] = "0- Offense 1";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList9.addItem(wedTeam[i].toString());
        spelersList9.addActionListener(this);
        wedTeam[0] = "0- Offense 2";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList10.addItem(wedTeam[i].toString());
        spelersList10.addActionListener(this);
        wedTeam[0] = "0- Offense 3";
        for(int i = 0; i < wedTeam.length; i++)
        	spelersList11.addItem(wedTeam[i].toString());
        spelersList11.addActionListener(this);
        
        spelersList1.setName("gokf");
        spelersList2.setName("def1");
        spelersList3.setName("def2");
        spelersList4.setName("def3");
        spelersList5.setName("def4");
        spelersList6.setName("mif1");
        spelersList7.setName("mif2");
        spelersList8.setName("mif3");
        spelersList9.setName("off1");
        spelersList10.setName("off2");
        spelersList11.setName("off3");
        
        jp.add(new JLabel("Keeper"));
        jp.add(spelersList1);
        jp.add(new JLabel("Defense"));
        jp.add(spelersList2);
        jp.add(spelersList3);
        jp.add(spelersList4);
        jp.add(spelersList5);
        jp.add(new JLabel("Midfield"));
        jp.add(spelersList6);
        jp.add(spelersList7);
        jp.add(spelersList8);
        jp.add(new JLabel("Offense"));
        jp.add(spelersList9);
        jp.add(spelersList10);
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

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI ex = new GUI();
                ex.setVisible(true);
            }
        });
    }
    

	@Override
	public void actionPerformed(ActionEvent e)  {
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
			System.out.println(t1.toString());
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
			OpstellingGUI o = new OpstellingGUI(pane);
			o.setVisible(true);
			System.out.println("You pressed the opstelling button");
		}else if (change){
			JComboBox<String> cb = (JComboBox<String>)e.getSource();
			String speler = (String)cb.getSelectedItem();
			String[] parts = speler.split("-");
			int rn = Integer.parseInt(parts[0]);			
			String source = e.getSource().toString();
			String[] naam = source.split(",");
			String nm = naam[0].substring(22);
			System.out.println(rn);
			System.out.println(nm);
		}
	}
	
	private void update(){
		change = false;
        wedTeam[0] = "0- Keeper";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList1.addItem(wedTeam[i].toString());
        	spelersList1.removeItemAt(0);
        }
        wedTeam[0] = "0- Defense 1";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList2.addItem(wedTeam[i].toString());
        	spelersList2.removeItemAt(0);
        }
        wedTeam[0] = "0- Defense 2";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList3.addItem(wedTeam[i].toString());
        	spelersList3.removeItemAt(0);
        }
        wedTeam[0] = "0- Defense 3";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList4.addItem(wedTeam[i].toString());
        	spelersList4.removeItemAt(0);
        }
        wedTeam[0] = "0- Defense 4";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList5.addItem(wedTeam[i].toString());
        	spelersList5.removeItemAt(0);
        }
        wedTeam[0] = "0- Midfield 1";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList6.addItem(wedTeam[i].toString());
        	spelersList6.removeItemAt(0);
        }
        wedTeam[0] = "0- Midfield 2";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList7.addItem(wedTeam[i].toString());
        	spelersList7.removeItemAt(0);
        }
        wedTeam[0] = "0- Midfield 3";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList8.addItem(wedTeam[i].toString());
        	spelersList8.removeItemAt(0);
        }
        wedTeam[0] = "0- Offense 1";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList9.addItem(wedTeam[i].toString());
        	spelersList9.removeItemAt(0);
        }
        wedTeam[0] = "0- Offense 2";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList10.addItem(wedTeam[i].toString());
        	spelersList10.removeItemAt(0);
        }
        wedTeam[0] = "0- Offense 3";
        for(int i = 0; i < wedTeam.length; i++){
        	spelersList11.addItem(wedTeam[i].toString());
        	spelersList11.removeItemAt(0);
        }
        change = true;
	}
}
