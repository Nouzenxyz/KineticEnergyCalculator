import java.util.*;

public class KineticEnergyCalculator {
    public static void main(String[]args) {
        
        
        Scanner jlc = new Scanner(System.in);
        System.out.print("Enter mass in kilograms: ");
        double mass = jlc.nextDouble();
       
        System.out.print("Enter velocity in meters per second: ");
        double velocity = jlc.nextDouble();
        
        double kineticEnergy = calculateKineticEnergy(mass, velocity);
        System.out.printf("The object's kinetic energy is: %.2f J.", kineticEnergy);
    }
    
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * velocity * velocity;
    }
}
