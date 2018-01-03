PImage mustache;
PImage friend;
PImage Sunglasses;
void setup(){
 friend = loadImage("friend.jpg");
size(800, 600);
friend.resize(width,height);
background(friend);
  mustache = loadImage("mustache.png");
  Sunglasses = loadImage("Sunglasses.png");
  Sunglasses.resize(600,300);
}
void draw(){
if(mouseButton == LEFT){
background(friend);
  image(mustache, mouseX-295,mouseY-60);
image(Sunglasses, mouseX-300,mouseY-350);
}


}