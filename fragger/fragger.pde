import java.util.Random;

void setup(){
 size (400,400);
 
}
int frogx = 200;
int frogy = 380;
int hop = 20;

Car car1 = new Car(new Random().nextInt(400)
, 20, new Random().nextInt(150), 5);
Car car3 = new Car(new Random().nextInt(400)
, 60, new Random().nextInt(150), 5);
Car car5 = new Car(new Random().nextInt(400)
, 100, new Random().nextInt(150), 5);
Car car7 = new Car(new Random().nextInt(400)
, 140, new Random().nextInt(150), 5);
Car car9 = new Car(new Random().nextInt(400)
, 180, new Random().nextInt(150), 5);
Car car11 = new Car(new Random().nextInt(400)
, 220, new Random().nextInt(150), 5);
Car car13 = new Car(new Random().nextInt(400)
, 260, new Random().nextInt(150) , 5);
Car car15 = new Car(new Random().nextInt(400)
, 300, new Random().nextInt(150) , 5);
Car car17 = new Car(new Random().nextInt(400)
, 340, new Random().nextInt(150), 5);

void draw(){
background (123, 123, 123);
fill(0,255,0);
ellipse(frogx, frogy, 20, 20);
car1.display2();
car1.getHit();
car3.display1();
car3.getHit();
car5.display2();
car5.getHit();
car7.display1();
car7.getHit();
car9.display2();
car9.getHit();
car11.display1();
car11.getHit();
car13.display2();
car13.getHit();
car15.display1();
car15.getHit();
car17.display2();
car17.getHit();
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      frogy -= hop;
      }
      else if(keyCode == DOWN)
      {
        frogy += hop;
      }
      else if(keyCode == RIGHT)
      {
       frogx += hop;
      }
      else if(keyCode == LEFT)
      {
        frogx -= hop;
      }
      walls();
   }
   
  
}
 void walls(){
   if(frogx >= 400){
   frogx = 380;
   }
   if(frogx <= 0){
   frogx = 20;
   }
   if(frogy <= 0){
   frogy = 20;
   }
   if(frogy >= 400){
   frogy = 380;
   }
   
   }
   public class Car{
     int Carx;
     int Cary;
     int size;
     int speed;
     Car(int Carx, int Cary, int size, int speed){
       this.Carx = Carx;
       this.Cary = Cary;
       this.size = size;
       this.speed = speed;
     }
    void movel(){
      this.Carx -= speed;
      if(size + Carx < 0){
        Carx= 400;
      }
    }
    int getX(){
    return this.Carx;
    }
     int getY(){
    return this.Cary;
    }
     int getSize(){
    return this.size;
    }
    void mover(){
      this.Carx += speed;
      if(Carx > 400){
        Carx = 0;
      }
    }

   
   void display1(){
     movel();
     fill(255,255,255);
     rect(Carx , Cary,  size, 20);
    }
    void display2(){
     mover();
     fill(255,255,255);
     rect(Carx , Cary,  size, 20);
    } 
     void getHit(){
if (intersects(this)){
frogy = 380;
}
}            
       }
boolean intersects(Car car) {
if ((frogy > car.getY() && frogy < car.getY()+50) && (frogx > car.getX() && frogx < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}


