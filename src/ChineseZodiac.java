import java.util.Scanner;
public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int birthYear;
		String chineseZodiac="";
		
		System.out.println("Do�um y�l�n�z� giriniz");
		birthYear=sc.nextInt();
		
		switch(birthYear%12) {
		case 0:
			chineseZodiac="Maymun";
			break;
		case 1:
			chineseZodiac="Horoz";
			break;
		case 2:
			chineseZodiac="K�pek";
			break;
		case 3:
			chineseZodiac="Domuz";
			break;
		case 4:
			chineseZodiac="Fare";
			break;
		case 5:
			chineseZodiac="�k�z";
			break;
		case 6:
			chineseZodiac="Kaplan";
			break;
		case 7:
			chineseZodiac="Tav�an";
			break;
		case 8:
			chineseZodiac="Ejderha";
			break;
		case 9:
			chineseZodiac="Y�lan";
			break;
		case 10:
			chineseZodiac="At";
			break;
		case 11:
			chineseZodiac="Koyun";
			break;
		}
		
		System.out.println("�in Zodya�� Burcunuz: "+chineseZodiac);
	}

}
