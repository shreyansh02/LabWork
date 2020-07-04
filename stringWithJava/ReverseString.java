package stringWithJava;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String s = "       The sky  is blue ";
		
		String ans = "";
		
		int i = s.length()-1;
		
		while(i >= 0) {
			
			while(i >= 0 && s.charAt(i) == ' ') 
				i--;
			
			int j = i;
			
			if(i < 0)   // don't print space in last of the string,in-case in starting of string we have space
				break;
			
			while(i >= 0 && s.charAt(i) != ' ')
				i--;
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1, j+1));
			}else
				ans = ans.concat(" "+s.substring(i+1, j+1));
		}
		
		System.out.println(ans);
		
	}

}
