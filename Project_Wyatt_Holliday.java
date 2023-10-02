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
         int smokerNum = 0;
         int nonsmokerNum = 0;
      
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
            
            if(smokeStatus.equals("smoker"))
            {
               smokerNum++;
            }
            else
            {
               nonsmokerNum++;
            }
            
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
            System.out.println("Policyholder's Smoking Status(smoker/non-smoker): " + policies.get(i).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(i).getHeight());
            System.out.println("Policyholder's Weight: " + policies.get(i).getWeight());
            System.out.println("Policyholder's BMI: " + String.format("%.2f",policies.get(i).getBMI()));
            System.out.println("Policy Price: $" + String.format("%.2f", policies.get(i).insuranceCalculator(policies.get(i).getBMI())));
             
            System.out.println();
            
            
         }   
         System.out.println("The number of policies with a smoker is: " + smokerNum + "\nThe number of policies with a non-smoker is: " + nonsmokerNum); 
      }
      catch(IOException ex)      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
         
         //System.out.println("Policyholder's BMI: " + String.format("%.2f",account.getBMI()));
         //System.out.println("Policy Price: $" + String.format("%.2f", account.insuranceCalculator(account.getBMI())));
      }
      
}