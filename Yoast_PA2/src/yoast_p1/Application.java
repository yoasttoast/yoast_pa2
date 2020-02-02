package yoast_p1;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Encrypter encrypt = new Encrypter();
		Decrypter decrypt = new Decrypter();
		int[] code = new int[4];
		int num = 0;
		
		while (num != 3) {
			System.out.println("Please select an option:");
			System.out.println("1: Encrypt Code");
			System.out.println("2: Decrypt Code");
			System.out.println("3: Quit");
			
			num = input.nextInt();
			
			if (num == 1) {
				System.out.println("Please enter a four-digit code to encrypt:");
				for (int i = 0; i < 4; i++) {
					code[i] = input.nextInt();
					encrypt.encryption(code);
				}
			}
			
			else if (num == 2) {
				System.out.println("Please enter a four-digit code to decrypt:");
				for (int i = 0; i < 4; i++) {
					code[i] = input.nextInt();
					decrypt.decryption(code);
				}
			}
			
			else if (num == 3) {
				System.out.println("Thank you!");
			}
			
			else if(num != 1 || num != 2 ||num != 3) {
				System.out.println("ERROR! Invalid Number. Try again");
			}
		}
		input.close();
	}
}
