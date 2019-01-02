PImage mystacge;
  PImage friend;
void setup(){
  friend=loadImage("friend.jpg");
size(800,600);
friend.resize(800,600);
}
void draw(){
  background(friend);
  mustache=loadImage("mustache.png");
  size(400,300);
}
  