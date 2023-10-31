
public class Policy
{  
      static int numObjects = 0;
      private String name;
      private int policyNum;
      private PolicyHolder policy;

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
      /**
      public Policy()
      {
         policyNum = 0;
         name = "";
         policy = new PolicyHolder(policyHold);
         
      }
      */

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
      public Policy(int numPolicy, String names, PolicyHolder policyhold)
      {
         policyNum = numPolicy;
         name = names;
         policy = new PolicyHolder(policyhold);
         numObjects ++;
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
     @param
     */
     public void setPolicyHolder(PolicyHolder policyHold)
     {
        policy = new PolicyHolder(policyHold);
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
      @return the PolicyHolder object
      */
      public PolicyHolder getPolicyHolder()
      {
         return new PolicyHolder(policy);
      }
      
      /**
      Method to calculate the fee of the policy
      @return the policies calculated fee
      */
      public double insuranceCalculator(double BMI){
         double policyFee = 600;
         if(policy.getAge() > 50){
            policyFee += 75;
         }
         if((policy.getSmokingStatus()).equals("smoker")){
            policyFee += 100;
         }
         if(policy.getBMI() > 35){
            policyFee += (policy.getBMI() - 35)*20;
         }
         return policyFee;}
         
     public String toString()
     {
        return String.format("Policy Number: " + policyNum + "\nPolicy name: " + name + policy.toString() +"\nPolicy Price: $" + String.format("%.2f", insuranceCalculator(policy.getBMI())));

     }
}