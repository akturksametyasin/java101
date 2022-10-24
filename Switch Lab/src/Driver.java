import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. Sayı : ");
		float x = Float.parseFloat(scanner.nextLine());		// parseFloat -> string'i float'a çevirir
		System.out.print("İşlem : ");
		char islem = scanner.nextLine().charAt(0);
		System.out.print("2. Sayı : ");
		float y = Float.parseFloat(scanner.nextLine());
		
		switch (islem) {
			case '+': 
				System.out.println("Sonuc : " + (x + y));
				break;
			case '-': 
				System.out.println("Sonuc : " + (x - y));
				break;
			case '*': 
				System.out.println("Sonuc : " + (x * y));
				break;
			case '/': 
				System.out.println("Sonuc : " + (x / y));
				break;
			default:
				System.out.println("Bilinmeyen Operatör!!!");
				break;
		}
	}
}
