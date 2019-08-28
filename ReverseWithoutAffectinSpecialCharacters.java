package practice;

public class ReverseWithoutAffectinSpecialCharacters {
	public static void reverseString(char[] c) {
		int left = 0;
		int right = c.length - 1;
		while(left<right) {
			if(!Character.isAlphabetic(c[left])) {
				left++;
			}
			else if(!Character.isAlphabetic(c[right])) {
				right--;
			}
			else {
				char temp = c[left];
				c[left] = c[right];
				c[right] = temp;
				left++;
				right--;
			}
		}
	}
	public static void main(String[] args) {
		String s = "HSADJHSeyu^&*^*sdfhsjdfh";
		char[] c = s.toCharArray();
		System.out.println("Input string is " + s);
		reverseString(c);
		String reverseString = new String(c);
		System.out.println("Outpur string is " + reverseString);
		
	}

}
