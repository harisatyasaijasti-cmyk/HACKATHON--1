import java.util.Scanner;


public class EnergyMonitorQ2 {
 
public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);

  
System.out.print("Enter energy generated in kWh: ");
 
double energygenerated = sc.nextDouble();

    
if (energygenerated >= 10) {
         
System.out.println("Good Energy Generation");
     
} 
else {
        
System.out.println("Low Energy Generation");
     
}

        
sc.close();
 
}

}