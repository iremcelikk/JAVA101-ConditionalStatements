import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		boolean leapYear = false;

		System.out.println("Y�l� giriniz: ");
		year = sc.nextInt();

		if (year % 100 != 0 && year % 4 == 0)
			leapYear = true;
		else if (year % 100 == 0 && year % 400 == 0)
			leapYear = true;
		if (leapYear)
			System.out.println("Girilen y�l art�k y�ld�r.");
		else
			System.out.println("Girilen y�l art�k y�l de�ildir."); 
	}

}
