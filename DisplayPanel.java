import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class DisplayPanel extends JPanel {
	
	public DisplayPanel( ) {
	JButton[] slots = new JButton[3]; //creates array of JButtons
	Image question; //holds the ?
	question = getImage("mystery.gif"); //puts the ? image into question using the method below
	
	for(int i=0; i<3; i++){  //creates new ImageIcon and puts all 3 jbuttons instead of text
		slots[i] = new JButton(new ImageIcon(question));
	    add(slots[i]);
	    slots[i].setEnabled(false);
	}
	}
	
private Image getImage(String filename) {
	URL url = getClass().getResource( filename );
	ImageIcon icon = new ImageIcon(url);
	return icon.getImage();
	}


public void changeImages(JButton[] yes){
	Image[] images = new Image[6];
	images[0] = getImage("star.gif");
	images[1] = getImage("triangle.gif");
	images[2] = getImage("bar.jpg");
	images[3] = getImage("cherry.jpg");
	images[4] = getImage("donut.jpg");
	images[5] = getImage("lemon.jpg");
	int rnd1 = new Random().nextInt(images.length);
	int rnd2 = new Random().nextInt(images.length);
	int rnd3 = new Random().nextInt(images.length);

	yes[0].setIcon(new ImageIcon(images[rnd1]));
	yes[1].setIcon(new ImageIcon(images[rnd2]));
	yes[2].setIcon(new ImageIcon(images[rnd3]));
}



public static String chooseImage(String[] strings){
	if (strings[0] == null){
		return null;
	}
	else if (strings.length>0 && strings.length<4){
		return strings[0];
	}
	return strings[strings.length-1];
}

}
