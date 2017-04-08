int birdX = 20;
int birdY = 200;
int pipeX = 300;
int pipeWidth = (int) random(30, 75);
  double birdYVelocity = 0;
  double gravity = 0.05;
void setup(){
 size (400,400);
}

void draw(){
 background (0, 247, 255);
  fill(0,0,0);
ellipse(birdX, birdY, 20, 20);
fill(0, 200, 0);   
rect(pipeX, 248, pipeWidth, 150);    
birdYVelocity += gravity;
birdY += birdYVelocity;
pipeX -= 2;
teleport();
}

void mouseClicked() {
  birdYVelocity= -2;
}
void teleport(){
if(pipeX <= 0-pipeWidth){
pipeX = 400;
  }
}