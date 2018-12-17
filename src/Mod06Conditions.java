import java.util.Scanner;

/**
 * @author jeane
 *
 */
public class Mod06Conditions {
  public static void ifElse() {
    System.out.println("Module 6" + "\n");
        
    System.out.println("Enter a number to determine if it is weird or not");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    scan.close();
    if (n % 2 == 1) {
      System.out.println("Weird");
    } else {
      if (n >= 2 && n <= 5) {
        System.out.println("Not Weird");
      } else if (n >= 6 && n <= 20) {
        System.out.println("Weird");
      } else {
        System.out.println("Not Weird");
      }
    }
  }
    
  public static void ternaryOp() {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    scan.close();
        
    System.out.println(n % 2 == 1 || n > 5 && n <= 20 ? "Weird" : "Not Weird");
  }
    
  public static void switchStatement() {

    int month = 8;
    String monthString;
    switch (month) {
      case 1:  monthString = "January";
      break;
      case 2:  monthString = "February";
      break;
      case 3:  monthString = "March";
      break;
      case 4:  monthString = "April";
      break;
      case 5:  monthString = "May";
      break;
      case 6:  monthString = "June";
      break;
      case 7:  monthString = "July";
      break;
      case 8:  monthString = "August";
      break;
      case 9:  monthString = "September";
      break;
      case 10: monthString = "October";
      break;
      case 11: monthString = "November";
      break;
      case 12: monthString = "December";
      break;
      default: monthString = "Invalid month";
      break;
    }
    System.out.println(monthString);
  } 
    
    public static void incrementOp() {
    int pizza = 8;
    int money = 10;
    int water = 5;
        
    pizza = pizza - 2;
    money += 5;
    
    System.out.println(++water);
    System.out.println(--pizza);
    System.out.println(money);
  }
    
    public static void compareStrings() {
    String s1 = "Hello";
    String s2 = "World";
    String s3 = "Hello";
     
    //.compareTo   
    System.out.println(s1.compareTo(s3)); //output will be 0 
    System.out.println(s1.compareTo(s2)); //output will be >0

    //.equals   
    System.out.println(s1.equals(s3)); //output will be true
    System.out.println(s1.equals(s2)); //output will be false
       
    /* The relational operator == compares a string's location
     * in memory and not the actual contents of the string
     */
  }
}
/* Operator precedence refers to the operators that are evaluated 
 * or prioritized over others
 */
