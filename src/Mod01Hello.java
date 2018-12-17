import java.util.Scanner;

/**
 *doMod01 will take the user input
 *as the name to perform a greeting.
 *@author jcvega5237
 */
public class Mod01Hello {
  
  /**
   * The scanner takes any string so there is
   * no possible exception.
   */
  public static void doMod1() {
    System.out.println("Enter your name");
    Scanner scan = new Scanner(System.in); 
    String usersName = scan.nextLine(); 
    scan.close(); 
              
    // Greeting to User 
    System.out.println("Hello " + usersName);
    textWelcome();
            
  }
  
  /**
   * textWelcome just contains basic hello prints.
   */
  public static void textWelcome() {
    System.out.println("Module 1");
    System.out.println("Hello, World.");
    System.out.println("Hello, Java."); 
  }    
}     

