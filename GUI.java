import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
	
	private String[] wedTeam = {"1- Speler", "2- Speler", "3- Speler", "12- Speler"};

    public GUI() {

        initUI();
    }

    private final void initUI() {
    	
    	GridBagLayout k = new GridBagLayout();
    	JPanel pane = new JPanel(k);
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
        
        JPanel jp = new JPanel();
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
        
        JButton b6 = new JButton ("Spelers aanpassen");
        c.ipady = 60;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(b6,c);
        
        JButton b7 = new JButton("Lijst Wisselspelers");
        c.ipady = 50;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(b7,c);
        
        c.insets = def;
        c.gridwidth = 1;
        c.gridheight = 1;
        
        JButton b8 = new JButton("Koop/Verkoop");
        c.ipady = 20;
        c.gridwidth = 2;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(b8,c);
        c.gridwidth = 1;
        
        JButton b9 = new JButton("Start Wedstrijd");
        c.gridx = 2;
        c.gridy = 2;
        pane.add(b9,c);
        
        JButton b10 = new JButton("Vorig Resultaat");
        c.gridx = 2;
        c.gridy = 3;
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
        

        
        JComboBox<String> spelersList1 = new JComboBox<String>(wedTeam);
        spelersList1.addActionListener(this);
        JComboBox<String> spelersList2 = new JComboBox<String>(wedTeam);
        spelersList2.addActionListener(this);
        JComboBox<String> spelersList3 = new JComboBox<String>(wedTeam);
        spelersList3.addActionListener(this);
        JComboBox<String> spelersList4 = new JComboBox<String>(wedTeam);
        spelersList4.addActionListener(this);
        JComboBox<String> spelersList5 = new JComboBox<String>(wedTeam);
        spelersList5.addActionListener(this);
        JComboBox<String> spelersList6 = new JComboBox<String>(wedTeam);
        spelersList6.addActionListener(this);
        JComboBox<String> spelersList7 = new JComboBox<String>(wedTeam);
        spelersList7.addActionListener(this);
        JComboBox<String> spelersList8 = new JComboBox<String>(wedTeam);
        spelersList8.addActionListener(this);
        JComboBox<String> spelersList9 = new JComboBox<String>(wedTeam);
        spelersList9.addActionListener(this);
        JComboBox<String> spelersList10 = new JComboBox<String>(wedTeam);
        spelersList10.addActionListener(this);
        JComboBox<String> spelersList11 = new JComboBox<String>(wedTeam);
        spelersList11.addActionListener(this);
        
        spelersList1.setName("keep");
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
        
        jp.add(spelersList1);
        jp.add(spelersList2);
        jp.add(spelersList3);
        jp.add(spelersList4);
        jp.add(spelersList5);
        jp.add(spelersList6);
        jp.add(spelersList7);
        jp.add(spelersList8);
        jp.add(spelersList9);
        jp.add(spelersList10);
        jp.add(spelersList11);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        
        

        pane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        add(pane);
        

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
	public void actionPerformed(ActionEvent e) {
		String choice = e.getActionCommand();
		if (choice.equals("NEW")){
			System.out.println("You pressed the new button");
		}
		else if (choice.equals("SAVE")){
			System.out.println("You pressed the save button");
		}
		else if (choice.equals("LOAD")){
			System.out.println("You pressed the load button");
		}else if (choice.equals("QUIT")){
			System.out.println("You pressed the quit button");
		}else if (choice.equals("Opstelling")){
			System.out.println("You pressed the opstelling button");
		}else if (choice.equals("Spelers aanpassen")){
			System.out.println("You pressed the spelers aanpassen button");
		}else if (choice.equals("Lijst Wisselspelers")){
			System.out.println("You pressed the lijst wisselspelers button");
		}else if (choice.equals("Koop/Verkoop")){
			System.out.println("You pressed the koop/verkoop button");
		}else if (choice.equals("Start Wedstrijd")){
			System.out.println("You pressed the start wedstrijd button");
		}else if (choice.equals("Vorig Resultaat")){
			System.out.println("You pressed the vorig resultaat button");
		}else{
			JComboBox<String> cb = (JComboBox<String>)e.getSource();
			String speler = (String)cb.getSelectedItem();
			String[] parts = speler.split("-");
			int rn = Integer.parseInt(parts[0]);			
			System.out.println(rn);
			String source = e.getSource().toString();
			String[] naam = source.split(",");
			String nm = naam[0].substring(22);
			System.out.println(nm);
		}
	}
}
