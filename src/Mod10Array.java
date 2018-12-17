import java.util.ArrayList;

/**
 * One-dimensional and two-dimensional arrays searched through loops
 * and iteration.
 * @author jeane
 *
 */
public class Mod10Array {
    
  /**
   * Calculate minimum value and sum of the values
   * in the array.
   */
  public static void oneArray() {
    System.out.println("Module 10" + "\n");
        
    System.out.println("One-Dimensional Array: {10, 1, 3, 6, 7}");
    int[] minSum = {10, 1, 3, 6, 7};
        
    //Find minimum value
    int min = minSum[0];
    for (int i = 0; i < 5; i++) {
      if (minSum[i] < min) {
        min = minSum[i];
      }
    }
    System.out.println("The minimum value in the array is: " + min);
        
    //Sum of values
    int sum = 0;
    for (int x: minSum) {
      sum += x;
    }
    System.out.println("The sum of all the values in the array is: " + sum);
        
    //Search Array and identify index
    for (int i = 0; i < 5; i++) {
      System.out.println("The value " + minSum[i] + " is located at index " + i);
    }
        
  }
  
  /**
   * Two-dimensional Array used to find coordinates of its values.
   */
  public static void twoArray() {
    System.out.println("Two-Dimensional Array:  {1,1,5},\r\n" 
            + " {9,3,5} ");
    int[][] twoDimensional = {
            {1,1,5},
            {9,3,5}
    };
        
    //Search 2d array and identify coordinates of found value
    for (int row = 0; row < twoDimensional.length; row++) {
      for (int col = 0; col < twoDimensional[row].length; col++) {
        System.out.println("The value " + twoDimensional[row][col] 
                        + " is in row " + row + " and column " + col);
      }
    }
  }
  
  /**
   * ArrayList of names being added and removed using the properties
   * of the ArrayList.
   */
  public static void arrList() {
    ArrayList<String> names;
    names = new ArrayList<String>();
        
    names.add("Jean");
    names.add("Zach");
    names.add("Matt");
    names.add("Cassie");
    names.add(2, "Ryan");
      
    String str = names.get(0);
    System.out.println(str);
    names.remove(0);
    names.remove(names.size() - 1);
    names.remove("Zach");
      
    System.out.println(names);
       
        
        
  }
}
