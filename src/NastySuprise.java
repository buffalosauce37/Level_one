import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");
	
void setup(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(trick);
	panel.add(treat);
	trick.addActionListener(this);
	treat.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}
public static void main(String[] args) {
	NastySuprise nasty = new NastySuprise();
	nasty.setup();
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	} 
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().equals(trick)){
		showPictureFromTheInternet("http://pngimg.com/uploads/kiwi/kiwi_PNG4029.png");
	}
	if(e.getSource().equals(treat)){
		showPictureFromTheInternet("http://pngimg.com/uploads/broccoli/broccoli_PNG2820.png");
	}
}
}
