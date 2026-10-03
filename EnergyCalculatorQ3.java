import java.util.Scanner;


public class EnergyCalculatorQ3 {

 
public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
       
return morningEnergy + eveningEnergy;
  
}

  
public static void main(String[] args) {
      
Scanner sc = new Scanner(System.in);

    
System.out.print("Enter morning energy generation in kWh: ");
   
double morning = sc.nextDouble();

     
System.out.print("Enter evening energy generation in kWh: ");
     
double evening = sc.nextDouble();

     
double totalenergy = calculateTotalEnergy(morning, evening);
      
System.out.println("Total Energy Generated: " + totalenergy + " kWh");

       
sc.close();
    
}

}