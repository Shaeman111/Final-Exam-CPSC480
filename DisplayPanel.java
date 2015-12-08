import java.awt.*;
import java.net.URL;

import javax.swing.*;

public class DisplayPanel extends JPanel {
	
	public DisplayPanel( ) {
	JButton[] slots = new JButton[3]; //creates array of JButtons
	Image question; //holds the ?
	question = getImage("mystery.gif"); //puts the ? image into question using the method below
	
	for(int i=0; i<3; i++){  //creates new ImageIcon and puts all 3 jbuttons instead of text
		slots[i] = new JButton(new ImageIcon(question));
	    add(slots[i]);
	}
	}
	
private Image getImage(String filename) {
	URL url = getClass().getResource( filename );
	ImageIcon icon = new ImageIcon(url);
	return icon.getImage();
	}
}
