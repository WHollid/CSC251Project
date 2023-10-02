
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
     /**
     @param firstName the first name of the person holding the policy
     */ 
     public void setFirstName(String nameFirst)
     {
        firstName = nameFirst;
     }
     /**
     @param lastName the last name of the person holding the policy
     */ 
     public void setLastName(String nameLast)
     {
        lastName = nameLast;
     }
     /**
     @param holderAge the age of the holder
     */ 
     public void setAge(int age)
     {
        holderAge = age;
     }
     /**
     @param SmokinginStatus the smoking status of the policy holder
     */ 
     public void setSmokingStatus(String smokeStatus)
     {
        smokingStatus = smokeStatus;
     }
     /**
     @param holderHeight the height of the holder
     */ 
     public void setHeight(double height)
     {
        holderHeight = height;
     }
     /**
     @param holderWeight the weight of the holder
     */  
     public void setWeight(double weight)
     {
        holderWeight = weight;
     }
      
      /**Accessor methods returns the policy object's values
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
      @return the policy holder's first name
      */
      public String getFirstName(){
         return firstName;
      }
      /**
      @return the policy holder's last name
      */
      public String getLastName(){
         return lastName;
      }
      /**
      @return the policy holder's age
      */
      public int getAge(){
         return holderAge;
      }
      /**
      @return the policy holder's smoking status
      */
      public String getSmokingStatus(){
         return smokingStatus;
      }
      /**s
      @return the policy holder's height
      */
      public double getHeight(){
         return holderHeight;
      }
      /**
      @return the policy number
      */
      public double getWeight(){
         return holderWeight;
      }
      /**
      Method to calculate the BMI of the policy holder using their weight and height
      @return the calculated BMI
      */
      public double getBMI(){
         return (holderWeight * 703)/(holderHeight*holderHeight);
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
         if(smokingStatus == "smoker"){
            policyFee += 100;
         }
         if(BMI > 35){
            policyFee += (BMI - 35)*20;
         }
         return policyFee;}
}