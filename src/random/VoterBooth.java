package random;

import javax.swing.JOptionPane;

public class VoterBooth {
	public static void main(String[] args) {
		String b = JOptionPane.showInputDialog("How old are you?");
		int y = Integer.parseInt(b);
		if (y >= 18) {
			JOptionPane.showInputDialog("Who do you want to vote for?");
			JOptionPane.showConfirmDialog(null, "Are you sure?");

		}
		if (y < 18) {
			JOptionPane.showMessageDialog(null, "No one cares about your opinion");
		}
	}

}
