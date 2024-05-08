import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class FilesOps {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Name of the file you wanna create: ");
    String File_Name = scanner.nextLine();

    CreateFile(File_Name);

    // Asks the user if he wishes to delete the file now 
    System.out.print("Would you like to delete the file now (y/n) :");
    String options = scanner.nextLine();

    // Takes use input to decide weather to do an action or not 
    if (options.equals("y") || options.equals("Y")){
      DeleteFile(File_Name);
    } else if (options.equals("n") || options.equals("N")){
      System.out.println("File has not been deleted.");

      // Asks the user what to write on the file 
      System.out.print("Would you like to write to the file (y/n) ? ");
      String option_write = scanner.nextLine();
      if (option_write.toUpperCase().equals("Y")){
        System.out.print("Enter the content you would like to write: ");
        String File_Content = scanner.nextLine();
        WriteFile(File_Name, File_Content);
        ReadFile(File_Name);
      } else if ( option_write.toLowerCase().equals("n")){
        System.out.println("You didnt write to the file");
      } else {
        System.out.println("Unknown Option");
      }
    } else {
      System.out.println("Unknown option choosen");
    }

    scanner.close();
    }
    
    // Create File function
    static void CreateFile(String File_Name) {
        File file = new File(File_Name);
        try {
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());            
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
    }
  }

    // Delete File function
    static void DeleteFile(String File_Name) {
      File file = new File(File_Name);

      try {
          if (file.delete()){
            System.out.println("File " + file.getName() + "has been deleted successfully.");
          } else {
            System.out.println("File deletion unsuccessfull");
          }    
      } catch (Exception e){
        System.out.println("Error Occured"+ e);
      }
    }

  // Write File
  static void WriteFile(String File_Name, String File_Content){
    try {
      FileWriter myWriter = new FileWriter(File_Name);
      myWriter.write(File_Content);
      myWriter.close();
    } catch (IOException e) {
      System.out.println("Error Occured");
      e.printStackTrace();
    }
  }

  // Read FIle 
  static void ReadFile(String File_Name){
    try {
      File myFile = new File(File_Name);
      Scanner myFileReader = new Scanner(myFile);

      while (myFileReader.hasNextLine()){
        String data = myFileReader.nextLine();
        System.out.println(data);
      }
      myFileReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error Occured");
      e.printStackTrace();
    }
  }
}
