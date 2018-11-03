package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	 static //1. make a main method
	int x = 100;
	 int y;
	
	 
	public static void main(String[] args) {
		Random r =  new Random();
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(x+=100);
			robots[i].setY(550);
		}
		
		while (true) {
			for (int i = 0; i < robots.length; i++) {
				 int num = r.nextInt(49);
				robots[i].move(num);
				
			}
		}
		
		//robots[1].setX(100);
		//robots[1].setY(550);
		//robots[2].setX(250);
		//robots[2].setY(550);
		//robots[3].setX(250);
		//robots[3].setY(550);
	}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
