package day3;

import javax.swing.JOptionPane;

public class Snooper2 {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "If you answer these questions, you will get a free Iphone X!!!");
	String name= JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hi "+name);
	String age=JOptionPane.showInputDialog("what is your age?");
	String bday=JOptionPane.showInputDialog("What is your birthday?");
	String pob=JOptionPane.showInputDialog("Where were you born?");
	String adress= JOptionPane.showInputDialog("What is your adress?");
	String ssn= JOptionPane.showInputDialog("What is your social security number?");
	String ccn= JOptionPane.showInputDialog("What is your credit card number?");
	JOptionPane.showMessageDialog(null, "Name:"+name+"\nAge:"+age+"\nBirthday:"+bday+"\nPlace of Birth"+pob+"\nAdress:"+adress+"\nSocial Security Number:"+ssn+"\nCredit Card Number?"+ccn);
	JOptionPane.showMessageDialog(null, "Ok, I will rob you now, this should teach you not to give out your personal information.");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
