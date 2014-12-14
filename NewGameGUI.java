import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class NewGameGUI extends JFrame implements ActionListener{
	
	GridBagLayout k = new GridBagLayout();
	JPanel pane = new JPanel();
	
	public NewGameGUI(JPanel k){
	   	setSize(1080,720);
		initUI(k);
	}
	
	private final void initUI(JPanel p) {

    	pane.setLayout(k);
    	GridBagConstraints c = new GridBagConstraints();
    	c.fill = GridBagConstraints.BOTH;
    	
    	c.insets = new Insets(5,5,5,5);
    	
        pane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        JButton b1 = new JButton("ADO Den Haag");
        c.gridx = 0;
        c.gridy = 0;
        pane.add(b1,c);
        b1.addActionListener(this);
        
        JButton b2 = new JButton("Ajax");
        c.gridx = 0;
        c.gridy = 1;
        pane.add(b2,c);
        b2.addActionListener(this);
        
        JButton b3 = new JButton("AZ");
        c.gridx = 0;
        c.gridy = 2;
        pane.add(b3,c);
        b3.addActionListener(this);
        
        JButton b4 = new JButton("Excelsior");
        c.gridx = 0;
        c.gridy = 3;
        pane.add(b4,c);
        b4.addActionListener(this);
        
        JButton b5 = new JButton("FC Dordrecht");
        c.gridx = 0;
        c.gridy = 4;
        pane.add(b5,c);
        b5.addActionListener(this);
        
        JButton b6 = new JButton("FC Groningen");
        c.gridx = 0;
        c.gridy = 5;
        pane.add(b6,c);
        b6.addActionListener(this);
        
        JButton b7 = new JButton("FC Twente");
        c.gridx = 1;
        c.gridy = 0;
        pane.add(b7,c);
        b7.addActionListener(this);

        JButton b8 = new JButton("FC Utrecht");
        c.gridx = 1;
        c.gridy = 1;
        pane.add(b8,c);
        b8.addActionListener(this);
        
        JButton b9 = new JButton("Feyenoord");
        c.gridx = 1;
        c.gridy = 2;
        pane.add(b9,c);
        b9.addActionListener(this);
        
        JButton b10 = new JButton("Go Ahead Eagles");
        c.gridx = 1;
        c.gridy = 3;
        pane.add(b10,c);
        b10.addActionListener(this);
        
        JButton b11 = new JButton("Heracles Almelo");
        c.gridx = 1;
        c.gridy = 4;
        pane.add(b11,c);
        b11.addActionListener(this);
        
        JButton b12 = new JButton("NAC Breda");
        c.gridx = 1;
        c.gridy = 5;
        pane.add(b12,c);
        b12.addActionListener(this);
        
        JButton b13 = new JButton("PEC Zwolle");
        c.gridx = 2;
        c.gridy = 0;
        pane.add(b13,c);
        b13.addActionListener(this);
        
        JButton b14 = new JButton("PSV");
        c.gridx = 2;
        c.gridy = 1;
        pane.add(b14,c);
        b14.addActionListener(this);
        
        JButton b15 = new JButton("SC Cambuur");
        c.gridx = 2;
        c.gridy = 2;
        pane.add(b15,c);
        b15.addActionListener(this);
        
        JButton b16 = new JButton("SC Heereveen");
        c.gridx = 2;
        c.gridy = 3;
        pane.add(b16,c);
        b16.addActionListener(this);
        
        JButton b17 = new JButton("Vitesse");
        c.gridx = 2;
        c.gridy = 4;
        pane.add(b17,c);
        b17.addActionListener(this);
        
        JButton b18 = new JButton("Willem II");
        c.gridx = 2;
        c.gridy = 5;
        pane.add(b18,c);
        b18.addActionListener(this);
        
        add(pane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String team = e.getActionCommand();
		GUI.team = team;
		dispose();
	}

}
