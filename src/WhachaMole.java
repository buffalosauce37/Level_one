import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhachaMole implements ActionListener {
	JFrame frame = new JFrame();
	
	void DrawButtons(int mole) {

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
		JButton but =  (JButton) e.getSource();
		if(but.getText().equals("mole")){
			System.out.println("congrats");
			frame.dispose();
			
		}
	}
}
