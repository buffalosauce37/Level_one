int birdX = 20;
int birdY = 200;
int pipeX = 300;
int pipeHeight =200;
int pipeWidth = 30;
int pipeY = 400 - pipeHeight;
int pipe2Height = 400 - pipeHeight - 50;
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
rect(pipeX, pipeY, pipeWidth, pipeHeight);    
fill(0, 200, 0);
rect(pipeX, 0, pipeWidth, pipe2Height);
birdY += birdYVelocity;
birdYVelocity += gravity;
pipeX -= 2;
teleport();
if (intersects(birdX, birdY, pipeX, pipeY, pipeHeight)){
  birdX = 20;
  birdY = 200;
  pipeX = 300;
}
if (intersects2(birdX, birdY, pipeX, pipe2Height, pipe2Height)){
  birdX = 20;
  birdY = 200;
  pipeX = 300;
}
if (birdY >= 400){
 birdX = 20;
  birdY = 200;
  pipeX = 300;
}
}
void mouseClicked() {
  birdYVelocity -= 1.25;
}
void teleport(){
if(pipeX <= 0-pipeWidth){
pipeX = 400;
pipeHeight = (int) random(80, 200);
pipeY = 400 - pipeHeight;
pipe2Height = 400 - pipeHeight - 50;
  }
}

boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
  
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}
boolean intersects2(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
  
if (birdY < paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}

