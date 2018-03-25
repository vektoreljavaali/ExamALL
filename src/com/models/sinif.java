package com.models;

import java.util.ArrayList;
import java.util.List;

public class sinif {

	private String ad;
	private List<ogrenci> ogrencilistesi = new ArrayList<ogrenci>();
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public List<ogrenci> getOgrencilistesi() {
		return ogrencilistesi;
	}
	public void setOgrencilistesi(List<ogrenci> ogrencilistesi) {
		this.ogrencilistesi = ogrencilistesi;
	}
	
	
}
