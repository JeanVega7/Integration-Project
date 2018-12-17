import java.util.Random;
import java.util.Scanner;

/**
 * Use of Random and Math class.
 * @author jeane
 *
 */
public class Mod05Library {
    
  /**
   * Random generation of six numbers to simulate lottery. 
   */
  public static void randomGen() {
    System.out.println("Module 5" + "\n");
        
    //simulate lotto drawing of 6 random numbers
    System.out.println("LOTTO: 6 RANDOMLY GENERATED NUMBERS");
    Random r = new Random();
    System.out.println(r.nextInt(53) + 1);
    System.out.println(r.nextInt(53) + 1);
    System.out.println(r.nextInt(53) + 1);
    System.out.println(r.nextInt(53) + 1);
    System.out.println(r.nextInt(53) + 1);
    System.out.println(r.nextInt(53) + 1);
  }
    
  /**
   * Calculates whether the integer is larger than the mathematical
   * constant PI using the Math class.
   */
  public static void pizzaSlice() {
        
    Scanner scan = new Scanner(System.in);
        
    System.out.println("Tell me the size of your slice and I will tell"); 
    System.out.println("you which is larger, the number entered, or PI");
        
    double slice = scan.nextDouble();
    scan.close();
        
    System.out.println(Math.max(slice,Math.PI));
  }

}
