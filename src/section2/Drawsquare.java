package section2;

import org.jointheleague.graphical.robot.Robot;


public class Drawsquare {
	public static void main(String[] args) {
	Robot r2d2 = new Robot();
	r2d2.move(50);
	r2d2.setSpeed(500);
	r2d2.turn(360);
	r2d2.penDown();
	r2d2.move(100);
	r2d2.turn(180);
	r2d2.move(300);
	r2d2.turn(90);
	r2d2.move(400);
	for(int i =0;i<4; i++) {
		r2d2.move(50);
		r2d2.turn(90);
		r2d2.setSpeed(300);
		for(int i1 =0;i1<4; i1++) {
			r2d2.move(50);
			r2d2.turn(90);
			r2d2.setSpeed(300);
			for(int i2 =0;i<4; i++) {
				r2d2.move(50);
				r2d2.turn(90);
				r2d2.setSpeed(300);
			}
		}
	}
}
}