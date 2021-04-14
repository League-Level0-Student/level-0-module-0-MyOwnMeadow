PImage face;
PImage mustache;

void setup() {
   size(600, 600);
   face = loadImage("face.jpg");
   face.resize(600, 600);
   mustache = loadImage("mustache.png");
   mustache.resize(300, 120);
}

void draw() {
  image (face, 0, 0);
  if (mouseButton == LEFT)  {
     image (mustache, mouseX-150, mouseY-60);
  }
}
