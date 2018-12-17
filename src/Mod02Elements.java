import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Prompt asks for two integers and a string.
 * @author jeane
 */
public class Mod02Elements {
  
  /**
   * The first numerical value is assessed to be or not to be my favorite number.
   * There is also a an exception catch to prevent string input for the integer
   */
  public static void doMod2() {
    System.out.println("Module 2" + "\n");
        
    System.out.println("Can You Guess My Favorite Number?");
    System.out.println("Enter a numerical value to find out determine your total money");
    System.out.println("Give me a last name");
        
    int favoriteNum = 7;
    final double cashMoney = 4.0;
    final String firstName = "Jean "; //final means that the value cannot be changed
       
    Scanner scan = new Scanner(System.in); 
        
    int secondFavorite;
    double bankMoney;
    String lastName;

    try {
      secondFavorite = scan.nextInt();
      bankMoney = scan.nextDouble();
      lastName = scan.next(); 

      scan.close();
    
      System.out.println("You guessed " + secondFavorite);
      System.out.println("You have $" + (cashMoney + bankMoney));
      System.out.println("My name is " + (firstName + lastName));  
    
      if (secondFavorite == 7) {
        System.out.println("My favorite number is: " + favoriteNum);
      } else {
        System.out.println("That is not my favorite number");
      }
    } catch (InputMismatchException ex) {
      System.out.println("ERROR: First two inputs should be integers");
    }  
        
    /* byte can store 8 bit integers, short 16 bit, int 32 bit, and long 64 bit integers 
    *  boolean holds true or false values and char holds a single character
    *  float stores 32 bit floating point numbers and double stores 64 bit floating numbers
    */
    System.out.println("There are 8 primitive data types: byte, short, int, long, "
         + "float, double, boolean, and char");
    System.out.println("A variable is a location in memory and "
                + "Scope means variables are only available in the method they are in ");
  }
}
