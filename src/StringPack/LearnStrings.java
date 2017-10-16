package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	
	//field is right above the main constructor
	
	String word = "";
	
		public LearnStrings(String s)
		{
			setString(s);
		}// end of constructor
		
		
		
		public void setString(String s) {
		
			word = s;
			//System.out.println("String entered is: " + s);
			String msg = "String Entered is: " + word;
			JOptionPane.showMessageDialog(null, msg);
			
			
		}//end of Method setString
		
	public char getFirstLetter() {
		

		return word.charAt(0); 
		
	}// end of method getFirstLetter
	
	
	
		
		public int getLength() {
			
			return word.length();
		}//end of method getLength
		
		
		
		
		public char getLastLetter() {
			
			
			
			return word.charAt(word.length()-1); 
		}// end of method getLastLetter
		
		public int beginIndex() {
			
			return 0;
		}//end of method beginIndex
		
		public int endIndex() {
			
			return 0;
		}//end of method endIndex
		
		public String getMiddle() {
			return word.substring(1,word.length()-1);
		}
		
		
		
		
}//end of Class LearnStrings
