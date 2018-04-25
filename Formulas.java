import java.lang.Math;
public class Formulas {
 
   //acceleration of gravity on earth
   static double gravity = 9.8;
   static double coulumbsConstant = 8.99 * Math.pow(10, 9);
   
   
   
   public Formulas(){
     }
     
     
     //this method returns the displacement
     //The displacement of an object is defined as its change in its position
     // SI unit: meters (m)
     public double displacement(double initial, double end){
       double displacement= end - initial;
       return displacement;
     }
     
          //this method returns the time interval
     //The time interval is defined as its change in its time
     // SI unit: seconds (s)
     public double timeInterval(double initial, double end){
       double timeInterval = end - initial;
       return timeInterval;
     }
      
      //the average speed of an object over. given time interval is the total distance traveled divided by the total time elapsed
      //SI unit: meters per second (m/s)
     public  double averageSpeed(double totalDistance, double totalTime){
       double averageSpeed = totalDistance / totalTime;
       return averageSpeed;
     }
     
     //The average velocity v bar during a time interval delta t is the displacement delta x divided by delta t
     //SI unit: meters per second (m/s)
    public double averageVelocity(double totalDisplacement, double timeInterval){
      double averageVelocity = totalDisplacement / timeInterval;
      return averageVelocity;
    }
    
   //write formulas that would return the variables 
   
   
     //The average velocity v bar during a time interval delta t is the displacement delta x divided by delta t
     //SI unit: meters per second (m/s)
    public double averageVelocity(double initialPosition, double initialTime, double finalPosition, double finalTime){
      double averageVelocity = (finalPosition - initialPosition) / (finalTime - initialTime);
      return averageVelocity;
    }  
    
      //The average acceleration a bar during a time interval delta t is the change in velocity delta v divided by delta t
     //SI unit: meters per second squared (m/s^2)
    public double averageAcceleration(double averageVelocity, double timeInterval){
      double averageAcceleration = averageVelocity / timeInterval;
      return averageAcceleration;
    }  

     //The average acceleration a bar during a time interval delta t is the change in velocity delta v divided by delta t
     //SI unit: meters per second squared (m/s^2)
    public double averageAcceleration(double initialVelocity, double initialTime, double finalVelocity, double finalTime){
      double averageAcceleration = (finalVelocity - initialVelocity) / (finalTime - initialTime);
      return averageAcceleration;
    }  
    
    //The following formulas are funtions of time
    
    //Velocity as a function of time
    public double velocity(double initialVelocity, double acceleration, double time){
      double velocity = initialVelocity - (acceleration * time);
      return velocity;
    }
    
    //displacement as a function of time
    public double displacement(double initialVelocity, double acceleration, double time){
      double displacement = (initialVelocity * time) + ((1/2) * acceleration * time);
      return displacement;
    }
    
    //Velocity as a function of displacement
    public double velocitySquared(double initialVelocity, double acceleration, double displacement){
      double velocity = (initialVelocity * initialVelocity) + (2 * acceleration * displacement);
      return velocity;
    }
    
    //Vectors
    
    //magnitude
    public double magnitude(double xComponent, double yComponent){
      double magnitude = Math.sqrt((xComponent * xComponent) + (yComponent * yComponent));
      return magnitude;
    }
    
    // X component
    public double xComponent(double magnitude, double angle){
      double xComponent = magnitude * java.lang.Math.cos(angle);
      return xComponent;
    }
    
    // Y component
    public double yComponent(double magnitude, double angle){
      double yComponent = magnitude * java.lang.Math.sin(angle);
      return yComponent;
    }
    
    //Angle
    public double angle(double xComponent, double yComponent){
      double angle = Math.atan(yComponent / xComponent);
      return angle;
    }
    
    
    //the laws of motion
    
    //Weight is the magnitude of the gravitational force acting on an object of mass m near Earth's surface 
    //SI unit: newton (N) = kg*m/s^2 = 0.225 lb
    public double weight(double mass){
      double weight = mass * gravity;
      return weight;
    }
    
    //Force is an interaction between objects that causes them to change motion.  
    //The formula for force is equal to the mass multiplied by the acceleration.
    //SI Unit: newton (N) = kg*m/s^2 = 0.225 lb
    public double force (double mass, double acceleration){
      double force = mass * acceleration;
      return force;
    }
    
    //The work W done on an object by a constant force F vector(->) during a linear displacement
    //F is the magnitide of the force, delta x is the magnitude of the displacement, and F vector and delta x point in the same direction
    //SI unit: joule (J) = newton * meter (N*m) = kg * m^2 / s^2
    public double work (double forceMagnitude, double displacement){
      double work = forceMagnitude * displacement;
      return work;
    }
   
    //The work W done on an object by a constant force F vector(->) during a linear displacement
    //F is the magnitide of the force, delta x is the magnitude of the object's displacement, and theta is the angle between the directions of F vector and delta x
    //SI unit: joule (J) = newton * meter (N*m) = kg * m^2 / s^2
    public double work (double forceMagnitude, double displacement, double angle){
      double work = (forceMagnitude * Math.cos(angle)) * displacement;
      return work;
    }
    
    //The kinetic energy KE of an object of mass m moving with a speed v 
    //SI unit: joule (J) = kg*m^2/s^2
    public double kineticEnergy (double mass, double velocity){
      double kineticEnergy = (1/2) * mass * (velocity * velocity);
      return kineticEnergy;
    }
    
    //The net work done on an objectis equal to the change in the object's kinetic energy
    //where the change in the kinetic energy is due entirely to the object's change in speed
    public double netWork (double initialKE, double finalKE){
      double netWork = finalKE - initialKE;
      return netWork;
    }
    
    //The change in Kinetic Energy is the difference between the final kinetic energy from the initial kinetic energy
    //SI unit: joule (J) = kg*m^2/s^2    
    public double deltaKE (double initialKE, double finalKE){
    	double deltaKE = finalKE - initialKE;
	return deltaKE;
    }
    
    //Momentum and Collisions
    
    //The linear momentum vector p of an object of mass m moing with velocity vector v 
    //SI unit: kilogram-meter per second (kg*m/s) 
    public double linearMomentum (double mass, double velocity){
    	double linearMomentum = mass * velocity;
	return linearMomentum;
    }
     
     //linear 
     public double momentumXComponent (double mass, double velocity, double xComponent){
       double momentumXComponent = mass * (velocity * xComponent);
       return momentumXComponent;
     }
     
     
}
