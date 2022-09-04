import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		boolean leapYear = false;

		System.out.println("Yýlý giriniz: ");
		year = sc.nextInt();

		if (year % 100 != 0 && year % 4 == 0)
			leapYear = true;
		else if (year % 100 == 0 && year % 400 == 0)
			leapYear = true;
		if (leapYear)
			System.out.println("Girilen yýl artýk yýldýr.");
		else
			System.out.println("Girilen yýl artýk yýl deðildir."); 
	}

}
