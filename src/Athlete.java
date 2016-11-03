
public class Athlete {
String name;
int speed;
int bibNumber;
static String raceLocation="San Francisco";
static String startTime = "12:00 pm";
static int numRunners;
Athlete (String name, int speed){
	this.name=name;
	this.speed=speed;
	//increase # runners
}
public static void main(String[] args) {
	Athlete john=new Athlete("john",50);
}
}
