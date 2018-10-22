import java.util.Scanner;

public class Mod04Methods {
    public static void doMod04() {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Print integer: ");
        Double integer = scan.nextDouble();
        
        scan.close();
        
        /* In Square(integer), Square() would be considered the method call
         * while (integer) would be the argument
         */
        System.out.println("Square: "+ Square(integer)+ "\nCube: "+ Cube(integer));
    }
    
    /* In public static Double Square(double sq),
     * public static Double Square() would be the header while
     * double sq is the parameter
     */
    public static Double Square(double sq) {
        
        Double SquareRoot = sq * sq;
        return SquareRoot;
    }
    public static Double Cube(double cu) {
        
        Double CubeRoot = cu * cu * cu;
        return CubeRoot;
    }

}
