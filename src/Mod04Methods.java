import java.util.Scanner;

/**
 * Calculates the square and cube of a number.
 * @author jeane
 *
 */
public class Mod04Methods {
  
  /**
   * exception catches use of string inside the calculation.
   */
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

  /* In Square(integer), Square() would be considered the method call
  * while (integer) would be the argument
  */
  /**
   * SquareRoot calculation.
   * @param sq integer received would be multiplied by itself
   * @return the squareRoot of the number
   */
  public static Double square(double sq) {
        
    Double squareRoot = sq * sq;
    return squareRoot;
  }
  
  /**
   * CubeRoot calculation.
   * @param cu integer multiplied by itself two times
   * @return the cubeRoot of the number
   */
  public static Double cube(double cu) {
        
    Double cubeRoot = cu * cu * cu;
    return cubeRoot;
  }

}
