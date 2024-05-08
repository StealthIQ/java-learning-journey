import java.util.Scanner;

public class UserInput{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Whats your name son: ");
    String name = scanner.nextLine();

    System.out.print("Whats you age son: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // To continue with the next question else it skips it cuz 
                        // scanner.nextInt(); and scanner.next(); both have /n after em

    System.out.print("Whats is your head size son: ");
    String headSize = scanner.nextLine();

    System.out.print("\033c");

    System.out.println("Ahh! So your name is " + name);
    System.out.println("I see, your " + age);
    System.out.println("So your head is only " + headSize + " So.... Sad :(((");
  }
}
