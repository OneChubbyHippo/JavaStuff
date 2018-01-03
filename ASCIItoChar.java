/**
 * Created by winniejeng on 1/2/18.
 * Convert ASCII code to its character equivalence
 */
import javax.swing.JOptionPane;

public class ASCIItoChar {
    public static void main(String[] args) {
        //Input dialog box
        String asciiString = JOptionPane.showInputDialog(
                "Enter an ASCII code between 0 and 128: ");

        //parse string to integer
        int ascii = Integer.parseInt(asciiString);
        //convert integer to char
        char c = (char)ascii;

        //Output dialog box
        JOptionPane.showMessageDialog(null,
                "The character for ASCII code "+ ascii + " is " + c);
    }
}
