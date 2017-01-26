import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JButton button = new JButton("Fart one");
	JButton butto = new JButton("Fart two");
	JButton butt = new JButton("Fart three");
void setup(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button);
	panel.add(butto);
	panel.add(butt);
	button.addActionListener(this);
	butto.addActionListener(this);
	butt.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}

public static void main(String[] args) {
	TootMachine toot = new TootMachine();
	toot.setup();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton clicked = (JButton) e.getSource();
	if (clicked == butto){
		playSound("Farttwo.wav");
	}
	if (clicked == button){
		playSound("Fartone.wav");
	}
	if (clicked == butt){
		playSound("Fartthree.wav");
	}
	
}
}
