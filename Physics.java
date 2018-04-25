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
  char response;
  double mass, acceleration, initial, f1nal, totalDistance, totalTime, totalDisplacement, timeInterval, averageAcceleration, initialVelocity,
         time, finalVelocity, initialTime, finalTime, xComponent, yComponent, magnitude, angle, displacement, averageVelocity;
  
  //Ask user what kind of problem they wish to solve
  out.print("What kind of problem do you need help with");  
  //List options
  out.print("----(Type in the # )----\n 1. Force\n 2. Displacement\n 3. Time Interval\n 4. Average Speed\n 5. Average Velocity\n 6. Average Acceleration\n" +
	    " 7. Average Acceleration\n 8. Velocity as a function of time\n 9. Displacement as a function of time\n 10. Velocity Squared\n" +
	    " 11. Magnitude\n 12. X Component\n 13. Y Component\n 14. Angle\n 15. "+ "\n\n");
  //enter an answer
  answer = input.nextInt();
  if(answer == 1){
	try{
			out.println("You chose a problem with Force:");
			//If the user knows the mass then enter the mass
			out.println("Enter the mass (in kilograms):");
			mass = input.nextDouble();
			//Check to see if user entered the correct mass
			out.println("You entered: " + mass + " kg. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("mass is correct");
			}
			else{
			out.println("enter the corrected mass");
			mass = input.nextDouble();
			}
			out.println("Enter the acceleration (in meters per second squared)");
			acceleration = input.nextDouble();
			//Check to see if user entered the correct acceleration
			out.println("You entered: " + acceleration + " m/s^2.\nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("acceleration is correct");
			}
			else{
			    out.println("enter the corrected acceleration");
			    acceleration = input.nextDouble();
			}
			out.println("Wait while I compute your answer .... " );
			Thread.sleep(2000);
			out.println("The force is " + f.force(mass, acceleration) + " m/s^2");
			out.println("The force is an interaction between objects that causes them to change motion. The formula for force states that force is equal to mass multipled by acceleration. So when you opened your locker door, your hand applies a force to the door, causing it to change its motion. We measure force in newtons (N), the scientific unit for measuring weight.");
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
			//Check to see if user entered the correct initial position
			out.println("You entered: " + initial + " m. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("initial position is correct");
			}
			else{
			out.println("enter the corrected initial position");
			initial = input.nextDouble();
			}			
			out.print("Enter the final position (in meters):");
			f1nal = input.nextDouble();
			//Check to see if user entered the correct final position
			out.println("You entered: " + f1nal + " m. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			f1nal = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("final position is correct");
			}
			else{
			out.println("enter the corrected final position");
			f1nal = input.nextDouble();
			}
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
			//Check to see if user entered the correct total distance
			out.println("You entered: " + totalDistance + " m. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("total distance is correct");
			}
			else{
			out.println("enter the corrected total distance");
			totalDistance = input.nextDouble();
			}
			out.print("Enter the total time (in seconds):");
			totalTime = input.nextDouble();
			//Check to see if user entered the correct total time
			out.println("You entered: " + totalTime + " s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("total time is correct");
			}
			else{
			out.println("enter the corrected total time");
			totalTime = input.nextDouble();
			}
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
			//Check to see if user entered the correct total displacement
			out.println("You entered: " + totalDisplacement + " kg. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("total displacement is correct");
			}
			else{
			out.println("enter the corrected mass");
			totalDisplacement = input.nextDouble();
			}
			out.print("Enter the time interval (in seconds):");
			timeInterval = input.nextDouble();
			//Check to see if user entered the correct time interval
			out.println("You entered: " + timeInterval + " s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("time interval is correct");
			}
			else{
			out.println("enter the corrected time interval");
			timeInterval = input.nextDouble();
			}
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
			//Check to see if user entered the correct average velocity
			out.println("You entered: " + averageVelocity + " m/s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("average velocity is correct");
			}
			else{
			out.println("enter the corrected average velocity");
			averageVelocity = input.nextDouble();
			}
			out.print("Enter the time interval (in seconds):");
			timeInterval = input.nextDouble();
			//Check to see if user entered the correct time interval
			out.println("You entered: " + timeInterval + " s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("time interval is correct");
			}
			else{
			out.println("enter the corrected time interval");
			timeInterval = input.nextDouble();
			}
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
			//Check to see if user entered the correct initial velocity
			out.println("You entered: " + initialVelocity + " m/s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("initial velocity is correct");
			}
			else{
			out.println("enter the corrected initial velocity");
			initialVelocity = input.nextDouble();
			}
                        out.print("Enter the final velocity (in seconds):");
                        finalVelocity = input.nextDouble();
			//Check to see if user entered the final velocity
			out.println("You entered: " + finalVelocity + " m/s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("final velocity is correct");
			}
			else{
			out.println("enter the corrected final velocity");
			finalVelocity = input.nextDouble();
			}
			out.print("Enter the initial time (in seconds):");
			initialTime = input.nextDouble();
			//Check to see if user entered the correct initial time
			out.println("You entered: " + initialTime + " s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("initial time is correct");
			}
			else{
			out.println("enter the corrected initial time");
			initialTime = input.nextDouble();
			}
                        out.print("Enter the final time (in seconds):");
                        finalTime = input.nextDouble();
			//Check to see if user entered the correct final time
			out.println("You entered: " + finalTime + " s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("final time is correct");
			}
			else{
			out.println("enter the corrected final time");
			finalTime = input.nextDouble();
			}
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
			//Check to see if user entered the correct initial velocity
			out.println("You entered: " + initalVelocity + " m/s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("initial velocity is correct");
			}
			else{
			out.println("enter the corrected initial velocity");
			initialVelocity = input.nextDouble();
			}
			out.print("Enter the accleration (in meters per second squared):");
			acceleration = input.nextDouble();
			//Check to see if user entered the correct acceleration
			out.println("You entered: " + acceleration + " m/s^s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("acceleration is correct");
			}
			else{
			out.println("enter the corrected accleration");
			acceleration = input.nextDouble();
			}
			out.print("Enter the time (in seconds):");
                        time = input.nextDouble();
			//Check to see if user entered the correct time
			out.println("You entered: " + time + " s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("time is correct");
			}
			else{
			out.println("enter the corrected time");
			time = input.nextDouble();
			}
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
			out.println("You chose a problem with the displacement as a function of time");
			out.println("Enter the intial velocity (in meters per second):");
			initialVelocity = input.nextDouble();
			//Check to see if user entered the correct initial velocity
			out.println("You entered: " + initialVelocity + " m/s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("initial velocity is correct");
			}
			else{
			out.println("enter the corrected initial velocity");
			initialVelocity = input.nextDouble();
			}
			out.println("Enter the accleration (in meters per second squared):");
			acceleration = input.nextDouble();
			//Check to see if user entered the correct acceleration
			out.println("You entered: " + acceleration + " m/s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("acceleration is correct");
			}
			else{
			out.println("enter the corrected acceleration");
			acceleration = input.nextDouble();
			}
			out.println("Enter the time (in seconds):");
                        time = input.nextDouble();
			//Check to see if user entered the correct time
			out.println("You entered: " + time + " s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("time is correct");
			}
			else{
			out.println("enter the corrected time");
			time = input.nextDouble();
			}
			out.println("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.println("The displacement as a function of time is " + f.displacement(initialVelocity, acceleration, time) + " m");
			
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
			//Check to see if user entered the correct initial velocity
			out.println("You entered: " + initialVelocity + " m/s. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("initial velocity is correct");
			}
			else{
			out.println("enter the corrected initial velocity");
			initialVelocity = input.nextDouble();
			}
			out.print("Enter the accleration (in meters per second squared):");
			acceleration = input.nextDouble();
			//Check to see if user entered the correct acceleration 
			out.println("You entered: " + acceleraton + " m/s^2. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("acceleration is correct");
			}
			else{
			out.println("enter the corrected acceleration");
			acceleration = input.nextDouble();
			}
			out.print("Enter the displacement (in meters):");
                        displacement = input.nextDouble();
			//Check to see if user entered the correct displacement
			out.println("You entered: " + displacement + " m. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);
			if(response == 'y'){
			   out.println("displacement is correct");
			}
			else{
			out.println("enter the corrected displacement");
			mass = input.nextDouble();
			}			
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
			//Check to see if user entered the correct x component
			out.println("You entered: " + xComponent + " x^. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("x component is correct");
			}
			else{
			out.println("enter the corrected x component");
			xComponent = input.nextDouble();
			}
			out.print("Enter the y component:");
			yComponent = input.nextDouble();
			//Check to see if user entered the correct y component
			out.println("You entered: " + yComponent + " y^. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("y component is correct");
			}
			else{
			out.println("enter the corrected y component");
			yComponent = input.nextDouble();
			}
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
			//Check to see if user entered the correct magnitude
			out.println("You entered: " + magnitude + " . \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("magnitude is correct");
			}
			else{
			out.println("enter the corrected magnitude");
			magnitude = input.nextDouble();
			}
			out.print("Enter the angle:");
			angle = input.nextDouble();
			//Check to see if user entered the correct angle
			out.println("You entered: " + angle + " degrees. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("angle is correct");
			}
			else{
			out.println("enter the corrected angle");
			angle = input.nextDouble();
			}
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
			//Check to see if user entered the correct magnitude
			out.println("You entered: " + magnitude + " . \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("magnitude is correct");
			}
			else{
			out.println("enter the corrected magnitude");
			magnitude = input.nextDouble();
			}
			out.print("Enter the angle:");
			angle = input.nextDouble();
			//Check to see if user entered the correct angle
			out.println("You entered: " + angle + " degrees. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("angle is correct");
			}
			else{
			out.println("enter the corrected angle");
			angle = input.nextDouble();
			}
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
			//Check to see if user entered the correct x component
			out.println("You entered: " + xComponent + " x^. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("x component is correct");
			}
			else{
			out.println("enter the corrected x component");
			xComponent = input.nextDouble();
			}
			out.print("Enter the y component:");
			yComponent = input.nextDouble();
			//Check to see if user entered the correct y component
			out.println("You entered: " + yComponent + " y^. \nIs this correct?\nIf yes press 'y' and enter. if no press 'n' and enter");
			response = input.next(".").charAt(0);;
			if(response == 'y'){
			   out.println("y component is correct");
			}
			else{
			out.println("enter the corrected y component");
			yComponent = input.nextDouble();
			}
			out.print("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			out.print("The angle obtained from the x and y component is " + f.angle(xComponent, yComponent) + " degrees");
        }	
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
  out.print("\n");

  out.print("Hello world!");
  out.print(f.force(142.0, 2.2));
  input.close();
 }
}
