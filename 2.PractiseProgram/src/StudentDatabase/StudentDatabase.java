package StudentDatabase;

public class StudentDatabase {
	// Variables
	String name;
	String ssn;
	private static int id = 100;
	String userId;
	private long phno;
	private String city;
	private String state;
	String courses;
	private static double balance = 450;

	// Constructor to take name and ssn
	StudentDatabase(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		if (ssn.length() < 6) {
			System.out.println("Your SSN is incorrect");
		} else {
			generateEmail();
			System.out.println("UserId: " + generateUserId());
		}
	}

	private void generateEmail() {
		String email = name.toLowerCase() + "" + (int) (Math.random() * 100) + "" + "@nepuniversity.com";
		System.out.println("Email : " + email);
	}

	private String generateUserId() {
		int max = 9000;
		int min = 1000;
		int length = this.ssn.length();
		userId = id + "" + (int) (Math.random() * (max - min));
		userId += min + this.ssn.substring(length - 5, length);
		return userId;
	}

	// Getters and Setters
	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// methods
	public void enroll(String courses) {
		this.courses += courses;
		balance += balance;
		System.out.println("Courses: " + courses);
	}

	public void payTution(double amount) {
		balance += amount;
		System.out.println("Tution fee: $" + balance);
	}

	private double checkBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "[" + "Name: " + name + "\tSSN: " + ssn + "\t" + "]\n[Fees: $" + checkBalance() + "]";
	}
}
