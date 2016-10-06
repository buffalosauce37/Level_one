import ddf.minim.*;
  Minim minim;  
  AudioPlayer song;  
void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);
}
 PImage pictureOfRecord;  
void setup(){
  pictureOfRecord= loadImage("record.png");
size(pictureOfRecord.width, pictureOfRecord.height);
minim = new Minim(this);  
song = minim.loadFile("Queen.mp3", 512);
}
int x =5;
 void draw(){
   if (mousePressed){rotateImage(pictureOfRecord, x+=10000);
   song.play();
   }
   else{
   song.pause();
   }
image(pictureOfRecord, 0, 0);
   
}

