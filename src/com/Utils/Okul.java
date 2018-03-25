package com.Utils;

import java.util.ArrayList;
import java.util.List;

import com.models.ders;
import com.models.ogretmen;
import com.models.sinif;

public class Okul {

	public static String mudur="müdür";
	public static String sifre="123";
	
	private List<sinif> siniflistesi = new ArrayList<sinif>();
	private List<ogretmen> ogretmenlistesi = new ArrayList<ogretmen>();
	private List<ders> derslistesi = new ArrayList<ders>();
	
	public List<sinif> getSiniflistesi() {
		return siniflistesi;
	}
	public void setSiniflistesi(List<sinif> siniflistesi) {
		this.siniflistesi = siniflistesi;
	}
	public List<ogretmen> getOgretmenlistesi() {
		return ogretmenlistesi;
	}
	public void setOgretmenlistesi(List<ogretmen> ogretmenlistesi) {
		this.ogretmenlistesi = ogretmenlistesi;
	}
	public List<ders> getDerslistesi() {
		return derslistesi;
	}
	public void setDerslistesi(List<ders> derslistesi) {
		this.derslistesi = derslistesi;
	}
	
	
	
}
