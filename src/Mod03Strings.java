import java.util.Scanner;

/**
 * The program asks for two names, determines which comes first
 * alphabetically, then capitalizes the first letter of both.
 * @author jeane
 *
 */
public class Mod03Strings {
    
  /**
   * Since the scanner asks for string the program technically still runs on numbers.
   */
  public static void stringsIntro() {
    System.out.println("Module 3" + "\n");
        
    System.out.println("Enter the name of two animals in lower case");
        
    Scanner scan = new Scanner(System.in);
    String animalName = scan.next();
    String secondAnimal = scan.next();
     
    scan.close();
        
    
    //.length counts the number of characters in a string
    System.out.println("The first animal's name is " + animalName.length() + " letters long");
    System.out.println("The second animal's name is " + secondAnimal.length() + " letters long");
        
    System.out.println("Does the name of the first animal appear "
            + "before the second animal in alphabetical order?");
        
    //.compareTo compares strings to find alphabetical order
    int charNum = animalName.compareTo(secondAnimal);
    if (charNum > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
        
    //.substring addresses a specific portion of the String 
    //.toUpperCase changes characters to an upper case
    // The \n escape sequence inserts another line
    String firstCap = animalName.substring(0,1).toUpperCase() + animalName.substring(1);
    String secondCap = secondAnimal.substring(0,1).toUpperCase() + secondAnimal.substring(1);
    System.out.print("The first animal is the " + firstCap + ".\n" 
                + "The second animal is the " + secondCap + ".");
        
  }
  
  
  /**
   * small example of casting from int to byte.
   */
  public static void castingEx() {
    // casting changes data from one data type to another
    int num1 = 53;
    int num2 = 47;
    byte num3;
    num3 = (byte)(num1 + num2);
    System.out.println(num3);
  }
}
