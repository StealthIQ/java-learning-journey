import java.util.ArrayList;
import java.util.List;

public class ForLoop{
  // private = can only be accessed inside a public class ForLoop or public means can be accessed outside a class
  // static = belongs to class itself
  // final = cannot be changed non mutable
  private static final int MS_SEC = 1000;

  public static void main(String[] args){

    // Created a list with all the functions (made sure that its runnable) - lambda expression
    List<Runnable> functionList = new ArrayList<>();
    functionList.add(() -> Square(5));
    functionList.add(() -> HalfPyramid(5));
    functionList.add(() -> ReversePyramid(5));
    functionList.add(() -> RightSidedPyramid(5));
    functionList.add(() -> FullPyramid(5));

    executeOneByOne(functionList, 5);
  }

  // Function to execute the arralist of function one by one 
  static void executeOneByOne(List<Runnable> functionList, int n) {
    for (Runnable function : functionList){
      sleep();
      System.out.println("Executing a new pattern:");
      function.run(); // .run dosent support parameters - had to remove em
    }
  }

  // Function sleep
  static void sleep(){
    try {
      Thread.sleep(MS_SEC);
    } 
    catch (Exception e){
      System.out.println(e);
    }
  }   
  // Function square
  static void Square(int row){
    for (int i = 1; i <= row-1; i++){
      for (int j = 1; j <= row; j++) {
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }

  // Function half pyramid
  static void HalfPyramid(int row){
    for (int i = 1; i <= row; i++){
      for (int j = 1; j <= i; j++){
        System.out.print("* "); 
      }
    System.out.println();
    }
  }

  // Function for reverse pyramid
  static void ReversePyramid(int row){
    for (int i = 1; i <= row; i++){
      for (int j = i; j <= row; j++){
        System.out.print("* ");
      }
    System.out.println();
    }
  }

  static void RightSidedPyramid(int row) {
      for (int i = 1; i <= row; i++) {
          for (int j = 1; j <= row - i; j++) {
              System.out.print(" ");
          }
          for (int k = 1; k <= i; k++) {
              System.out.print("*");
          }
          System.out.println();
      }
  }

  static void FullPyramid(int row) {
      for (int i = 1; i <= row; i++) {
          for (int j = 1; j <= row - i; j++) {
              System.out.print(" ");
          }
          for (int k = 1; k <= i; k++) {
              System.out.print("* "); // Add a space to the right sided pyrimid and you have full pyramid
          }
          System.out.println();
      }
  }
}
