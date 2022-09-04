import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum, secondNum, choice;
		double result;

		System.out.println("İlk Sayıyı Giriniz: ");
		firstNum = sc.nextInt();

		System.out.println("İlk Sayıyı Giriniz: ");
		secondNum = sc.nextInt();

		System.out.println("Seciminizi yapınız:\n 1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			result = firstNum + secondNum;
			System.out.println("Toplama işlemi sonucu: " + firstNum + " + " + secondNum + " = " + result);
			break;
		case 2:
			result = Math.abs(firstNum - secondNum);
			System.out.println("Çıkarma işlemi sonucu: " + "|" + firstNum + " - " + secondNum + "|" + " = " + result);
			break;
		case 3:
			result = firstNum * secondNum;
			System.out.println("Çarpma işlemi sonucu: " + firstNum + " x " + secondNum + " = " + result);
			break;
		case 4:
			if (secondNum != 0) {
				result = firstNum / secondNum;
				System.out.println("Bölme işlemi sonucu: " + firstNum + " / " + secondNum + " = " + result);
			} else
				System.out.println("İkinci sayi 0 olamaz!!!");
			break;
		default:
			System.out.println("Geçerli işlem girilmedi!!!");
		}

	}

}
