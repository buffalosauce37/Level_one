void setup(){
size(900, 900);
background(0, 0, 0);
}
void draw(){
  float random =random(850);
  float random2 = random(850);
    float random3 = random(255);
    float random4 = random(255);
    float random5 = random(255);
  fill (random3,random4,random5);
  ellipse(getWormX(frameCount),getWormY(frameCount),20,20);
    makeMagical();
}
float frequency = 10;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

