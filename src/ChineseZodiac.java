import java.util.Scanner;
public class ChineseZodiac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int birthYear;
		String chineseZodiac="";
		
		System.out.println("Doðum yýlýnýzý giriniz");
		birthYear=sc.nextInt();
		
		switch(birthYear%12) {
		case 0:
			chineseZodiac="Maymun";
			break;
		case 1:
			chineseZodiac="Horoz";
			break;
		case 2:
			chineseZodiac="Köpek";
			break;
		case 3:
			chineseZodiac="Domuz";
			break;
		case 4:
			chineseZodiac="Fare";
			break;
		case 5:
			chineseZodiac="Öküz";
			break;
		case 6:
			chineseZodiac="Kaplan";
			break;
		case 7:
			chineseZodiac="Tavþan";
			break;
		case 8:
			chineseZodiac="Ejderha";
			break;
		case 9:
			chineseZodiac="Yýlan";
			break;
		case 10:
			chineseZodiac="At";
			break;
		case 11:
			chineseZodiac="Koyun";
			break;
		}
		
		System.out.println("Çin Zodyaðý Burcunuz: "+chineseZodiac);
	}

}
