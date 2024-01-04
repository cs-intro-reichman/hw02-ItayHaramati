/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		String s = N + " is a perfect number since " + N + " = " + 1;
		int sum = 1;
		for(int i = 2; i < N; i++){
			if(N % i == 0){
				s = s + " + " + i;
				sum += i;
			}
		}
		if (sum == N){
			System.out.println(s);
		}else{
            System.out.println(N + " is not a perfect number");
    }
}	
}
	