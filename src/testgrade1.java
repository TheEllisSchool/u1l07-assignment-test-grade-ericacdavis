import javax.swing.JOptionPane;

public class testgrade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		String input = JOptionPane.showInputDialog(null, "How many grades will you be inputting?");
		int numGrades = Integer.parseInt(input);
		int [] listGrades = new int[numGrades];
		for (int index = 0; index < listGrades.length; index++) {
			String input1 = JOptionPane.showInputDialog(null, "Enter a grade:");
			int value = Integer.parseInt(input1);
			listGrades[index]= value;
			total= total+ value;
		
		}
		
		double max = listGrades[0];
		for(int i =0; i < numGrades; i++) {
			if (listGrades[i] > max) {max = listGrades[i];}
		}
		double min = listGrades[0];
		for(int i =0; i < numGrades; i++) {
			if (listGrades[i] < min) {min = listGrades[i];}	
		}
		JOptionPane.showMessageDialog(null,"The Min Grade is " + min);
		JOptionPane.showMessageDialog(null,"The Max Grade is " + max);
		int average1 = total/numGrades;
		double average2= (total-min)/numGrades;
		JOptionPane.showMessageDialog(null, "The average of your test grades is: " + average1 + "%");
		JOptionPane.showMessageDialog(null, "The average of your test grades without the minimum score is: " + average2 + "%");
		
		
	}

}
