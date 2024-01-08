/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); 
		for(int i = 0; i < n; i++){  // TODO: i and j are not informative names - name it row and col for example
			for(int j = 0; j < n; j++){
				if(i % 2 == 0){
					System.out.print("* ");}
				else{
					System.out.print(" *");
				}
				} // TODO: move it to the left
			System.out.println("");}
			}
		} // TODO: move it two times to the left
	


 