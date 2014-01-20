public class MinimumOfThreeNumbers {
	public static void main(String[] args) {
		int minNum = min(min(5, 7), -1);
	}

	public static int min(int a, int b) {
		return b + (a - b) & ((a - b) >> 31);
	}
}