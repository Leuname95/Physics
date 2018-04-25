import java.util.*;
public class Physics {
  
 public static void main(String[] args)
 {
   Formulas f = new Formulas();
   
  Scanner input = new Scanner(System.in);
  int answer;
  double mass, acceleration, initial, f1nal, totalDistance, totalTime, totalDisplacement, timeInterval;
  
  //Ask user what kind of problem they wish to solve
  System.out.println("What kind of problem do you need help with");  
  //List options
  System.out.println("----(Type in the # )----\n 1. Force\n 2. Displacement\n 3. Time Interval\n 4. Average Speed\n 5. Average Velocity\n 6. "+ "\n\n");
  //enter an answer
  answer = input.nextInt();
  if(answer == 1){
  	try{
  		System.out.println("You chose a problem with Force:");
		//If the user knows the mass then enter the mass
		System.out.println("Enter the mass (in kilograms):");
		mass = input.nextDouble();
		System.out.println("Enter the acceleration (in meters per second squared)");
		acceleration = input.nextDouble();
		System.out.println("Wait while I compute your answer .... " );
		Thread.sleep(2000);
		System.out.println("The force is " + f.force(mass, acceleration) + " m/s^2");
		System.out.println("The force is an interaction between objects that causes them to change motion. The formula for force states that force is equal to mass multipled by acceleration. So when you opened your locker door, your hand applies a force to the door, causing it to change its motion. We measure force in newtons (N), the scientific unit for measuring weight.");
		}
	catch(InterruptedException e) {
		e.printStackTrace();
		}
	}
	
	else if(answer == 2){
		try{
			System.out.println("You chose a problem with Displacement");
			System.out.println("Enter the initial position (in meters):");
			initial = input.nextDouble();
			System.out.println("Enter the final position (in meters):");
			f1nal = input.nextDouble();
			System.out.println("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			System.out.println("The displacement is " + f.displacement(initial, f1nal) + " m");
			System.out.println("The displacement of an object is defined as its change in its position");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	else if(answer == 3){
		try{
			System.out.println("You chose a problem with the Time Interval");
			System.out.println("Enter the initial time (in seconds):");
			initial = input.nextDouble();
			System.out.println("Enter the final time(in seconds):");
			f1nal = input.nextDouble();
			System.out.println("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			System.out.println("The time interval is " + f.timeInterval(initial, f1nal) + " s");
			System.out.println("The time interval is defined as the change in time");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	else if(answer == 4){
		try{
			System.out.println("You chose a problem with the Average Speed");
			System.out.println("Enter the total distance:");
			totalDistance = input.nextDouble();
			System.out.println("Enter the total time:");
			totalTime = input.nextDouble();
			System.out.println("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			System.out.println("The average speed is " + f.averageSpeed(totalDistance, totalTime) + " m/s");
			System.out.println("The average speed of an object over a given time interval is the total distance traveled divided by the total time elapsed");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	else if(answer == 5){
		try{
			System.out.println("You chose a problem with the Average Velocity");
			System.out.println("Enter the total displacement:");
			totalDisplacement = input.nextDouble();
			System.out.println("Enter the time interval:");
			timeInterval = input.nextDouble();
			System.out.println("Wait while I compute your answer .... ");
			Thread.sleep(2000);
			System.out.println("The average velocity is " + f.averageVelocity(totalDisplacement, timeInterval) + " m/s");
			System.out.println("The average velocity (v bar) during a time interval (delta t) is the displacement (delta x) divided by (delta t)");
		}
	catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
  System.out.println("Hello world!");
  System.out.println(f.force(142.0, 2.2));
  input.close();
 }

}
