public class Operators{
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    int num3 = 2;
    int num4 = 9;

    // Different type of arthemetic Operators
    System.out.println(num1+num2); // Addition +
    System.out.println(num2-num1); // Subtraction
    System.out.println(num2/num1); // Division
    System.out.println(num2%num4); // Modulous/Remainder
    System.out.println(num3*num2); // Multiplication
    System.out.println(num4++);    // Increment
    System.out.println(num1--);    // Decrement

    // Java Assignment Operators
    num4 += 5;                // same as x = 5
    System.out.println(num4);
    num4 -= 5;
    System.out.println(num4);
    num4 *= 5;
    System.out.println(num4);
    num2 /= 5;
    System.out.println(num2);
    num4 %= 6;
    System.out.println(num4);
    num4 >>= 1;             // same as x >> 5
    System.out.println(num4);

    // Java Comparison Operators
    System.out.println(num4 > num1);    // greater than
    System.out.println(num2 < num1);    // less than
    System.out.println(num4 != num1);   // not euqal to
    System.out.println(num1 == num4);   // equal to
    System.out.println(num4<=num1);     // less than or euqal to
    System.out.println(num4>=num1);     // greater than equal to

  }
}
