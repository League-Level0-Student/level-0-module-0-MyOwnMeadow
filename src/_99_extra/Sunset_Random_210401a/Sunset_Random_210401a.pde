//size(555, 555);
//noStroke();
//fill(#02B7AC);
//ellipse(200, 200, 80, 80);
void setup(){
  size(510, 510);
  stroke(0, 0, 0, 5);
}

void draw(){
  if(mousePressed){
    fill(mouseY-mouseX, mouseY/2, mouseX/2, random(80, 250));
    ellipse(mouseX, mouseY, mouseY, mouseX);
  }
  else{
    float x = random(0, 510);
    float y = random(0, 510);
    fill(y-x, y/2, x/2, random(5, 20));
    ellipse(x, y, random(60, 150), random(50, 100));
  }
}
