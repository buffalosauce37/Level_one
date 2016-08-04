import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class celbrity_geusing_game {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/Level_one/src/Seadra1.png";
	String secondImage = "/Users/league/Desktop/Level_one/src/arbok.png";
	String thirdImage = "/Users/league/Desktop/Level_one/src/slowbro.png";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			
		// Make an int variable to hold the score.
int x= 0;
		// Ask the user who this person is and store their answer
String y=JOptionPane.showInputDialog("Who's that pokemon");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if(y.equalsIgnoreCase("Seadra")){
	JOptionPane.showMessageDialog(null, "you are correct");
	x += 1;
}
else{
	JOptionPane.showMessageDialog(null, "ya bad its seadra");
}
		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
showNextImage();
String h=JOptionPane.showInputDialog("Who's that pokemon");
// If they got the answer right:
// -- Tell them they are correct.
// -- Increase the score by 1
if(h.equalsIgnoreCase("Arbok")){
JOptionPane.showMessageDialog(null, "you are correct");
x += 1;
}
else{
JOptionPane.showMessageDialog(null, "ya bad its Arbok");
}
showNextImage();
String f=JOptionPane.showInputDialog("Who's that pokemon");
//If they got the answer right:
//-- Tell them they are correct.
//-- Increase the score by 1
if(f.equalsIgnoreCase("slowbro")){
JOptionPane.showMessageDialog(null, "you are correct");
x += 1;
}
else{
JOptionPane.showMessageDialog(null, "ya bad its slowbro");
}

		// Show the score
JOptionPane.showMessageDialog(null, "your score is" +x);
		// .... repeat for all your images.....
System.exit(0);
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		celbrity_geusing_game quiz = new celbrity_geusing_game();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

