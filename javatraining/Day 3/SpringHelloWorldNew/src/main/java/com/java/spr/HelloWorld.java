package com.java.spr;

public class HelloWorld {
     private String WelcomeNote;
     private String SupportNote;
     private String HelpNote;
     private String EndNote;
	public String getWelcomeNote() {
		return WelcomeNote;
	}
	public void setWelcomeNote(String welcomeNote) {
		WelcomeNote = welcomeNote;
	}
	public String getSupportNote() {
		return SupportNote;
	}
	public void setSupportNote(String supportNote) {
		SupportNote = supportNote;
	}
	public String getHelpNote() {
		return HelpNote;
	}
	public void setHelpNote(String helpNote) {
		HelpNote = helpNote;
	}
	public String getEndNote() {
		return EndNote;
	}
	public void setEndNote(String endNote) {
		EndNote = endNote;
	}
     
	public void show(String sname) {
		System.out.println(WelcomeNote);
		System.out.println(SupportNote + sname);
		System.out.println(HelpNote);
		System.out.println(EndNote);
	}
     
     
}
