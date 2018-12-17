import java.util.InputMismatchException;
import java.util.Scanner;
// Jean Vega

/* I want the program to be a quiz game
 * for anyone to use in preparation for the
 * Certification Exam
 */

class Main {
  /**
   *  Main is used as a menu
   * towards the rest of the modules.
   * @param args 
   *
   */
  public static void main(String[] args) {
    System.out.println("Make a Number Selection from the Modules below");
    // Module list
    System.out.println("1. Hello World");
    System.out.println("2. Elements");
    System.out.println("3. Strings");
    System.out.println("4. Methods");
    System.out.println("5. Library Classes");
    System.out.println("6. Conditions");
    System.out.println("7. Looping");
    System.out.println("8. Classes");
    System.out.println("9. Classes continued");
    System.out.println("10. Arrays");
    System.out.println("11. Exceptions");
    System.out.println("13. Quality");
        
    try {
      int selection;

      // Create a scanner
      Scanner scan = new Scanner(System.in);
        
      selection = scan.nextInt();

      switch (selection) {
        case 1:
          Mod01Hello.doMod1(); // Hello World
          break;
        case 2:
          Mod02Elements.doMod2(); // Classes, Data Types, Variables
          break;
        case 3:
          Mod03Strings.stringsIntro(); // Strings, Casting, Input
          break;
        case 4:
          Mod04Methods.doMod04(); // Classes and Methods
          break;
        case 5:
          Mod05Library.randomGen();
          Mod05Library.pizzaSlice(); // Library Classes
          break;
        case 6:
          Mod06Conditions.ifElse(); // Operators, Condition Statements and Branching
          break;
        case 7:
          Mod07Looping.doWhile(); // Loops
          Mod07Looping.forLoop();
          Mod07Looping.whileLoop();
          break;
        case 9:
          Mod09Classes2.superInherit(); // Inheritance and Polymorphism
          Mod09Classes2.polyClass();
          break;
        case 10:
          Mod10Array.oneArray();  // Arrays and ArrayLists
          Mod10Array.twoArray();
          Mod10Array.arrList();
          break;
        case 11:
          // Exception Handling
          break;
        default:
          System.out.println("Invalid selection");

      }
      scan.close();
    } catch (InputMismatchException ex) {
      System.out.println("ERROR: Requires an integer");
    }  
  }   
}
    
    


