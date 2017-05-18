import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LaughTrack implements ActionListener {

	void setup(){
		JFrame frame = new  JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
