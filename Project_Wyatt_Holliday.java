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
            PolicyHolder policy = new PolicyHolder(nameFirst, nameLast, age, smokeStatus, height, weight);
            Policy account = new Policy(numPolicy, names, policy);
            policies.add(account);
         
         } 
      
         inputFile.close();
               
         for(int i =0; i < policies.size(); i++)
         { 
            System.out.println(policies.get(i));
            System.out.println();
         }
         System.out.println("There were " + Policy.numObjects + " Policy objects created.");
         System.out.println();   
         System.out.println("The number of policies with a smoker is: " + smokerNum + "\nThe number of policies with a non-smoker is: " + nonsmokerNum); 
      }
      catch(IOException ex)      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
         
         //System.out.println("Policyholder's BMI: " + String.format("%.2f",account.getBMI()));
         //System.out.println("Policy Price: $" + String.format("%.2f", account.insuranceCalculator(account.getBMI())));
      }
      
}