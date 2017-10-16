package StringPack;

import javax.swing.JOptionPane;

public class StingIntro {




		public static void main(String[] args) {
			
			String[] options = new String[] {"Yes", "No", "Maybe", "Cancel"};
			 
			
			
			
			Boolean run = true;
					while (run) {
						
						// Do-While loop must Run at least once 
						// A while loop doesn't have to run 
						
						String msg="";
						String varWord = "Boise";
						
						msg = "What is your name?";
						varWord = JOptionPane.showInputDialog(msg);
						
						
					LearnStrings getIt = new LearnStrings(varWord);
					
					
					msg ="First char is: " + getIt.getFirstLetter();
						JOptionPane.showMessageDialog(null, msg);
						
					int lengthTest = getIt.getLength();
						msg ="Length = " + getIt.getLength();
							JOptionPane.showMessageDialog(null, msg);
						
						msg ="Last char is: " + getIt.getLastLetter();
							JOptionPane.showMessageDialog(null, msg);
					
				
							
				//use: substring( int beginIndex, int endIndex);			
				//substring(1, word.length()*2);
					
					msg = "Middle is: " + getIt.getMiddle();
						JOptionPane.showMessageDialog(null, msg);
					
						msg = "Do you want to play again?";
							
						 int confirm = JOptionPane.showOptionDialog(null, msg, "Message",
							      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
							       null, options, options[0]);
						 
								if (confirm == JOptionPane.YES_OPTION) {
									run = true;
								}
								
								else if (confirm == JOptionPane.NO_OPTION) {
									
								JOptionPane.showMessageDialog(null, "Have a Nice Day!");
									run = false;
								}
								
								else if (confirm == JOptionPane.CANCEL_OPTION) {
					
									int maybe = JOptionPane.showConfirmDialog(null, "So indecisive. Try agian.");
										
									
										if (maybe == JOptionPane.YES_OPTION) {
											run = true;
										}
										
										else if (maybe == JOptionPane.NO_OPTION) {
											run = false;
										}
										else {
											run = false;
										}
							
								}
								
								else {
									run = false;
								}
					}// end of while
			
		
	}// End Of Main Method

}// end of class




