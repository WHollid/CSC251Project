
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

      /**
      no arg constructor that initializes variables
      @param PolicyNum the policy's number
      @param name the name of the policy
      @param firstName the first name of the person holding the policy
      @param lastName the last name of the person holding the policy
      @param holderAge the age of the holder
      @param SmokinginStatus the smoking status of the policy holder
      @param holderHeight the height of the holder
      @param holderWeight the weight of the holder
      */
      public Policy()
      {
         policyNum = 0;
         name = "";
         firstName = "";
         lastName = "";
         holderAge = 0;
         smokingStatus = "non-smoker";
         holderHeight = 0;
         holderWeight = 0;
      }

      /**
      constructor with arguments that assigns variables to apporpriate fields
      @param PolicyNum the policy's number
      @param name the name of the policy
      @param firstName the first name of the person holding the policy
      @param lastName the last name of the person holding the policy
      @param holderAge the age of the holder
      @param SmokinginStatus the smoking status of the policy holder
      @param holderHeight the height of the holder
      @param holderWeight the weight of the holder
      */
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
      
     /**Setter methods
     @param PolicyNum the policy's number
     */    
     public void setPolicy(int numPolicy)
     {
        policyNum = numPolicy;
     }
      /**
     @param name the name of the policy
     */ 
     public void setname(String names)
     {
        name = names;
     }
           
      /**Accessor methods returns the policy object's values (get methods)
      @return the policy number
      */
      public int getPolicyNum()
      {  
         return policyNum;
      }
      /**
      @return the policy's name
      */
      public String getName(){
         return name;
      }
      
      
      /**
      Method to calculate the fee of the policy
      @return the policies calculated fee
      */
      public double insuranceCalculator(double BMI){
         double policyFee = 600;
         if(holderAge > 50){
            policyFee += 75;
         }
         if(smokingStatus.equals("smoker")){
            policyFee += 100;
         }
         if(BMI > 35){
            policyFee += (BMI - 35)*20;
         }
         return policyFee;}
         
     public String toString()
     {
        String string = "Policy Number: " + policyNum + "\nPolicy name: " + name + "\nPolicy Price: $" + policyFee;
        
        return string;
     }
}