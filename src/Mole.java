import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mole implements ActionListener {
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	Date date = new Date();
int butt;
	JFrame frame = new JFrame();
	JButton button = new JButton("mole");

	void drawButtons(int num) {
		JPanel panel = new JPanel();
		frame.add(panel);
//		frame = new JFrame();
		for (int i = 0; i < 24; i++) {
			if (i == num) {
				panel.add(button);
				button.addActionListener(this);
			} else {
				JButton button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}

		}
		

		frame.setVisible(true);
		frame.setSize(300, 300);
	}

	public static void main(String[] args) {
		Mole mole = new Mole();
		mole.drawButtons(new Random().nextInt(24));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			frame.dispose();
			frame = new JFrame();
			drawButtons((new Random().nextInt(24)));
			butt++;
			playSound("fartone.wav");
		} else {
			speak("You are a nerd!");
		}
if(butt==10){
	endGame(date,butt);
}
	}
}
