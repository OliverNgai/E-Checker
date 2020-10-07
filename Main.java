import javax.swing.JOptionPane;

/**
 * The purpose of this program is to take an input.. in this case a sentence,
 * and counting the uppercase E's and lowercase e's then displaying how many there
 * are within the sentence.
 **/
public class Main {

	public static void main(String[] args) {
		String result = "";
		// while the input isn't "stop" it will run the code indefinitely, however, if
		// the input is any form of "stop" it will terminate
		while (!result.equalsIgnoreCase("STOP")) {
			result = JOptionPane.showInputDialog(null, "Please enter a sentence.");
			int bigE = 0, smallE = 0;
			// this for loop is used to go through the given sentence
			for (int i = 0; i < result.length(); i++) {
				// the below if statement goes through the sentence, and if it contains a char
				// of 'E', it will increase the count for bigE
				if (result.charAt(i) == 'E') {
					bigE++;
					// the below if statement goes through the sentence, and if it contains a char
					// of 'e', it will increase the count for smallE
				} else if (result.charAt(i) == 'e') {
					smallE++;
				}
			}
			JOptionPane.showMessageDialog(null,
					"Number of upper case e's: " + bigE + "\n Number of lowercase e's: " + smallE);
		}
		return;
	}
}
