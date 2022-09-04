import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month, horoscope = " ";
		int day;
		boolean error = false;

		System.out.println("Doğduğunuz ayı giriniz:");
		month = sc.nextLine();
		month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

		System.out.println("Doğduğunuz günü giriniz:");
		day = sc.nextInt();

		if (month.equals("Ocak")) {
			if (day >= 1 && day <= 21)
				horoscope = "Oğlak";
			else if (day >= 22 && day <= 31)
				horoscope = "Kova";
			else
				error = true;
		} else if (month.equals("Şubat")) {
			if (day >= 1 && day <= 19)
				horoscope = "Kova";
			else if (day >= 20 && day <= 28)
				horoscope = "Balık";
			else
				error = true;
		} else if (month.equals("Mart")) {
			if (day >= 1 && day <= 20)
				horoscope = "Balık";
			else if (day >= 21 && day <= 31)
				horoscope = "Koç";
			else
				error = true;
		} else if (month.equals("Nisan")) {
			if (day >= 1 && day <= 20)
				horoscope = "Koç";
			else if (day >= 21 && day <= 30)
				horoscope = "Boğa";
		} else if (month.equals("Mayıs")) {
			if (day >= 1 && day <= 21)
				horoscope = "Boğa";
			else if (day >= 22 && day <= 31)
				horoscope = "İkizler";
			else
				error = true;
		} else if (month.equals("Haziran")) {
			if (day >= 1 && day <= 22)
				horoscope = "İkizler";
			else if (day >= 23 && day <= 30)
				horoscope = "Yengeç";
			else
				error = true;
		} else if (month.equals("Temmuz")) {
			if (day >= 1 && day <= 22)
				horoscope = "Yengeç";
			else if (day >= 23 && day <= 31)
				horoscope = "Aslan";
			else
				error = true;
		} else if (month.equals("Ağustos")) {
			if (day >= 1 && day <= 22)
				horoscope = "Aslan";
			else if (day >= 23 && day <= 31)
				horoscope = "Başak";
			else
				error = true;
		} else if (month.equals("Eylül")) {
			if (day >= 1 && day <= 22)
				horoscope = "Başak";
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
		} else if (month.equals("Kasım")) {
			if (day >= 1 && day <= 21)
				horoscope = "Akrep";
			else if (day >= 22 && day <= 30)
				horoscope = "Yay";
			else
				error = true;
		} else if (month.equals("Aralık")) {
			if (day >= 1 && day <= 21)
				horoscope = "Yay";
			else if (day >= 22 && day <= 31)
				horoscope = "Oğlak";
			else
				error = true;
		} else {
			error = true;
		}

		if (error)
			System.out.println("Hatalı giriş!!!");
		else
			System.out.println("Burcunuz: " + horoscope);

	}

}
