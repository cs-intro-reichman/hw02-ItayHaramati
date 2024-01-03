/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); 
		for(int i = 1; i <= n; i++){
			for(int j = n-1; j>=i; j--){
				System.out.print(" ");}
			for(int p = 1; p <=n; p++){
				System.out.print("*");}
            System.out.println();
			}
		}
	}


 