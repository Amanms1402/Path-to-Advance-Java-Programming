abstract class Main {
    public String fname = "Aman Kumar Singh";
    public int age = 21;
    public abstract void study(); // abstract method
  }
  
  // Subclass (inherit from Main)
  class Student extends Main {
    public int graduationYear = 2025;
    public void study() { // the body of the abstract method is provided here
      System.out.println("Studying all day long");
    }
  }