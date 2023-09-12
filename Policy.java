
public class Policy
{
      private int policyNum;
      private String name;
      private String firstName;
      private String lastName;
      private int holderAge;
      private String smokingStatus;
      private double holderHeight;
      private double holderWeight;

      //no arg constructor that initializes
      public Policy()
      {
         policyNum = 0; //variables initialized with default value
         name = "";
         firstName = "";
         lastName = "";
         holderAge = 0;
         smokingStatus = "non-smoker";
         holderHeight = 0;
         holderWeight = 0;
      }

      //constructor with arguments that assigns variables to apporpriate fields
      public Policy(int numPolicy, String names, String nameFirst, String nameLast, int age, String smokeStatus, double height, double weight)
      {
         policyNum = numPolicy;
         name = names;
         firstName = nameFirst;
         lastName = nameLast;
         holderAge = age;
         smokingStatus = smokeStatus;
         holderHeight = height;
         holderWeight = weight;
      }
      
     //mutator setter fields     
     public void setPolicy(int numPolicy)
     {
        policyNum = numPolicy;
     }
      
     public void setname(String names)
     {
        name = names;
     }
      
     public void setFirstName(String nameFirst)
     {
        firstName = nameFirst;
     }
      
     public void setLastName(String nameLast)
     {
        lastName = nameLast;
     }
      
     public void setAge(int age)
     {
        holderAge = age;
     }
     public void setSmokingStatus(String smokeStatus)
     {
        smokingStatus = smokeStatus;
     }
     public void setHeight(double height)
     {
        holderHeight = height;
     }
      
     public void setWeight(double weight)
     {
        holderWeight = weight;
     }
      
      //Accessor methods returns the policy object's values 
      public int getPolicyNum()
      {  
         return policyNum;
      }
      public String getName(){
         return name;
      }
      public String getFirstName(){
         return firstName;
      }
      public String getLastName(){
         return lastName;
      }
      public int getAge(){
         return holderAge;
      }
      public String getSmokingStatus(){
         return smokingStatus;
      }
      public double getHeight(){
         return holderHeight;
      }
      public double getWeight(){
         return holderWeight;
      }

      public double getBMI(){
         return (holderWeight * 703)/(holderHeight*holderHeight);
      }
      
      public double insuranceCalculator(double BMI){
         double policyFee = 600;
         if(holderAge > 50){
            policyFee += 75;
         }
         if(smokingStatus == "smoker"){
            policyFee += 100;
         }
         if(BMI > 35){
            policyFee += (BMI - 35)*20;
         }
         return policyFee;}
}