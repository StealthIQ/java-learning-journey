import java.util.Scanner;

public class if_else{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // Make a program to predict the class of a student based on their age
    System.out.print("Enter your age:");
    int age = scanner.nextInt(); 

    if(age > 18){
      System.out.println("Not eligible");
    }
    else if(age <= 18 && age > 6){
      System.out.println("Now lets see what grade you?");
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    else{
      System.out.println("Your a kid");
    }
    
    switch (age) {
      case 18:
        System.out.println("Your in 12th Grade");
        break;
      case 17:
        System.out.println("Your in 11th Grade");
        break;
      case 16:
        System.out.println("Your in 10th Grade");
        break;
      case 15:
        System.out.println("Your in 9th Grade");
        break;
      case 14:
        System.out.println("Your in 8th Grade");
        break;
      case 13:
        System.out.println("Your in 7th Grade");
        break;
      case 12:
        System.out.println("Your in 6th Grade");
        break;
      case 11:
        System.out.println("Your in 5th Grade");
        break;
      case 10:
        System.out.println("Your in 4th Grade");
        break;
      case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
        System.out.println("You are below 4th Grade");
        break;
      default:
        System.out.println("Your grade cannot be determined");
    }
  }
}
