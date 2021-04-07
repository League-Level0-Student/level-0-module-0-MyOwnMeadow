void setup() {
  size(500, 500);
  PImage baby = loadImage("fistPump.png");
  baby.resize(500, 500);
  background(baby);
  textSize(30);
  text("WHEN YOU TEST YOUR PROGRAM", 9, 50);
}

void draw() {
  fill(#03FFF9);
  textSize(30);
  if(mousePressed) {
    text("AND IT WORKED FIRST TIME", 50, 450);
  }
  if(mousePressed) {
    textSize(10);
    text("Is this color teal or cyan?", 200, 495);
  }
}
