PImage face;
int x=267;
int y=280;
void setup() {
  face = loadImage("face.png");
      size(800,600);
    face.resize(width,height);
}
int minX=216;
int minY=170;
int maxX=349;
int maxY=371;
void draw() {
  image(face,0,0);
  fill(255);
  ellipse(267,280,306,306);
  if (mousePressed)
  println(mouseX,mouseY);
  ellipse(588,335,295,295);
  if (mouseX<minX){
  x=minX;
  }
  else if (mouseX>maxX){
  x=maxX;
  }
  else{
  x=mouseX;
  }
  if (mouseY<minY){
  y=minY;
  }
  else if (mouseY>maxY){
  y=maxY;
  }
  else{
  y=mouseY;
  }
  fill(0);
  ellipse(x,y,50,50);
  ellipse(x+321,y+55,50,50);
}
