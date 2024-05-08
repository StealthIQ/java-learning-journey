public class StringMethods{
  public static void main(String[] args){
    String name = "jake";
    String gender = "MALE";
    String greet = "Hello! How are you?";
    String numbers = "1234567890";

    // String Length
    System.out.println("Length of the string (numbers) is" + numbers.length());
    System.out.println("length of the string (greet) is"+ greet.length());

    // Uppercase a string 
    System.out.println(name.toUpperCase());
    // Lowercase a string
    System.out.println(gender.toLowerCase());

    // Finding a character in a string 
    System.out.println(greet.indexOf("you")); // Java counts index from 0

  }
}
