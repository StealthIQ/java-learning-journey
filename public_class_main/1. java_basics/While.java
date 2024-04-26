public class While {
  public static void main(String[] args) {
    int i = 0;
    while(i < 10){
      System.out.println("this is a while loop");
      i++;
    }

    // the do loop excutes a code once before checking if its true 
    do{
      System.out.println("this was a loop");
      i++;
    }while(i<2);
    System.out.println("Cool");
    
  }
}
