import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class WhachaMole implements ActionListener {
	JFrame frame = new JFrame();
	Date start = new Date();
	int counter = 0;
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is " + 
		((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) 
		+ " moles per second.");
	}
	void DrawButtons(int mole) {
		frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);

		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			if (i == mole) {
				button.setText("mole");
			}
			button.addActionListener(this);
		}
		frame.setVisible(true);
		frame.setSize(250, 300);
	}

	public static void main(String[] args) {
		WhachaMole mole = new WhachaMole();
		int random = new Random().nextInt(24);
		mole.DrawButtons(random);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton but = (JButton) e.getSource();
		if (but.getText().equals("mole")) {
			System.out.println("congrats");
			frame.dispose();
			int random = new Random().nextInt(24);
			DrawButtons(random);
			counter++;
			if(counter==10){
				endGame(start, counter);
			}
			
		} else {
			speak("WHAT A NERD!!!!!");
			
		}
	}
}
