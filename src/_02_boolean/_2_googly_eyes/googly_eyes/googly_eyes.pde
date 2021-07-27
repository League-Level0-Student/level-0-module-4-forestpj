PImage face;
void setup() {
  face = loadImage("face.png");
      size(800,600);
    face.resize(width,height);

}

void draw() {
  image(face,0,0);
  ellipse(267,280,306,306);
  println(mouseX,mouseY);
}
