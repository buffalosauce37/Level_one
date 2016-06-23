import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[] args) {
	Tortoise.setX(10);
	Tortoise.setY(425);
	Tortoise.show();
	Tortoise.penDown();
	Tortoise.setPenWidth(5);
	Tortoise.setSpeed(10);
	Tortoise.getBackgroundWindow().setColor(Color.BLACK);
	for (int i = 0; i < 13; i++) {
		
		int x =new Random().nextInt(3);
		if (x==2){
			house_builder( "small", Color.BLUE);

		}
		if (x==1){
			house_builder("medium",Color.RED);
	
		}
		if (x==0){
			house_builder("big",Color.YELLOW);
		}
	}

}

private static void house_builder(String size, Color paint) {
	int small=(60);
	int big=(250);
	int medium=(120);
	Tortoise.setPenColor(paint);
	if(size.equalsIgnoreCase("small")){
		Tortoise.move(small);
		Piontyroof();
		Tortoise.move(small);
		Tortoise.turn(-90);}
	if(size.equalsIgnoreCase("medium")){
		Tortoise.move(medium);
		Piontyroof();
		Tortoise.move(medium);
		
		Tortoise.turn(-90);}
	if(size.equalsIgnoreCase("big")){
		Tortoise.move(big);
		Piontyroof();
		Tortoise.move(big);
		Tortoise.turn(-90);}
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.move(20);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.BLACK);
		
	


}

private static void Piontyroof() {
	Tortoise.turn(45);
	Tortoise.move(21);
	Tortoise.turn(90);
	Tortoise.move(21);
	Tortoise.turn(45);
}
}
