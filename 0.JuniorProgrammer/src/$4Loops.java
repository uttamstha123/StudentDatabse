
public class $4Loops {
	public static void main(String[] args) {
		int[] years = { 2001, 2002, 2008, 2015, 2020 };
		// Do loop: print the elemnt of an array
		// create a counter
		int i = 0;
		do {
			System.out.println("Year: " + years[i]);
			i += 1;
		} while (i < years.length);
		System.out.println("****************");
		// while loop: print the same thing
		int j = 0;
		while (j < 5) {
			System.out.println(years[j]);
			j++;
		}
		System.out.println("****************");
		// for loop
		for (int k = 0; k < 5; k++) {
			System.out.println(years[k]);
		}
	}
}
