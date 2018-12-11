public class LipogramAnalyzer {
	private String txt;
	
	public LipogramAnalyzer(String text){
		txt = text; 
	}
	public String mark(char letter) {
		String hashtags = txt.replace(letter,'#');
		return hashtags; 			
	}
	private String getWord(int index) {
		int beginning = index;
		int end = index;
		while(beginning >= 0 && Character.isWhitespace(txt.charAt(beginning)) == false) {
			System.out.println(beginning);
			beginning--;
			
		}
		if(beginning == -1) {
			beginning = 0;
		} 
		 
		 
		while(end < txt.length() && Character.isWhitespace(txt.charAt(end)) == false) {
			System.out.println(end);
			end++;
			
		}
		if(end == -1) {
			end = 0;
		}

		String word = txt.substring(beginning+1,end);
		System.out.println(word);
		return word; 
 	}
	public String allWordsWith(char letter) {
		int i = 0;

		String word = "";		
		while(i >= 0 && i < txt.length()) {
			if(txt.charAt(i) == letter) {
				String n = getWord(i);
				word = word + n + "\n";
				System.out.println(word);
			}



			/*if(getWord(i).equals()) {
				word.replace(getWord(i),"");
			}*/
			
			i++;
		}
		return word;
	}
}

