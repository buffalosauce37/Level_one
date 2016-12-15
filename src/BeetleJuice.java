import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BeetleJuice implements ActionListener {
JFrame frame = new JFrame();
JButton button = new JButton("beetleJuice");

void setup(){
	frame.add(button);
	frame.pack();
	frame.setVisible(true);
	button.addActionListener(this);
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
int x = 0;
public static void main(String[] args) {
	BeetleJuice Beetle = new BeetleJuice();
	Beetle.setup();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	x ++;
	if (x%3==0){
		int random = new Random().nextInt(4);
		if (random==0){
			showPictureFromTheInternet("https://s-media-cache-ak0.pinimg.com/originals/37/90/8f/37908f185d9fa99c400e3b5856301852.jpg");
		}
		if (random==1){
			showPictureFromTheInternet("https://i.ytimg.com/vi/_mb9aeIzlRY/maxresdefault.jpg");
		}
		if (random==2){
			showPictureFromTheInternet("http://funny-pics.co/wp-content/uploads/funny-puppy-and-cat-picture.jpg");
		}
		if (random==3){
			showPictureFromTheInternet("https://s-media-cache-ak0.pinimg.com/originals/fc/62/3b/fc623b278abb928e9d48244873bcb217.jpg");
		}
	}
	
}
}
