import java.util.Scanner;

// Jean Vega

/* I want the program to be a quiz game
 * for anyone to use in preparation for the
 * Certification Exam
 */

class Main {
    public static void main(String[] args) {
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
        
    
        Scanner scan = new Scanner(System.in);
        CollegeClass cop2006201808 = new CollegeClass();
        SLClass myClass = new SLClass();
        myClass.printInfo();
        scan.close();
        
        }
    }
    
    


