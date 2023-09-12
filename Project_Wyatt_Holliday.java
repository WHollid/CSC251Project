import javax.swing.JOptionPane;

public class Project_Wyatt_Holliday
{
   public static void main(String[] args)
      {
         int input;
         String name;
         boolean status;
         double numbers;
         double BMI;
         
         input = JOptionPane.showInputDialog(
                  "What is your provider's name?");
         name = JOptionPane.showInputDialog(
                  "What is your provider's name?");
         
         Policy account = new Policy();
         
         
         BMI = account.getBMI();
      }
}