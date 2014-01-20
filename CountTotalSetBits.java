//Given a positive integer n, count the total number of set bits in binary representation of all numbers from 1 to n.
public class CountTotalSetBits {
	public static void main(String[] args) {
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; ++i) {
			sum += getBits(i);
		}
	}

	public static int getBits(int x) {
		return (x % 2 == 0 ? 0 : 1) + getBits(x / 2);
	}
}