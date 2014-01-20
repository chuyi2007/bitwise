public class FindElementsAppearOnce {
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 3, 2, 3, 2, 5, 1, 1};
		int ones = 0, twos = 0;
		for (int i = 0; i < input.length; ++i) {
			twos = twos | (ones & input[i]);
			ones = ones ^ input[i];

			commonMask = ~(ones & twos);
			ones &= commonMask;
			twos &= commonMask;
		}
		return ones;
	}
}