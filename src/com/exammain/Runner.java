package com.exammain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Utils.Okul;
import com.models.ders;

public class Runner {

	public static void main(String[] args) {
	// Kullan�lacak Arg�manlar
	// Methodlar, De�i�kenler, Listler, OOP, String, IO
	// ******************************
	// 1-Giri� Ekrani olacak ve kullan�c� ad� ve �ifre soracak
	// 2-Okul s�n�f�nda sinif,��retmen ve ders listeleri olacak
	// 3-sinif ta ��renci listeleri olacak
	// 4-��retmen giri� yapt���nda ��renci ekle ve not girme ekran� 
	//   olacak.
	// 5-m�d�r giri� yapt���nda ��retmen ve ders tan�m� yapacak 
	// 6-��renci giri� yapt���nda notlar� listelenecek.
	// 7-Allah kurtars�n. :)
	
	List<ders> derslistesi = new ArrayList<ders>();
	Okul okul = new Okul();
	
	boolean durum=true;
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println("************************");
		System.out.println("* OKUL Y�NET�M S�STEM� *");
		System.out.println("************************");
		System.out.println();
		System.out.println("Kullan�c� Ad�n� giriniz.....:");
		String kullaniciadi = sc.nextLine();
		System.out.println("�ifrenizi giriniz...........:");
		String sifre = sc.nextLine();
		if(kullaniciadi.equals(okul.mudur) && sifre.equals(okul.sifre)){
			System.out.println();
			System.out.println("1- Ders Tan�mlama");
			System.out.println("2- ��retmen Tan�mlama");
			System.out.println("3- S�n�f Tan�mlama");
			String secim = sc.nextLine();
			if(secim.equals("1")) {
				System.out.println();
				System.out.println("Ders Ad�n� Giriniz...:");
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
