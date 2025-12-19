package p1;
import java.util.Arrays;
import java.util.Random;

public class P1_Main {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(Arrays.toString(randomArray(x)));
		System.out.println(Arrays.toString(randomArray2(x)));
		System.out.println(Arrays.toString(randomArray3()));
		System.out.println(Arrays.toString(randomArray4(x)));
	}
	
	public static int[] randomArray(int x) {
		int[] ergebnis = new int[x];
		Random generator = new Random();
		if(x > 0) {
			for(int i = 0; i < x; i++) {
				ergebnis[i] = generator.nextInt();
			}
		}
		return ergebnis;
	}
	
	public static int[] randomArray2(int x) {
		int[] ergebnis = new int[x];
		Random generator = new Random();
		if(x > 0) {
			for(int i = 0; i < x; i++) {
				ergebnis[i] = generator.nextInt(x);
			}
		}
		return ergebnis;
	}
	
	public static int[] randomArray3() {
		int[] ergebnis = new int[6];
		Random generator = new Random();
		for(int i = 0; i < 6; i++) {
			ergebnis[i] = 55 + generator.nextInt(21);
		}
		return ergebnis;
	}
	
	public static int[] randomArray4(int n) {
		int[] ergebnis = new int[n + 1];
		Random generator = new Random();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			int zufall = 1 + generator.nextInt(50);
			ergebnis[i] = zufall;
			sum += zufall;
		}
		ergebnis[n] = sum / n;
		return ergebnis;
	}
}
