package com.models;

public class ders {

	private String ad;
	private double not1;
	private double not2;
	private double ort;
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public double getNot1() {
		return not1;
	}
	public void setNot1(double not1) {
		this.not1 = not1;
	}
	public double getNot2() {
		return not2;
	}
	public void setNot2(double not2) {
		this.not2 = not2;
	}
	public double getOrt() {
		return (not1+not2)/2;
	}
	
	
}
