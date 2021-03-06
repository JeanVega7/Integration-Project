
/**
 * Looping Pizza statements.
 * @author jeane
 *
 */
public class Mod07Looping {
  
  /**
   * Simple counting from 1 to 4.  
   */
  public static void whileLoop() {
    System.out.println("Module 7" + "\n");
        
    int count = 1;
    while (count < 5) {
      System.out.println("Count is: " + count);
      count++;
    }  
  }
  
  
  /**
   * Process of eating pizza and telling people about it.
   */
  public static void forLoop() {
    for (int slicesPizza = 0; slicesPizza < 9; slicesPizza++) {
      if (slicesPizza == 6) {
        System.out.println("Sorry I ate two slices");
        continue;
        /*
        * Continues are useful to skip an iteration
        * of the loop without terminating it
        */                
      }
      System.out.println("I have eaten " + slicesPizza + " slices of pizza");
    }
  }
  
  /**
   * Telling people how many slices of pizza are left.
   */
  public static void doWhile() {
    int pizzaSlices = 8;
    do {
      System.out.println("There are " + pizzaSlices + " slices of pizza left");
      pizzaSlices--;
      if (pizzaSlices == 3) {
        System.out.println("You can eat the rest of the pizza");
        break;
        /*
        * Breaks are useful to terminate a loop early
        * when a certain condition is met
        */
      }
    } while (pizzaSlices > 0);
  }
}
