import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fortune = new FortuneCookie();
	fortune.showButton();
}
JFrame mark = new JFrame();
JPanel joe = new JPanel();
JButton tom= new JButton("The best Button");
public void showButton(){
mark.add(joe);

joe.add(tom);
mark.setVisible(true);
tom.addActionListener(this);
mark.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub


int random=new Random().nextInt(4);
//5. If the random number is 0
if (random==0){
JOptionPane.showMessageDialog(null, "You are liked among many");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (random==1){
JOptionPane.showMessageDialog(null, "you will make a cereal");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (random==2){
JOptionPane.showMessageDialog(null, "Ask for the fortune of the day.");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (random==3){
JOptionPane.showMessageDialog(null, "You will buy another one");
}
}
}