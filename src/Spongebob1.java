import javax.swing.JOptionPane;

/*
 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
 */
public class Spongebob1 {
public static void main(String[] args) {
	Spongebob bob = new Spongebob("Spongebob");
	Spongebob rick = new Spongebob("Patrick");
	Spongebob spuid = new Spongebob ("squidward");
	
	String x=JOptionPane.showInputDialog("which lagh was your favorite?");
	if(x.equals("squidward")){
		spuid.laugh();
	}
	if(x.equals("Spongebob")){
		bob.laugh();
	
	}
if(x.equals("Patrick")){
	rick.laugh();
}
	}
}

