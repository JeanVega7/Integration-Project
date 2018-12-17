
public class Mod07Looping {
    public static void whileLoop() {
        int count = 1;
        while(count < 5) {
            System.out.println("Count is: " + count);
            count++;
        }  
    }
    public static void forLoop() {
        for(int slicesPizza = 0; slicesPizza < 9; slicesPizza++) {
            System.out.println("I have eaten " + slicesPizza + "slices of pizza");
        }
    }
    public static void doWhile() {
        int pizzaSlices = 8;
        do {
            System.out.println("There are " + pizzaSlices + " slices of pizza left");
            pizzaSlices--;
            if(pizzaSlices == 6) {
                System.out.println("Sorry I dropped one of the pizzas");
                continue;
                /*
                 * Continues are useful to skip an iteration
                 * of the loop without terminating it
                 */
            }
            if(pizzaSlices == 3) {
                System.out.println("You can eat the rest of the pizza");
                break;
                /*
                 * Breaks are useful to terminate a loop early
                 * when a certain condition is met
                 */
            }
        } while(pizzaSlices > 0);
    }
}
