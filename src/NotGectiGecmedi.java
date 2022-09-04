import java.util.Scanner;

public class NotGectiGecmedi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int math, physics, chemistry, turkish, music;
		double result, counter = 0.0;

		System.out.println("Matematik notunu giriniz: 0-100 arasında olmalı yoksa ortalamaya dahil edilmez");
		math = sc.nextInt();
		if (math >= 0 && math <= 100)
			counter++;
		else
			math = 0;

		System.out.println("Fizik notunu giriniz: 0-100 arasında olmalı yoksa ortalamaya dahil edilmez");
		physics = sc.nextInt();
		if (physics >= 0 && physics <= 100)
			counter++;
		else
			physics = 0;
		
		System.out.println("Kimya notunu giriniz: 0-100 arasında olmalı yoksa ortalamaya dahil edilmez");
		chemistry = sc.nextInt();
		if (chemistry >= 0 && chemistry <= 100)
			counter++;
		else
			chemistry = 0;

		System.out.println("Türkçe notunu giriniz: 0-100 arasında olmalı yoksa ortalamaya dahil edilmez");
		turkish = sc.nextInt();
		if (turkish >= 0 && turkish <= 100)
			counter++;
		else
			turkish = 0;

		System.out.println("Müzik notunu giriniz: 0-100 arasında olmalı yoksa ortalamaya dahil edilmez");
		music = sc.nextInt();
		if (music >= 0 && music <= 100)
			counter++;
		else
			music = 0;

		result = (math + physics + chemistry + turkish + music) / counter;

		if (result >= 55) {
			System.out.println("Tebrikler geçtiniz.");
		} else {
			System.out.println("Üzgünüz geçemediniz.");
		}
		System.out.println("Not ortalamanız: " + result);

	}
}
