package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "This is the Sports Quiz\n There are 4 questions");
		int score = 0;
		int tries = 0;
		while(true) {
		String q1= JOptionPane.showInputDialog("                       Score:"+score+"\n\n\n\nWhat team lost the 2017 World Series?");
		if(q1.toLowerCase().equals("dodgers") || q1.toLowerCase().equals("the dodgers")) {
			if(tries==0) {
			score=score+1;
			}
			break;
		}
		tries++;
		}
		tries=0;
		while(true) {
		String q2= JOptionPane.showInputDialog("                   Score:"+score+"\n\n\n\nWhat team won Superbowl 51?");
		if(q2.toLowerCase().equals("patriots") || q2.toLowerCase().equals("the patriots")) {
		if(tries==0) {
			score=score+1;		
		}
		break;
		}
		tries++;
		}
		while(true) {
		String q3= JOptionPane.showInputDialog("                               Score:"+score+"\n\n\n\nWho won the 2017 Australian Open and \n   Wimbledon?(full name or last name)");
		if(q3.toLowerCase().equals("federer") || q3.toLowerCase().equals("roger federer")) {
		if(tries==0) {
			score=score+1;
		}
		break;
		}
		tries++;
		}
		while(true) {
			String q4= JOptionPane.showInputDialog("                     Score:"+score+"\n\n\n\nWhat year did Kobe Bryant retire?");
			if(q4.equals("2016")) {
			if(tries==0) {
				score=score+1;
			break;
			}
			tries++;
			}
		
		
	}
		JOptionPane.showMessageDialog(null, "               Congratulations\nyou have finished the sports quiz!\n     Your score was "+score+" out of 4");
}
}