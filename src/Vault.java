import javax.swing.JOptionPane;

public class Vault {
	int secretCode = 1000000;
boolean tryCode(int code){
	if (secretCode==code){
		return true;
	}
	else{
		return false;
	}
}

}
