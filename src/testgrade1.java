import javax.swing.JOptionPane;

public class testgrade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count= 0;
		int total=0;
		String input = JOptionPane.showInputDialog(null, "How many grades will you be inputting?");
		int numGrades = Integer.parseInt(input);
		int [] listGrades = new int[numGrades];
		for (int index = 0; index < listGrades.length; index++) {
			String input1 = JOptionPane.showInputDialog(null, "Enter a grade:");
			int value = Integer.parseInt(input1);
			total= total+ value;
			count++;
		}
		int average1 = total/count;
		JOptionPane.showMessageDialog(null, "The average of your test grades is: " + average1 + "%");
		
		
	}

}
