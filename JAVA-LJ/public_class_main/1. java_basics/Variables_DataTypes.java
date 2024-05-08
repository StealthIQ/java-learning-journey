public class Variables_DataTypes{
  public static void main(String[] args) {

    System.out.print("\033c"); // clears terminal

    System.out.println("++ Lets learn variables in JAVA ++");
    String whats_variable = """
    int x; // declaration
    x = 10; // assignment
    int y = 20; // both dec + assign = initiliazation
                """;
                  
    System.out.println(whats_variable);

    // Types of variables (primitive)
    boolean adult = true; // size = 1 bit
    byte age = 19;         // size = 1 byte
    short bicepSize = 40;
    int income = 99999999;
    long wonBuisnesses = 9999999999999L;
    float ppSize = 0.111111f;
    double ballSize = 2.000000000000000000;
    char favCharacter = 'x';
    String name = "Joel"; // reference

    // System.out.print("\033c");
    // This is Java tables made using printf %-14s stands for the lines that should be left in that colum and later the values are assigned
    System.out.println("----------------------------------------------------------------");
    System.out.println("|                    Java Variable Types                       |");
    System.out.println("----------------------------------------------------------------");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "  Data Type", " Size", " prim/ref", "      Value");
    System.out.println("----------------------------------------------------------------");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "boolean", "1 bit", "primitive", "true or false");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "byte", "1 byte", "primitive", "-128 to 128");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "int", "4 bytes", "primitive", "-2bil to 2bil");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "long", "8 bytes", "primitive", "-9quin - 9quin 'L'");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "short", "2 bytes", "primitive", "-32,768 to 32,768");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "float", "4 bytes", "primitive", "ex. 3.141592f");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "double", "8 bytes", "primitive", "ex. 3.141592653589");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "char", "2 bytes", "primitive", "ex. 'x'");
    System.out.printf("| %-14s | %-9s | %-10s | %-18s | %n", "String", "varies", "referance", "ex. 'Hello world'");
    System.out.println("----------------------------------------------------------------\n");
    

    // System.out.print("\033c"); // clear screen
    System.out.println("+ This is a real example of all the above variable types");
    //
    System.out.println("\nMy friend's name is " + name + 
        "\nDisclaimer: he is an adult = " + adult +
        "\nHe is known for his impressive measurements: pp to ball size ratio, which is " + ppSize + " millimeters and " + ballSize + " feet respectively." +
        "\nBut he is only " + age + " years old." +
        "\nHe earns an annual income of " + income + " LHK." +
        "\nDespite having faced challenges, he has persisted with numerous ventures, totaling " + wonBuisnesses + " successes." +
        "\nDue to his unique proportions, his right bicep measures " + bicepSize + " centimeters." +
        "\nHe is very much into the character '" + favCharacter + "'."
    );
    
    String swap_variable = """

    // Today we are learning how to swap variables with one another
    String x = "water";
    String y = "orange juice";


    String temp; // Assigned a temp value 

    temp = x; // Assigned temp to x which is water 
    x = y; // Now that x is free we assigned orange juice to x 
    y = temp;  // Now that y is free we assigned temp water to y
    
    System.out.println(x); // orange juice
    System.out.println(y); // water
    """;

    System.out.println(swap_variable);



    System.out.println("\n+ Tip of the day: clear terminal by adding this to your code\n System.out.print('\\033c');");


  }
}
