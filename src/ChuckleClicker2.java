import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker2 implements ActionListener {
	void makeButtons(){
	JFrame frame = new JFrame("ChuckleClicker");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
	}
public static void main(String[] args) {
	ChuckleClicker2 chuck = new ChuckleClicker2();
	chuck.makeButtons();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi");
}
}
