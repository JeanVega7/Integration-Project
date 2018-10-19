import java.util.Scanner;

/**
 * 
 */

/**
 * @author jcvega5237
 *
 */
public class Mod01Hello {

        public static void Welcome() {
            System.out.println("Module 1");
            System.out.println("Hello, World.");
            System.out.println("Hello, Java.");    
        }
 //The following are the exercises from Hackerrank Module 1
        public static void main(String[] args) {
            // Create a Scanner object to read input from stdin.
            Scanner scan = new Scanner(System.in); 
            
            // Read a full line of input from stdin and save it to our variable, inputString.
            String usersName = scan.nextLine(); 

            // Close the scanner object, because we've finished reading 
                // all of the input from stdin needed for this challenge.
            scan.close(); 
              
            // Print a string literal saying "Hello, World." to stdout.
            System.out.println("Hello " + usersName);             
          }
        
        static int solveMeFirst(int a, int b) {
            return a+b;
        }
        public static void main1(String[] args) {
              Scanner in = new Scanner(System.in);
              int a;
              a = in.nextInt();
              int b;
              b = in.nextInt();
              int sum;
              sum = solveMeFirst(a, b);
              System.out.println(sum);
        }
       
       public static void  main11(String[] args) {
           Scanner scan = new Scanner(System.in);
           int a = scan.nextInt();
           int b = scan.nextInt();
           int c = scan.nextInt();
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
       }
       
}     

