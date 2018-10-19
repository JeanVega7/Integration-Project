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
        public static void Day0() {
            // Create a Scanner object to read input from stdin.
            Scanner scan = new Scanner(System.in); 
            
            // Read a full line of input from stdin and save it to our variable, inputString.
            String inputString = scan.nextLine(); 

            // Close the scanner object, because we've finished reading 
                // all of the input from stdin needed for this challenge.
            scan.close(); 
              
            // Print a string literal saying "Hello, World." to stdout.
            System.out.println("Hello, World.");
            System.out.println(inputString);
              
          }
        static int solveMeFirst(int a, int b) {
            return a+b;
        }

       public static void solveFirst() {
              Scanner in = new Scanner(System.in);
              int a;
              a = in.nextInt();
              int b;
              b = in.nextInt();
              int sum;
              sum = solveMeFirst(a, b);
              System.out.println(sum);
        }
       public static void javaStdin() {
           Scanner scan = new Scanner(System.in);
           int a = scan.nextInt();
           int b = scan.nextInt();
           int c = scan.nextInt();
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
       }
       
}     

