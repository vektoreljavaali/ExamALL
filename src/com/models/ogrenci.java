package com.models;

import java.util.ArrayList;
import java.util.List;

public class ogrenci {

	private String ad;
	private String sifre;
	private List<ders> derslistesi = new ArrayList<ders>();
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public List<ders> getDerslistesi() {
		return derslistesi;
	}
	public void setDerslistesi(List<ders> derslistesi) {
		this.derslistesi = derslistesi;
	}
	
	
	
}
