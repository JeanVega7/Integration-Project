import java.util.Random;
import java.util.Scanner;

public class Mod05Library {
    public static void randomGen() {
     //simulate lotto drawing of 6 random numbers   
        Random r = new Random();
        System.out.println(r.nextInt(53)+1);
        System.out.println(r.nextInt(53)+1);
        System.out.println(r.nextInt(53)+1);
        System.out.println(r.nextInt(53)+1);
        System.out.println(r.nextInt(53)+1);
        System.out.println(r.nextInt(53)+1);
    }
    
    public static void pizzaSlice() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tell me the size of your slice and I will tell"); 
        System.out.println("you which is larger, the number entered, or PI");
        
        double slice = scan.nextDouble();
        scan.close();
        
        System.out.println(Math.max(slice,Math.PI));
    }

}
