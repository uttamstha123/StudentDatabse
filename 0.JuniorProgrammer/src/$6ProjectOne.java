
public class $6ProjectOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum To Num: "+sumToNum(5));
		System.out.println("Factorials using Recursion: "+fact(5));
		int[] numbers = { 2, 4, 7, 9, 2, 5, 1, -8, 0, 10 };
		double[] num = { 2, 4.6, 7, 9.8, 2, 5, 1, -8.5, 0, 10.0 };
		System.out.println("min: "+findMin(numbers));
		System.out.println("max: "+findMax(numbers));
		System.out.println("avg: "+ findAvg(num));
	}

	public static int sumToNum(int n) {
		if (n == 0)
			return 0;
		else
			return n + sumToNum(n - 1);
	}

	public static int fact(int i) {
		if (i <= 1)
			return 1;
		else
			return i * fact(i - 1);
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static double findAvg(double[] arr) {
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}
