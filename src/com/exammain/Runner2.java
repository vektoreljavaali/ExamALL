package com.exammain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.models.ders;

public class Runner2 {

	public static void main(String[] args) {
		
		List<ders> derslistesi = new ArrayList<ders>();
		boolean durum = true;
		do {
			//1- not gir
			//2- ��k��
			System.out.println("1- Not Giri�");
			System.out.println("2- ��k��");
			System.out.println("Se�iniz");
			Scanner sc = new Scanner(System.in);
			String secim = sc.nextLine();
			
			if(secim.equals("1")) {
				ders tmp = new ders();
				System.out.println("dersin ad�n� giriniz...:");
				tmp.setAd(sc.nextLine());
				
				System.out.println("1. Notu giriniz...:");
				tmp.setNot1(sc.nextDouble());
			
				System.out.println("2. Not giriniz...:");
				tmp.setNot2(sc.nextDouble());
				
				derslistesi.add(tmp);
								
			}
			else if(secim.equals("2")) {
				durum=false;
			}
			else {
				durum=false;
			}
			
		
			
			
		}while(durum);
		
		System.out.println("Dersin Ad�    |   Not1   |   Not2    | Ortalama");
		for (ders item : derslistesi) {
			System.out.println(item.getAd()+"    "+ item.getNot1()+"     "+ item.getNot2()+"      "+ item.getOrt());
		}
		
		// ki�inin girmi� oldu�u t�m ders ve notlar�n listesini yazacak.
		//
		//Dersin Ad�   |      Not1   |  Not2  |  Ortalama
		//Matematik          45         85         65
		//
		
	}

}
