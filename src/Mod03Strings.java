import java.util.Scanner;

public class Mod03Strings {
    public static void stringsIntro() {
        
        System.out.println("Enter the name of two animals in lower case");
        
        Scanner scan = new Scanner(System.in);
        String AnimalName = scan.next();
        String SecondAnimal = scan.next();
        
        scan.close();
        
        //.length counts the number of characters in a string
        System.out.println("The first animal's name is "+ AnimalName.length() + " letters long");
        System.out.println("The second animal's name is "+ SecondAnimal.length() + " letters long");
        
        System.out.println("Does the name of the first animal appear before the second animal in alphabetical order?");
        
        //.compareTo compares strings to find alphabetical order
        int charNum = AnimalName.compareTo(SecondAnimal);
        if(charNum>0){
             System.out.println("Yes");
        } else{
             System.out.println("No");
        }
        
        //.substring addresses a specific portion of the String 
        //.toUpperCase changes characters to an upper case
        // The \n escape sequence inserts another line
        String firstCap = AnimalName.substring(0,1).toUpperCase()+AnimalName.substring(1);
        String secondCap = SecondAnimal.substring(0,1).toUpperCase()+SecondAnimal.substring(1);;
        System.out.print("The first animal is the " + firstCap + ".\n" 
                + "The second animal is the " + secondCap + ".");
        
    }
    
    public static void castingEx() {
        // casting changes data from one data type to another
        int num1 = 53;
        int num2 = 47;
        byte num3;
        num3 = (byte)(num1 + num2);
        System.out.println(num3);
    }
}
