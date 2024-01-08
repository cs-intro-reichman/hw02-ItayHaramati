/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]); // TODO: maybe input or num would be better name?
		for(int divisor = 1; divisor <= x; divisor++){
			if(x % divisor == 0){
				System.out.println(divisor);
			}
		}
	}
}
