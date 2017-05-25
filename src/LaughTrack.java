import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LaughTrack implements ActionListener {
	JButton button1 = new JButton("child laugh");
	JButton button2 = new JButton("evil laugh");
	JButton button3 = new JButton("stupid laugh");
	void setup(){
		JFrame frame = new  JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	public static void main(String[] args) {
		LaughTrack laugh = new LaughTrack();
		laugh.setup();
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getSource();
		if(e.getSource()==button1){
		playSound("child.wav");
		}
		if(e.getSource()==button2){
			playSound("evil.wav");
			}
		if(e.getSource()==button3){
			playSound("stupid.wav");
			}
	}
}
