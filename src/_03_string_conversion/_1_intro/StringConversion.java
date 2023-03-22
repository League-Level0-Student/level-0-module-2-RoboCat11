
package _03_string_conversion._1_intro;
import javax.swing.JOptionPane;

public class StringConversion {

public static void main(String[] args) {
String variable = JOptionPane.showInputDialog("Enter a number");
Integer.parseInt(variable);	
int num = Integer.parseInt(variable);
}

}
