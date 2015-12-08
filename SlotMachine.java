import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	final Timer timer = new Timer(100, (ActionListener) this);
	
	sta_button.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			timer.start(); 
		}
	});
	sto_button.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			timer.stop();
		}
	});
	
	 }

	
	  public static void main(String[] args) {
      	SlotMachine panel = new SlotMachine();
              panel.setVisible(true);
      }
	
}
	  
