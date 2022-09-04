import java.util.Scanner;

public class UcakBiletFiyatHesaplama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int km, age, ticketType;
		double pricePerKm = 0.1, total = 0.0;
		boolean error = false;

		System.out.println("Km deðerini giriniz.");
		km = sc.nextInt();

		System.out.println("Yaþýnýzý giriniz.");
		age = sc.nextInt();

		System.out.println("Bilet tipinizi giriniz. Tekyön->1  Gidiþ-Dönüþ->2");
		ticketType = sc.nextInt();

		if (km < 0 || age < 0 || !(ticketType == 1 || ticketType == 2)) {
			System.out.println("Hatalý veri girdiniz.");
			error = true;
		} else {
			total = km * pricePerKm;
			if (ticketType == 2)
				total = (total * 2) * 0.8;
			if (age < 12)
				total *= 0.5;
			else if (age < 24)
				total *= 0.9;
			else if (age > 65)
				total *= 0.7;
		}
		if (!error)
			System.out.println("Bilet Fiyatý: " + total + "TL");
	}
}
