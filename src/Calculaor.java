import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculaor implements ActionListener {
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	JTextField field1 = new JTextField();
	JTextField field2 = new JTextField();
	JLabel label = new JLabel();
	double Add(double number1, double number2) {
		return number1 + number2;
	}
	double Sub(double number1, double number2){
		return number1 - number2;
	}
	double Mul(double number1, double number2){
		return number1 * number2;
	}
	double Div(double number1, double number2){
		return number1 / number2;
	}

	void Setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		
		frame.add(panel);
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		field1.setColumns(5);
		field2.setColumns(5);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Calculaor calculator = new Calculaor();
		calculator.Setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String num1 = field1.getText();
		String num2 = field2.getText();
		double Num1 = Integer.parseInt(num1);
		double Num2 = Integer.parseInt(num2);
		if (e.getSource() == add) {
			double	answer1 =Add(Num1 , Num2);
			label.setText(""+answer1);
		}
		if (e.getSource() == sub) {
			double	answer2 =Sub(Num1 , Num2);
			label.setText(""+answer2);
	}
		if (e.getSource() == mul) {
			double	answer3 =Mul(Num1 , Num2);
			label.setText(""+answer3);
	}
		if (e.getSource() == div) {
		double	answer4 =Div(Num1 , Num2);
		label.setText(""+answer4);
	}
}}
