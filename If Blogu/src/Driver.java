import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		int number = -10;
		
		boolean result = number > 0;
		
		if(result) {
			System.out.println("Number pozitif bir sayıdır.");
			System.out.println("2.");
		}
		else {
			System.out.println("Number negatif bir sayıdır.");
		}
		System.out.println("Burası her zaman çalıştırılacak");
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int number = scanner.nextInt();
		if(number % 2 == 0) {
			System.out.println("Çift bir sayı girdiniz");
		}
		else {
			System.out.println("Tek bir sayı girdiniz");
		}
		*/
		
		/*
		int number = 10;
		if(number < 100) {
			System.out.println("Sayı 100'den küçük");
			if(number > 50) {
				System.out.println("Sayı 50'den büyük");
			}
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int number = scanner.nextInt();
		if(number < 10 && number >= 1) {
			System.out.println("Girdiğiniz sayı 1 basamanklı");
		}
		else if(number < 100 && number >= 10) {
			System.out.println("Girdiğiniz sayı 2 basamanklı");
		}
		else if(number < 1000 && number >= 100) {
			System.out.println("Girdiğiniz sayı 3 basamanklı");
		}
		else if(number < 10000 && number >= 1000) {
			System.out.println("Girdiğiniz sayı 4 basamanklı");
		}
		else {
			System.out.println("Giridiğiniz sayı 1 & 9999 arasında değil");
		}
		
	}
}
