import java.util.Scanner;

public class SortingThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println("Ýlk sayýyý giriniz");
		n1 = sc.nextInt();

		System.out.println("Ýkinci sayýyý giriniz");
		n2 = sc.nextInt();

		System.out.println("Üçüncü sayýyý giriniz");
		n3 = sc.nextInt();

		if ((n1 < n2) && (n1 < n3)) {
			if (n2 < n3)
				System.out.println(n1 + " < " + n2 + " < " + n3);
			else
				System.out.println(n1 + " < " + n3 + " < " + n2);
		} else if ((n2 < n1) && (n2 < n3)) {
			if (n1 < n3)
				System.out.println(n2 + " < " + n1 + " < " + n3);
			else
				System.out.println(n2 + " < " + n3 + " < " + n1);
		} else if ((n3 < n1) && (n3 < n2)) {
			if (n1 < n2)
				System.out.println(n3 + " < " + n1 + " < " + n2);
			else
				System.out.println(n3 + " < " + n2 + " < " + n1);
		}
	}

}
