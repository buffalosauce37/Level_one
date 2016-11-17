
public class Minion {
	String name; 
	 int eyes; 
	 String color; 
	 String master;
	public Minion(String name, int eyes, String color, String master) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getEyes(){
		return eyes;
	}
	public void setEyes(int eyes){
		this.eyes=eyes;
	}
	public String getMaster(){
		return master;
	}
	public void setMaster(String master){
		this.master=master;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
}