
void setup() {
  size(600, 600);
  noStroke();
}

void draw() {
  ellipse(300, 300, 50, 50);
if (mousePressed) {
  int colour = mouseX-mouseY;
  fill(colour/3, random(1, 255), colour/3);
} else {
  int colour = mouseX-mouseY;
  fill(random(1, 255), colour/3, random(1, 255));
}  
  
  
  
}
