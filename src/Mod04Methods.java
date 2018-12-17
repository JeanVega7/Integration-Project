import java.util.Scanner;

/**
 * @author jeane
 *
 */
public class Mod04Methods {
  public static void doMod04() {
    System.out.println("Module 4" + "\n");
        
    System.out.println("Provide a number to calculate the square and cube of it");
        
    Scanner scan = new Scanner(System.in);
    System.out.print("Print integer: ");
    Double integer = scan.nextDouble();
        
    scan.close();
        
    /* In Square(integer), Square() would be considered the method call
    * while (integer) would be the argument
    */
    System.out.println("Square: " + square(integer) + "\nCube: " + cube(integer));
  }
    
    /* In public static Double Square(double sq),
     * public static Double Square() would be the header while
     * double sq is the parameter
     */
    public static Double square(double sq) {
        
    Double squareRoot = sq * sq;
    return squareRoot;
  }
    public static Double cube(double cu) {
        
    Double cubeRoot = cu * cu * cu;
    return cubeRoot;
  }

}
