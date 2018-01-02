int x=1;
int y=1;
int z=1;
void setup(){
 size(800,600); 
}
void draw(){
background(100,150,200);
  rect(275,300,250,150);
ellipse(400,300,150,150);
if(mousePressed){
fill(random(256),random(256),random(256));
}
else{
fill(mouseX,mouseY,mouseY);
}

}