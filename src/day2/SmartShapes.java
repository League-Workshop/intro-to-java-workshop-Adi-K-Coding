package day2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    	Robot bob=new Robot();

        // 3. Put the robot's pen down

bob.penDown();
        // 6. Make the robot move as fast as possible

bob.setSpeed(1000);
        // 5. Do everything below here 4 times
for (int i = 0; i < 360; i++) {
	


        //         2. Move your robot 200 pixels
bob.move(2);

        //         4. Turn the robot 90 degrees to the right
bob.turn(360/360);
}
for (int i = 0; i < 360; i++) {
	bob.move(2);
	bob.turn(360/-360);
}
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    }
}
