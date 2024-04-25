public class Printf {
  public static void main(String[] args) {

    // printf - stands for print format 
    // Syntax - System.out.printf(String format, Object... args);
    //
    // Format Specifiers starts with %
    // %d - Decimal integer
    // %f - Floating-point number
    // %s - String
    // %n - Newline
    //
    String name = "Alice";
    int messages = 5;

    System.out.printf("Hello %s! You have %d new messages.%n%n", name, messages);

    System.out.printf("|Name: %10s |%n|Age: %3d|%n|Height: %.2f|%n", name, 2995, 6.756);
    // %10s = Min 10 Char padded with space for the String
    // %3s = Min 3 Char padded for the integer
    // %.2f = A floating-point number formatted to 2 decimal places
    
    System.out.printf("%n%-10s%03d%n", " Page:", 2);
    // %-10s = output should be left justified
    // %03d = output will be padding with 3 spaces to ensure if the char is not 3 char winde then 2 extra 00 are automatically appended into it 
    // d stands for deciman converter 
    
    // Changing color of text
    int number = -5;
    System.out.printf("%s%d%n", (number >= 0 ? "\u001B[32m" : "\u001B[31m"), number);

    // Other use cases
    // Create Tables using printf padding method 
    // Create Progress Bars
    // Create Progress Bars
    int total = 100;
    for (int done = 0; done <= total; done += 1) {  // Increment 'done' by 5 on each iteration
        int percentage = done * 100 / total;        // Recalculate percentage on each iteration
        System.out.printf("Progress: [%-20s] %d%%%n", "=".repeat(done / 5), percentage);
        // Optionally, add a delay to visually see the progress increase
        try {
            Thread.sleep(100); // 100 milliseconds delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 
  }
}
