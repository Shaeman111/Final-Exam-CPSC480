import java.awt.BorderLayout;

import javax.swing.*;

public class SlotMachine extends JFrame{

	  public SlotMachine() { 
      	super("Slot Machine!");
        setLayout(new BorderLayout());
      	
    final DisplayPanel slotPanel = new DisplayPanel();
    this.add(slotPanel, BorderLayout.CENTER);
	this.setSize(480,190);
	
	JPanel start_stop = new JPanel();
	JButton sta_button = new JButton("Start");
	JButton sto_button = new JButton("Stop");
	start_stop.add(sta_button);
	start_stop.add(sto_button);
	
	this.add(start_stop, BorderLayout.SOUTH);
	 }

	
	  public static void main(String[] args) {
      	SlotMachine panel = new SlotMachine();
              panel.setVisible(true);
      }
	
}
	  
