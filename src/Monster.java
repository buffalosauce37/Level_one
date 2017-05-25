
public class Monster {

	private String name;
	private int scarePower;
	 Monster(String name, int scarePower){
		this.name=name;
		this.scarePower=scarePower;
	}
	public String getname(){
		return name;
	}
	public int getscarePower(){
		return scarePower;
	}
	void setname(String name){
	this.name=name;
	}
	void setscarePower(int scarePower){
	this.scarePower=scarePower;
	}
	
	public String toString(){
		return getname() + "'s scare power is " + getscarePower();
	}
	
}
