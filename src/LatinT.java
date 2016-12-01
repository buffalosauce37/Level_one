import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatinT implements ActionListener {
JFrame pig = new JFrame();
JPanel cow = new JPanel();
JButton goat = new JButton("translate");
JTextField sheep = new JTextField();
JTextField duck = new JTextField();
public void translate(){
pig.add(cow);

cow.add(sheep);
cow.add(goat);
cow.add(duck);
pig.setVisible(true);
goat.addActionListener(this);
sheep.setPreferredSize(new Dimension(300, 25));
duck.setPreferredSize(new Dimension(300, 25));
pig.pack();
}
public static void main(String[] args) {
	LatinT T = new LatinT();
	T.translate();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	PigLatinTranslator Latin =  new PigLatinTranslator();
	String Pig = sheep.getText();
	String Translated = Latin.translate(Pig);
	duck.setText(Translated);
	duck.setEditable(false);
}
}
