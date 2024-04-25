public class JavaCodingConventions{
  public static void main(String[] args){
  // This is a comment in java

  /* This is a mullti-line or 
   * block comment in java **/

  System.out.print("\nCheck the contents of the file to understand");
  System.out.println("Java comments, naming conventions, and code formatting.");


  // This below is a multiline string
  String javaCodingConventions = """
  Classes and Interfaces: CustomerManager uses PascalCase.

  1. Methods and Variables: Methods like calculateArea() and variables like customerName use camelCase.
  2. Constants: MAX_VALUE is in all uppercase letters separated by underscores.
  3. Packages: com.mycompany.myapp uses lowercase words separated by dots.
  4. Indentation: The code uses 4 spaces for indentation.
  5. Line Length: Code lines are kept within an 80-100 character limit.
  6. Spacing and Blank Lines: Spaces around operators, after commas, and blank lines between method definitions to improve readability.
  """;

  System.out.println(javaCodingConventions);


  }
}
