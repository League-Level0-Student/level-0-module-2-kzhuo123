package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random a = new Random();
		int z1 = a.nextInt(151);
		Random b = new Random();
		int z2 = b.nextInt(276);
		Random c = new Random();
		int z3 = c.nextInt(51) + 50;
		Random d = new Random();
		int z4 = d.nextInt(237) + 192;
		Random e = new Random();
		int z5 = e.nextInt();
		JOptionPane.showMessageDialog(null, "Your numbers are: " + z1 + " " + z2 + " " + z3 + " " + z4 + " " + z5);

	}
}
