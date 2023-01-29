import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		/*
		Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
		Geçme Notu : 55
		Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
		 */

		int mat,fizik,turkce,kimya,muzik,toplam;

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuzu giriniz:");
		mat = input.nextInt();

		System.out.print("Fizik notunuzu giriniz:");
		fizik = input.nextInt();

		System.out.print("Türkçe notunuzu giriniz:");
		turkce = input.nextInt();

		System.out.print("Kimya notunuzu giriniz");
		kimya = input.nextInt();

		System.out.print("Müzik notunuzu giriniz:");
		muzik = input.nextInt();

		toplam  =   mat + fizik + turkce + kimya + muzik;

		double result = toplam / 5;

		if (result <= 55)
			System.out.println("Kaldınız" + " " + "Ortalamanız:"+ " " + result);
		else
			System.out.println("Tebrikler geçtiniz" + " " + "Ortalamanız:"  + " " +  result);


	}
}