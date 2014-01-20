//find if two input integers have opposite signs without using arithmetic operators
public class OppositeSigns {
	public static void main(String[] args) {

	}

	public boolean funcion1(int a, int b) {
		return a ^ b < 0;
	}

	public boolean function2(int a, int b) {
		return a >= 0 && b >= 0 || a < 0 && b < 0;
	}

	public boolean function3(int a, int b) {
		return ((a ^ b) >> 31) == -1;
	}
}