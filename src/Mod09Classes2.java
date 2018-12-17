
/**
 * @author jeane
 *
 */
public class Mod09Classes2 {
    
    public static void superInherit() {
        System.out.println("Module 9" + "\n");
        
       abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
        abstract void display();
        
    }
        class MyBook extends Book {
            int  price;  
            public MyBook(String title, String author,int price) {
                super(title,author);
                this.price = price;
        }
        public void display() { 
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);               
        }
        }
       /*
        * Some of the benefits of inheritance include
        * ease of field or method alteration as well as 
        * reuse for easier writing of code
        */
    }
   public static void polyClass() {
        Animal[] thelist = new Animal[2];
        Dog d = new Dog();
        Cat c = new Cat();
        
        thelist[0] = d;
        thelist[1] = c;
        
        for(Animal x: thelist) {
            x.noise();
        }
    }
}
