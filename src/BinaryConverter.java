import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import sun.applet.Main;

public class BinaryConverter implements ActionListener {
	JTextField text = new JTextField();
	JTextField field = new JTextField();
void Setup(){
	JFrame frame = new JFrame("Enter Binary below");
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	frame.setVisible(true);
	frame.add(panel);
	panel.add(text);
	panel.add(button);
	panel.add(field);
	button.addActionListener(this);
	Dimension size = new Dimension(300,25);
	text.setPreferredSize(size);
	field.setPreferredSize(size);
	frame.pack();
}
int convert(String binary) {
	if(binary.length() != 8){
		JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		return 0;
	}
	 if(!Pattern.matches("\\A[01]+\\Z", binary)) {
		 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
	 }
	try {
		int asciiValue = Integer.parseInt(binary, 2);
		return asciiValue;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		//question.setText("");
		return 0;
	}
}
String convertLetter(int asciiValue) {
//	 int asciiValue = Integer.parseInt(binary, 2);
	 char theLetter = (char) asciiValue;
	 return "" + theLetter;
}
public static void main(String[] args) {
	BinaryConverter Converter = new BinaryConverter();
	Converter.Setup();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String words = text.getText();
	int number = convert(words);
	String letter = convertLetter(number);
	field.setText(letter);
}
}
