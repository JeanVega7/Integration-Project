import java.util.Scanner;

/**
 * 
 */

/**
 * @author jcvega5237
 *
 */
public class Mod01Hello {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); 
            String usersName = scan.nextLine(); 
            scan.close(); 
              
            // Greeting to User 
            System.out.println("Hello " + usersName);
            Welcome();
            
          }
    public static void Welcome() {
        System.out.println("Module 1");
        System.out.println("Hello, World.");
        System.out.println("Hello, Java."); 
    }    
}     

