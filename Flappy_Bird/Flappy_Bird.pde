void setup(){
 size (400,400);
 background (0, 247, 255);
}
int birdx = 20;
int birdy = 200;
  double birdyVelocity = 0;
  double gravity = 0.5;
void draw(){
fill(0,0,0);
ellipse(birdx, birdy, 20, 20);
mousePressed();
}

void mousePressed() {
  if(mousePressed){
  birdyVelocity++;
  }
}