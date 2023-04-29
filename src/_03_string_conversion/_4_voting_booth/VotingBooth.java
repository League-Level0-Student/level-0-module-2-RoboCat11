package _03_string_conversion._4_voting_booth;
import javax.swing.JOptionPane;
public class VotingBooth {
public static void main(String[] args) {
	

String input = JOptionPane.showInputDialog("How old are you (in years)?");
int age = Integer.parseInt(input);
if(age>18) {

String nextPresident = JOptionPane.showInputDialog("Who do you think the next president should be?");	
}
if(age<=18) {
JOptionPane.showMessageDialog(null,"Nobody cares what you think!");	
}
}
}




