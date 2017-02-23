import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	int random1;
	int random2;
	int random3;

	void random() {
		random1 = new Random().nextInt(9);
		random2 = new Random().nextInt(9);
		random3 = new Random().nextInt(9);
		label1.setText(random1 + "");
		label2.setText(random2 + "");
		label3.setText(random3 + "");
	}

	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();

	void Setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton button = new JButton("spin");
		frame.add(panel);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(50, 100);
	}

	public static void main(String[] args) {
		SlotMachine slots = new SlotMachine();
		slots.Setup();
	}
int spent= 0;
int spendinglimit = 15;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		spendinglimit--;
		random();
		if(random1==random2&&random1==random3){
			JOptionPane.showMessageDialog(null, "You won $200!");
			spendinglimit+=(200);
		}
		if( random1== random2 || random1== random3 || random2== random3){
			JOptionPane.showMessageDialog(null, "you won $2!");
			spendinglimit+=(2);
		}
		if (spent==spendinglimit){
			System.exit(0);
		}
		else{
			System.out.println("you have " + spendinglimit + " dollars left");
		}
	}
}
