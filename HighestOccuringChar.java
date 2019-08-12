package practice;

public class HighestOccuringChar {
	static final int max_value = 256;
	static char getMaximumOccuringChar(String str) {
		int count[] = new int[max_value];
		//construct a character count array from the input string
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;			
		}
		int max = -1;
		char result = ' ';
		//traverse through the string and maintaing the count of each character
		for(int i=0;i<str.length();i++) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
public static void main(String[] args) {
	String str = "AAAABBbbbbbbbbbbbbbbbbbbbbbCCDDD";
	System.out.println(getMaximumOccuringChar(str));
}
}
