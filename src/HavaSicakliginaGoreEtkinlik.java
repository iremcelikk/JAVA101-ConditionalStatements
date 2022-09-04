import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlik {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Sıcaklık değerini giriniz:");
		int heat=sc.nextInt();
		
		if(heat > 25)
			System.out.println("Yüzmeye gidebilirsin.");
		else if(heat > 15)
			System.out.println("Piknik yapmaya gidebilirsin.");		
		else if(heat > 5)
			System.out.println("Sinema gidebilirsin.");		
		else 
			System.out.println("Kayak yapabilirsin");
		

	}

}
