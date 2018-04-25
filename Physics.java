import java.util.*;
import java.io.*;
public class Physics {
  
 public static void main(String[] args)
 {
  Formulas f = new Formulas();
  PrintStream out = System.out;
  InputStream in = System.in;
  Scanner input = new Scanner(in);
  int answer;
  double mass, acceleration, initial, f1nal, totalDistance, totalTime, totalDisplacement, timeInterval, averageAcceleration, initialVelocity,
         time, finalVelocity, initialTime, finalTime, xComponent, yComponent, magnitude, angle, displacement, averageVelocity;
  
  //Ask user what kind of problem they wish to solve
  out.print("What kind of problem do you need help with");  
  //List options
  out.print("----(Type in the # )----\n 1. Force\n 2. Displacement\n 3. Time Interval\n 4. Average Speed\n 5. Average Velocity\n 6.Average Acceleration\n" +
	    " 7.Average Acceleration\n 8. Velocity as a function of time\n 9. Displacement as a function of time\n 10. Velocity Squared\n" +
	    "11. Magnitude\n 12. X Component\n 13. Y Component\n 14. Angle\n 15. "+ "\n\n");
  //enter an answer
  answer = input.nextInt();
  if(answer == 1){
  	try{
  		out.print("You chose a problem with Force:");
		//If the user knows the mass then enter the mass
		out.print("Enter the mass (in kilograms):");
		mass = input.nextDouble();
		out.print("Enter the acceleration (in meters per second squared)");
		acceleration = input.nextDouble();
		out.print("Wait while I compute your answer .... " );
		Thread.sleep(2000);
		out.print("The force is " + f.force(mass, acceleration) + " m/s^2");
		out.print("The force is an interaction between objects that causes them to change motion. The formula for force states that force is equal to mass multipled by acceleration. So when you opened your locker door, your hand applies a force to the door, causing it to change its motion. We measure force in newtons (N), the scientific unit for measuring weight.");
		}
	catch(InterruptedException e) {
		e.printStackTrace();
		}
	}
	
	else if(answer == 2){
		try{
			out.print("You chose a problem with Displacement");
			out.print("Enter the initial position (in meters):");
			initial = input.nextDouble();
			out.print("Enter the final position (in meters):");
			f1nal = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The displacement is " + f.displacement(initial, f1nal) + " m");
			out.print("The displacement of an object is defined as its change in its position");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	else if(answer == 3){
		try{
			out.print("You chose a problem with the Time Interval");
			out.print("Enter the initial time (in seconds):");
			initial = input.nextDouble();
			out.print("Enter the final time(in seconds):");
			f1nal = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The time interval is " + f.timeInterval(initial, f1nal) + " s");
			out.print("The time interval is defined as the change in time");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	else if(answer == 4){
		try{
			out.print("You chose a problem with the Average Speed");
			out.print("Enter the total distance (in meters):");
			totalDistance = input.nextDouble();
			out.print("Enter the total time (in seconds):");
			totalTime = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The average speed is " + f.averageSpeed(totalDistance, totalTime) + " m/s");
			out.print("The average speed of an object over a given time interval is the total distance traveled divided by the total time elapsed");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	else if(answer == 5){
		try{
			out.print("You chose a problem with the Average Velocity");
			System.out.println("Enter the total displacement (in meters) :");
			totalDisplacement = input.nextDouble();
			out.print("Enter the time interval (in seconds):");
			timeInterval = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The average velocity is " + f.averageVelocity(totalDisplacement, timeInterval) + " m/s");
			out.print("The average velocity (v bar) during a time interval (delta t) is the displacement (delta x) divided by (delta t)");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
         
	else if(answer == 6){
		try{
			out.print("You chose a problem with the Average Acceleration");
			System.out.println("Enter the average velocity (in meters per second):");
			averageVelocity = input.nextDouble();
			out.print("Enter the time interval (in seconds):");
			timeInterval = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The average acceleration is " + f.averageAcceleration(averageVelocity, timeInterval) + " m/s^2");
			out.print("The average acceleration (a bar) during a time interval (delta t) is the change in velocity (delta v) divided by (delta t)");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
         
	else if(answer == 7){
		try{
			out.print("You chose a problem with the Average Acceleration");
			System.out.println("Enter the initial velocity (in meters per second):");
			initialVelocity = input.nextDouble();
                        out.print("Enter the final velocity (in seconds):");
                        finalVelocity = input.nextDouble();
			out.print("Enter the initial time (in seconds):");
			initialTime = input.nextDouble();
                        out.print("Enter the final time (in seconds):");
                        finalTime = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The average acceleration is " + f.averageAcceleration(initialVelocity, initialTime, finalVelocity, finalTime) + " m/s^2");
			out.print("The average acceleration (a bar) during a time interval (delta t) is the change in velocity (delta v) divided by (delta t)");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
         
	else if(answer == 8){
		try{
			out.print("You chose a problem with the Velocity as a function of time");
			out.print("Enter the intial velocity (in meters per second):");
			initialVelocity = input.nextDouble();
			out.print("Enter the accleration (in meters per second squared):");
			acceleration = input.nextDouble();
			out.print("Enter the time (in seconds):");
                        time = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The velocity as a function of time is " + f.velocity(initialVelocity, acceleration, time) + " m/s");
			
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
         
 	else if(answer == 9){
		try{
			out.print("You chose a problem with the displacement as a function of time");
			out.print("Enter the intial velocity (in meters per second):");
			initialVelocity = input.nextDouble();
			out.print("Enter the accleration (in meters per second squared):");
			acceleration = input.nextDouble();
			out.print("Enter the time (in seconds):");
                        time = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The displacement as a function of time is " + f.displacement(initialVelocity, acceleration, time) + " m");
			
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
  
	else if(answer == 10){
		try{
			out.print("You chose a problem with the Velocity Squared as a function of time");
			out.print("Enter the intial velocity (in meters per second):");
			initialVelocity = input.nextDouble();
			out.print("Enter the accleration (in meters per second squared):");
			acceleration = input.nextDouble();
			out.print("Enter the displacement (in meters):");
                        displacement = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The velocity squared as a function of time is " + f.velocity(initialVelocity, acceleration, displacement) + " m/s");
        }	
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	} 
		
  	else if(answer == 11){
		try{
			out.print("You chose a problem with the magnitude ");
			out.print("Enter the x component:");
			xComponent = input.nextDouble();
			out.print("Enter the y component:");
			yComponent = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The magnitude obtained from the x and y component is " + f.magnitude(xComponent, yComponent) + "");
        }	
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}        
  
  	else if(answer == 12){
		try{
			out.print("You chose a problem with the xComponent ");
			out.print("Enter the magnitude:");
			magnitude = input.nextDouble();
			out.print("Enter the angle:");
			angle = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The x component obtained from the magnitude and angle is " + f.xComponent(magnitude, angle) + " x^");
        }	
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
  	else if(answer == 13){
		try{
			out.print("You chose a problem with the yComponent ");
			out.print("Enter the magnitude:");
			magnitude = input.nextDouble();
			out.print("Enter the angle:");
			angle = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The y component obtained from the magnitude and angle is " + f.yComponent(magnitude, angle) + " y^");
        }	
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
  	else if(answer == 14){
		try{
			out.print("You chose a problem with the angle ");
			out.print("Enter the x component:");
			xComponent = input.nextDouble();
			out.print("Enter the y component:");
			yComponent = input.nextDouble();
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The angle obtained from the x and y component is " + f.angle(xComponent, yComponent) + " degrees");
        }	
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		
  out.print("Hello world!");
  out.print(f.force(142.0, 2.2));
  input.close();
 }
}
