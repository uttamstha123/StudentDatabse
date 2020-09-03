import java.util.*;

public class EncruptandDecrypt {

	// accept a string
	// take out each character and add a value
	// print the encrypted after the input

	// Global Variable
	String s = "";
	int key = 0;
	Scanner sc = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);

	public void input() {
		System.out.println("Enter the String : ");
		this.s = scan.nextLine();
		System.out.println("Enter the Key : ");
		this.key = sc.nextInt();

		encrypt(this.s, this.key);
	}

	public static void encrypt(String s, int key) {
		int l = s.length();
		char ch;
		for (int i = 0; i < l; i++) {
			ch = s.charAt(i);
			ch = (char) ((int) ch + key);
			if (ch > 90) {
				ch = (char) ((int) ch - 26);
			}
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		EncruptandDecrypt ob = new EncruptandDecrypt();
		ob.input();
	}
}
