import javax.swing.JOptionPane;

public class gui{
  public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello Mr." + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is" + age);

        double noseSize = Double.parseDouble(JOptionPane.showInputDialog("Enter you nose size"));
        JOptionPane.showMessageDialog(null, "So you nose is only " + noseSize + "mm so sad");
  }
}
