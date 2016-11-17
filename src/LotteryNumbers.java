import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {
	static String random = "";
	public static void main(String[] args) {
		//frame();
		
		LotteryNumbers Lottery = new LotteryNumbers();
		Lottery.frame();
		for (int i = 0; i < 7; i++) {
			 random += " " + new Random().nextInt(49);
		}
		
	}
	
	private void frame() {
		JFrame mark=new JFrame();
		JPanel john=new JPanel();
		JButton tom=new JButton("lotto");
		mark.add(john);
		mark.add(tom);
		tom.addActionListener(this);
		mark.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, random);
	}
}
