import java.util.Scanner;

public class Project_Wyatt_Holliday
{
   public static void main(String[] args)
      {
         int numPolicy;
         String names;
         String nameFirst;
         String nameLast;
         int age;
         String smokeStatus;
         double height;
         double weight;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("Please enter the Policy Number:");
         numPolicy = keyboard.nextInt();
         keyboard.nextLine();
         
         System.out.println("Please enter the Provider name:");
         names = keyboard.nextLine();
                  
         System.out.println("Please enter the Policyholder's First Name:");
         nameFirst = keyboard.nextLine();                  
         
         System.out.println("Please enter the Policyholder's Last Name:");
         nameLast = keyboard.nextLine();                  
         
         System.out.println("Please enter the Policyholder's Age:");
         age = keyboard.nextInt();                  
         
         System.out.println("Please enter the Policyholder's Smoking Status(smoker/non-smoker):");
         keyboard.nextLine();
         smokeStatus = keyboard.nextLine();                
         
         System.out.println("Please enter the Policyholder's Height(in inches):");
         height = keyboard.nextDouble();                  
         
         System.out.println("Please enter the Policyholder's Weight(in pounds):");
         weight = keyboard.nextDouble();                  
         
         Policy account = new Policy(numPolicy, names, nameFirst, nameLast, age, smokeStatus, height, weight);
         
         
         System.out.println("Policy Number: " + numPolicy);
         System.out.println("Policy Name: " + names);
         System.out.println("Policyholder's First Name: " + nameFirst);
         System.out.println("Policyholder's Last Name: " + nameLast);
         System.out.println("Policyholder's Age: " + age);
         System.out.println("Policyholder's Smoking Status: " + smokeStatus);
         System.out.println("Policyholder's Height: " + height);
         System.out.println("Policyholder's Weight: " + weight);
         System.out.println("Policyholder's BMI: " + String.format("%.2f",account.getBMI()));
         System.out.println("Policy Price: $" + String.format("%.2f", account.insuranceCalculator(account.getBMI())));
      }
      
}