package com.exammain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Utils.Okul;
import com.models.ders;

public class Runner {

	public static void main(String[] args) {
	// Kullanýlacak Argümanlar
	// Methodlar, Deðiþkenler, Listler, OOP, String, IO
	// ******************************
	// 1-Giriþ Ekrani olacak ve kullanýcý adý ve þifre soracak
	// 2-Okul sýnýfýnda sinif,öðretmen ve ders listeleri olacak
	// 3-sinif ta öðrenci listeleri olacak
	// 4-öðretmen giriþ yaptýðýnda öðrenci ekle ve not girme ekraný 
	//   olacak.
	// 5-müdür giriþ yaptýðýnda öðretmen ve ders tanýmý yapacak 
	// 6-öðrenci giriþ yaptýðýnda notlarý listelenecek.
	// 7-Allah kurtarsýn. :)
	
	List<ders> derslistesi = new ArrayList<ders>();
	Okul okul = new Okul();
	
	boolean durum=true;
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("* OKUL YÖNETÝM SÝSTEMÝ *");
		System.out.println("************************");
		System.out.println();
		System.out.println("Kullanýcý Adýný giriniz.....:");
		String kullaniciadi = sc.nextLine();
		System.out.println("Þifrenizi giriniz...........:");
		String sifre = sc.nextLine();
		if(kullaniciadi.equals(okul.mudur) && sifre.equals(okul.sifre)){
			System.out.println();
			System.out.println("1- Ders Tanýmlama");
			System.out.println("2- Öðretmen Tanýmlama");
			System.out.println("3- Sýnýf Tanýmlama");
			String secim = sc.nextLine();
			if(secim.equals("1")) {
				System.out.println();
				System.out.println("Ders Adýný Giriniz...:");
				String dersadi = sc.nextLine();
				ders tmpders = new ders();
				tmpders.setAd(dersadi);
				List<ders> tmpderslistesi = okul.getDerslistesi();
				tmpderslistesi.add(tmpders);
				okul.setDerslistesi(tmpderslistesi);
				
			}
			else if(secim.equals("2"))
			{
				
			}
			else if(secim.equals("3")) {
				
			}
			else {
				durum=false;
			}
		}
		else {
			durum=false;
		}
		
	}while(durum);
	
		
		System.out.println("PROGRAM SONLANDIRILDI");
	}//method sonu

}//class sonu
