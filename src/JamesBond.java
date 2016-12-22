
public class JamesBond {
int findCode(Vault v){
	for (int i = 0; i < 1000001; i++) {
boolean code = v.tryCode(i);
if (code==true){
	return i;
}
	}
return -1;
}
public static void main(String[] args) {
	JamesBond james= new JamesBond();
	Vault vault= new Vault();
	int bond = james.findCode(vault);
	System.out.println(bond);
}
}