import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whach_a_mole implements ActionListener {
	void drawButtons(int num) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		for (int i = 0; i < 24; i++) {
			if (i == num) {
				JButton button = new JButton("mole");
				panel.add(button);
				button.addActionListener(this);
			} else {
				JButton button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}

		}
		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(300, 300);
	}

	public static void main(String[] args) {
		Whach_a_mole mole = new Whach_a_mole();
		mole.drawButtons(new Random().nextInt(24));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		void speak(String words) {
			try {
			Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}

	}
}
