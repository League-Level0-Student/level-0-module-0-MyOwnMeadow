PImage catT;
int x=525;
int y=209;

void setup() {
  catT = loadImage("Cat.wide-eyed.jpeg");
  size(850, 600);
  catT.resize(850, 600);
  background(catT);
  }

void draw() {
      if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
      }
      
      noStroke();
      fill(#FF0000);
                ellipse(x, y, 70, 70);
                ellipse(x-188, y+10, 70, 70);
}

// 11.  LASER BEAM.  This code will make your ellipse move down and to the right when you press 
//      the space bar. Run the program to test it.
//      If you want it to move to the left, change to x-1=.
void keyPressed() {
    x+=5;
    y+=5;
}
 

//13.   Now make the cat shoot lasers from the other eye.
//      You will need to click the mouse on the other eye to figure our where to draw the other circle
//      Use offsets from the other eye so that you don’t need to make a second set of coordinates.
//      e.g. ellipse(x+220, y-50, 50, 50);

//14.  Set the laser back to the beginning when it goes off the screen.
//     You will need  an if statement to check when x > width 
//     Then set x and y back to their original values and re-draw the cat
//     background(cat);
