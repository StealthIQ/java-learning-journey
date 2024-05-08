import java.util.Scanner;

public class arrays{
  public static void main(String[] args){
    // Clears screen
    System.out.println("\033c");
    Scanner scanner = new Scanner(System.in);

    // arrays 
    String[] fruits = {"apple", "grapes", "orange", "banana"};
    int[] fruits_packs = {34, 45, 67, 21, 132, 3455, 99999, 8};

    // multidimentional arrays 
    String[][] veggies = {{"Like", "Dont"}, {"Tomatos", "Brocoli", "Carrot", "Cucumber"}};

    System.out.println(veggies[0][1]);

    // Lists out the fruits and their index
    System.out.println("The number of fruits with index are\n");
    for (int n = 0; n <= fruits.length; n++){
      if (n <= 3){
        System.out.println(fruits[n] + ":" + n);
    }
    else{
      break;
    }
    }
    
    // checks with do loop while asking the user for the pack number again if the users values are not valid
    int num;
    do {
      System.out.print("Enter the fruit pack number (0-" + fruits_packs.length + ") : ");
      num = scanner.nextInt();
    } while (num > fruits_packs.length || num < 0);

    System.out.println(fruits_packs[num]);
  }
}
