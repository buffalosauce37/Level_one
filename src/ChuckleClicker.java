import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.applet.Main;

public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	ChuckleClicker Chuck = new ChuckleClicker();
	Chuck.makeButtons();
}
JButton dave = new JButton();
JButton Harambe = new JButton();
void makeButtons(){
	JFrame jerry = new JFrame();
	jerry.setVisible(true);
	JPanel bob = new JPanel();
	
	jerry.add(bob);
	bob.add(dave);
	bob.add(Harambe);
	dave.setText("Joke");
	Harambe.setText("Punchline");
	Harambe.addActionListener(this);
	dave.addActionListener(this);
	
	
	
	
	jerry.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == Harambe){
	JOptionPane.showMessageDialog(null, "A father in law.");
	}
	if(e.getSource() == dave){
		JOptionPane.showMessageDialog(null, "What do you call a priest that becomes a lawyer?");
	}
}

}
