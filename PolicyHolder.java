
/**
Policy Holder Class that holds information related to the policy holder, such as name, age, smoking status, weight and height
*/
public class PolicyHolder
{
   private String name;
   private String firstName;
   private String lastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   /**
      no arg constructor that initializes variables
      @param firstName the first name of the person holding the policy
      @param lastName the last name of the person holding the policy
      @param holderAge the age of the holder
      @param SmokinginStatus the smoking status of the policy holder
      @param holderHeight the height of the holder
      @param holderWeight the weight of the holder
      */
      public Policy()
      {
         firstName = "";
         lastName = "";
         holderAge = 0;
         smokingStatus = "non-smoker";
         holderHeight = 0;
         holderWeight = 0;
      }

      /**
      constructor with arguments that assigns variables to apporpriate fields
      @param firstName the first name of the person holding the policy
      @param lastName the last name of the person holding the policy
      @param holderAge the age of the holder
      @param SmokinginStatus the smoking status of the policy holder
      @param holderHeight the height of the holder
      @param holderWeight the weight of the holder
      */
      public Policy(String nameFirst, String nameLast, int age, String smokeStatus, double height, double weight)
      {
         firstName = nameFirst;
         lastName = nameLast;
         holderAge = age;
         smokingStatus = smokeStatus;
         holderHeight = height;
         holderWeight = weight;
      }
      
     /**Setter methods
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
     
     /**getter methods
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

}