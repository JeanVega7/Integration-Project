
public class CollegeClass {

  //fields
  private String name;
  private int credits;
  private String[] roster;
    
  //methods
    
  //constructors
  public CollegeClass() {
    name = "not set";
    credits = 0;
    roster = new String[60];        
  }
    
  //overloaded
  public CollegeClass(String name, int credits, String[] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;
  }
    
  //accessors
  public String getName() {
    return name;
  }
    
  //mutator
  public void setName(String name) {
    //field name = parameter name
    this.name = name;
  }
    
  public void printInfo() {
    System.out.println("College Class");
  }
}
