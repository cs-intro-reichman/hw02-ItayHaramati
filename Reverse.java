/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		String reverseString = "";
		int n = str.length();
		for(int i = n - 1; i >= 0; i--){
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println(reverseString); 
		System.out.println("The middle character is " + str.charAt((str.length() - 1) / 2));
	}
}
