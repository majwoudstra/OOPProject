import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class OpstellingGUI extends JFrame implements ActionListener{
	
	private String[] nummers = {"1", "2", "3", "4", "5"};
	GridBagLayout k = new GridBagLayout();
	JPanel pane = new JPanel();
    JComboBox<String> defence = new JComboBox<String>();
    JComboBox<String> midfield = new JComboBox<String>();
    JComboBox<String> offence = new JComboBox<String>();
	
	public OpstellingGUI(JPanel k){
	   	setSize(1080,720);
		initUI(k);
	}
	
	private final void initUI(JPanel p) {

    	pane.setLayout(k);
    	GridBagConstraints c = new GridBagConstraints();
    	c.fill = GridBagConstraints.BOTH;
    	
    	c.insets = new Insets(5,5,5,5);
    	
        pane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        c.gridx = 0;
        c.gridy = 1;
        pane.add(defence, c);
        
        c.gridx = 1;
        pane.add(midfield, c);
        
        c.gridx = 2;
        pane.add(offence,c);
        
        for(int i = 0; i < nummers.length; i++)
        	defence.addItem(nummers[i].toString());
        //defence.addActionListener(this);

        for(int i = 0; i < nummers.length; i++)
        	midfield.addItem(nummers[i].toString());
        //midfield.addActionListener(this);
        
        for(int i = 0; i < nummers.length; i++)
        	offence.addItem(nummers[i].toString());
        //offence.addActionListener(this);
        
        JButton b = new JButton("Save");
        c.gridx=0;
        c.gridy=2;
        c.gridwidth=3;
        pane.add(b,c);
        b.addActionListener(this);
        
        add(pane);
	}
	
	public void actionPerformed(ActionEvent e) {
		int def = Integer.parseInt(defence.getSelectedItem().toString());
		int mid = Integer.parseInt(midfield.getSelectedItem().toString());
		int off = Integer.parseInt(offence.getSelectedItem().toString());
		int total = def + mid + off;
		if (total==10){
			dispose();
		}
	}

}
