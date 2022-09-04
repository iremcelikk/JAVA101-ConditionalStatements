import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month, horoscope = " ";
		int day;
		boolean error = false;

		System.out.println("Do�du�unuz ay� giriniz:");
		month = sc.nextLine();
		month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

		System.out.println("Do�du�unuz g�n� giriniz:");
		day = sc.nextInt();

		if (month.equals("Ocak")) {
			if (day >= 1 && day <= 21)
				horoscope = "O�lak";
			else if (day >= 22 && day <= 31)
				horoscope = "Kova";
			else
				error = true;
		} else if (month.equals("�ubat")) {
			if (day >= 1 && day <= 19)
				horoscope = "Kova";
			else if (day >= 20 && day <= 28)
				horoscope = "Bal�k";
			else
				error = true;
		} else if (month.equals("Mart")) {
			if (day >= 1 && day <= 20)
				horoscope = "Bal�k";
			else if (day >= 21 && day <= 31)
				horoscope = "Ko�";
			else
				error = true;
		} else if (month.equals("Nisan")) {
			if (day >= 1 && day <= 20)
				horoscope = "Ko�";
			else if (day >= 21 && day <= 30)
				horoscope = "Bo�a";
		} else if (month.equals("May�s")) {
			if (day >= 1 && day <= 21)
				horoscope = "Bo�a";
			else if (day >= 22 && day <= 31)
				horoscope = "�kizler";
			else
				error = true;
		} else if (month.equals("Haziran")) {
			if (day >= 1 && day <= 22)
				horoscope = "�kizler";
			else if (day >= 23 && day <= 30)
				horoscope = "Yenge�";
			else
				error = true;
		} else if (month.equals("Temmuz")) {
			if (day >= 1 && day <= 22)
				horoscope = "Yenge�";
			else if (day >= 23 && day <= 31)
				horoscope = "Aslan";
			else
				error = true;
		} else if (month.equals("A�ustos")) {
			if (day >= 1 && day <= 22)
				horoscope = "Aslan";
			else if (day >= 23 && day <= 31)
				horoscope = "Ba�ak";
			else
				error = true;
		} else if (month.equals("Eyl�l")) {
			if (day >= 1 && day <= 22)
				horoscope = "Ba�ak";
			else if (day >= 23 && day <= 30)
				horoscope = "Terazi";
			else
				error = true;
		} else if (month.equals("Ekim")) {
			if (day >= 1 && day <= 22)
				horoscope = "Terazi";
			else if (day >= 23 && day <= 31)
				horoscope = "Akrep";
			else
				error = true;
		} else if (month.equals("Kas�m")) {
			if (day >= 1 && day <= 21)
				horoscope = "Akrep";
			else if (day >= 22 && day <= 30)
				horoscope = "Yay";
			else
				error = true;
		} else if (month.equals("Aral�k")) {
			if (day >= 1 && day <= 21)
				horoscope = "Yay";
			else if (day >= 22 && day <= 31)
				horoscope = "O�lak";
			else
				error = true;
		} else {
			error = true;
		}

		if (error)
			System.out.println("Hatal� giri�!!!");
		else
			System.out.println("Burcunuz: " + horoscope);

	}

}
