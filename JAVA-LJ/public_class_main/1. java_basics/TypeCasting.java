public class TypeCasting{
  public static void main(String[] args){

    // Widening Casting (automatically) - converting a smaller type to a larger size data type
    // byte -> short -> char -> int -> long -> float -> double
    int x = 6969;
    float y = x; // Casting int x to a float y
    
    System.out.println(x);
    System.out.println(y);


    // Narrowing Casting (manually) - converting a bigger type to a smaller size data type 
    // double -> float -> long -> int -> char -> short -> byte

    double xx = 69.69696969d;
    int yy = (int) xx; // Manual casting from doubleto int

    System.out.println(xx);
    System.out.println(yy);
  }
}
