import java.util.Scanner;

/**
    *@author jcvega5237
    *doMod01 will take the user input
    *as the name to perform a greeting
*/
public class Mod01Hello {
  public static void doMod1() {
    System.out.println("Enter your name");
    Scanner scan = new Scanner(System.in); 
    String usersName = scan.nextLine(); 
    scan.close(); 
              
    // Greeting to User 
    System.out.println("Hello " + usersName);
    textWelcome();
            
  }
  
  public static void textWelcome() {
    System.out.println("Module 1");
    System.out.println("Hello, World.");
    System.out.println("Hello, Java."); 
  }    
}     

