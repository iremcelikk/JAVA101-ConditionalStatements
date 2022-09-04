import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String username, password, passwordChanging, newPassword;

		System.out.println("Kullanıcı adınızı girin");
		username = sc.nextLine();

		System.out.println("Şifrenizi girin");
		password = sc.nextLine();

		if (username.equals("patika") && password.equals("java101")) {
			System.out.println("Başarılı giriş");
		} else if (username.equals("patika") && !(password.equals("java101"))) {
			System.out.println(
					"Giriş Başarısız !!! \n Şifrenizi değiştirmek isterseniz \" e \" ye istmezseniz \" h \" ye basın");
			passwordChanging = sc.nextLine();
			switch (passwordChanging) {
			case "e":
				System.out.println("Yeni Şifreyi Giriniz");
				newPassword = sc.nextLine();
				if (!(newPassword.equals("java101")))
					System.out.println("Şifre değiştirildi");
				else
					System.out.println("Şifre değiştirilemedi!! Lütfen başka şifre girin.");
				break;
			case "h":
				System.out.println("Şifre aynı kaldı");
			}
		} else if (!username.equals("patika"))
			System.out.println("Kullanıcı ismi geçersiz. Lütfen tekrar deneyin.");
	}
}
