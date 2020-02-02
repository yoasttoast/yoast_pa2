package yoast_p1;
import java.util.Arrays;

public class Decrypter {
	public void decryption(int a[]) {
		int first, second;
		for(int i = 0; i < 4; i++) {
			a[i] *= 10;
			a[i] -= 7;
		}
		first = a[0];
		second = a[1];
		a[0] = a[2];
		a[1] = a[3];
		a[2] = first;
		a[3] = second;
		
		System.out.print("Your decrypted code is: ");
		System.out.println(Arrays.toString(a));
		
	}

}
