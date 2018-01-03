package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2 =new Robot();	
	r2d2.sparkle();
	r2d2.moveTo(400,300);
	r2d2.setSpeed(100);
	for (int j = 0; j < 2; j++) {
	r2d2.penDown();
	r2d2.setPenColor(Color.blue);
	r2d2.move(50);
	r2d2.turn(45);
	r2d2.setPenColor(Color.BLACK);
	r2d2.move(50);
	r2d2.turn(45);
	r2d2.setPenColor(Color.GREEN);
	r2d2.move(50);
	r2d2.turn(45);
	r2d2.setPenColor(Color.RED);
	r2d2.move(50);
	r2d2.turn(45);
	}
		
	
	r2d2.penUp();
	r2d2.moveTo(0,0);
	
	
		
	}
}
