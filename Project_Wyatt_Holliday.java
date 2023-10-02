import java.util.Scanner;
import java.util.*; 
import java.io.*;

public class Project_Wyatt_Holliday
{
   public static void main(String[] args)
      {
         
         
         try 
      {

         File file = new File("PolicyInformation.txt");
          
                             
         Scanner inputFile = new Scanner(file);
      
         int numPolicy = 0;
         String names = "";
         String nameFirst = "";
         String nameLast = "";
         int age = 0;
         String smokeStatus = "";
         double height = 0;
         double weight = 0;
         String fileInput = "";
      
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
      
         while(inputFile.hasNext())       
         {
         
            fileInput = inputFile.nextLine();
            numPolicy = Integer.parseInt(fileInput); 
            names = inputFile.nextLine();
            nameFirst = inputFile.nextLine();
            nameLast = inputFile.nextLine();
            fileInput = inputFile.nextLine();
            age = Integer.parseInt(fileInput);
            smokeStatus = inputFile.nextLine();
            fileInput = inputFile.nextLine();
            height = Double.parseDouble(fileInput);
            fileInput = inputFile.nextLine();
            weight = Double.parseDouble(fileInput);
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
            }
            Policy account = new Policy(numPolicy, names, nameFirst, nameLast, age, smokeStatus, height, weight);
            policies.add(account);
         
         } 
      
         inputFile.close();
               
         for(int i =0; i < policies.size(); i++)
         { 
            System.out.println("Policy Number: " + policies.get(i).getPolicyNum());
            System.out.println("Policy Name: " + policies.get(i).getName());
            System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policies.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(i).getHeight());
            System.out.println("Policyholder's Weight: " + policies.get(i).getWeight());
            //System.out.println("Policyholder's BMI: " + String.format("%.2f",account.getBMI()));
            //System.out.println("Policy Price: $" + String.format("%.2f", account.insuranceCalculator(account.getBMI())));
             
            System.out.println();
            
            
         }   
         //System.out.println("Policyholder's BMI: " + String.format("%.2f",account.getBMI()));
         //System.out.println("Policy Price: $" + String.format("%.2f", account.insuranceCalculator(Policy.getBMI()))); 
      }//close the "try" block of code
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
         
         //chapter 4.10 for file Input and Output
         //chapter 7.13 Arraylist
         //Scanner keyboard = new Scanner(System.in);
         
         //System.out.println("Please enter the Policy Number:");
         //numPolicy = keyboard.nextInt();
         //keyboard.nextLine();
         
         //System.out.println("Please enter the Provider name:");
         //names = keyboard.nextLine();
                  
         //System.out.println("Please enter the Policyholder's First Name:");
         //nameFirst = keyboard.nextLine();                  
         
         //System.out.println("Please enter the Policyholder's Last Name:");
         //nameLast = keyboard.nextLine();                  
         
         //System.out.println("Please enter the Policyholder's Age:");
         //age = keyboard.nextInt();                  
         
         //System.out.println("Please enter the Policyholder's Smoking Status(smoker/non-smoker):");
         //keyboard.nextLine();
         //smokeStatus = keyboard.nextLine();                
         
         //System.out.println("Please enter the Policyholder's Height(in inches):");
         //height = keyboard.nextDouble();                  
         
         //System.out.println("Please enter the Policyholder's Weight(in pounds):");
         //weight = keyboard.nextDouble();                  
         
         //Policy account = new Policy(numPolicy, names, nameFirst, nameLast, age, smokeStatus, height, weight);
         
         
         //System.out.println("Policy Number: " + numPolicy);
         //System.out.println("Policy Name: " + names);
         //System.out.println("Policyholder's First Name: " + nameFirst);
         //System.out.println("Policyholder's Last Name: " + nameLast);
         //System.out.println("Policyholder's Age: " + age);
         //System.out.println("Policyholder's Smoking Status: " + smokeStatus);
         //System.out.println("Policyholder's Height: " + height);
         //System.out.println("Policyholder's Weight: " + weight);
         //System.out.println("Policyholder's BMI: " + String.format("%.2f",account.getBMI()));
         //System.out.println("Policy Price: $" + String.format("%.2f", account.insuranceCalculator(account.getBMI())));
      }
      
}