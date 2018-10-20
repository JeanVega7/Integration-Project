import java.util.Scanner;

public class Mod02Elements {
    public static void doMod2() {
        
        int i = 4;
        double d = 4.0;
        String s = "Hackerrank";
        
        Scanner scan = new Scanner(System.in); 
        
        int i2;
        double d2;
        String s2;

        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        s2 = scan.nextLine();
        s2 = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);
        
        scan.close();
        
        System.out.println("There are 8 primitive data types: byte, short, int, long, float, double, "
                + "boolean, and char");
        }
    
    public static void javaStdin() {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
