import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
	int[] integers=new int[5];
	int numbersum= 0;
	for (int i = 0; i < integers.length; i++) {
		String num=JOptionPane.showInputDialog("Type in 1 numbers");
		int numbers=Integer.parseInt(num);
		integers[i]=numbers;
		
	}
	
	for (int i = 0; i < integers.length; i++) {
		integers[i]=numbersum+=integers[i];
		
	}
	JOptionPane.showMessageDialog(null,numbersum);
}
}
