import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
		// TODO: nice code and solution!

		public static void main (String[] args) {
			// Gets the two command-line arguments
			int T = Integer.parseInt(args[0]);
			int seed = Integer.parseInt(args[1]);
			// Initailizes a random numbers generator with the given seed value
			Random generator = new Random(seed);  
	
			//// In the previous version of this program, you used a statement like:
			//// double rnd = Math.random();
			//// Where "rnd" is the variable that stores the generated random value.
			//// In this version of the program, replace this statement with:
			//// double rnd = generator.nextDouble();
			//// This statement will generate a random value in the range [0,1),
			//// just like you had in the previous version, except that the 
			//// randomization will be based on the given seed.
			//// This is the only change that you have to do in the program.
	
			// User inputs T - number of families to form (amount of runs)
			int countChildrenPerRun = 1;
			boolean isOneOfEach = false; // Tool to break while
			char firstChild = ' ';
			char child = firstChild;
			int totalCount = 0;
			int twoChilds = 0, threeChilds = 0, fourOrMoreChilds = 0; // Counts the families
			// Each "for" creates one scenario
			for (int t = 0; t < T; t++) {
				// The "while" counts how many children until at least
				// one of each gender.
				firstChild = generator.nextDouble() > 0.5 ? 'b' : 'g'; // TODO: A local variable should be declared close to the place in the code in which it is used
																	   // Just could to declare it here
				while (!isOneOfEach) {
					child = generator.nextDouble() > 0.5 ? 'b' : 'g';
					if (child != firstChild) {
						isOneOfEach = true;
					}
					countChildrenPerRun += 1;
				}
				// Count families
				if (countChildrenPerRun == 2) twoChilds++;
				else if (countChildrenPerRun == 3) threeChilds++;
				else if (countChildrenPerRun > 3) fourOrMoreChilds++;
				totalCount += countChildrenPerRun;
				// Reset before next run
				isOneOfEach = false;
				countChildrenPerRun = 1;
			}
			double average = (double) (totalCount) / T;
			String mostCommon = "";
			if (twoChilds >= threeChilds && twoChilds >= fourOrMoreChilds) {
				mostCommon = "2";
			} else if (threeChilds >= twoChilds && threeChilds >= fourOrMoreChilds) {
				mostCommon = "3";
			} else {
				mostCommon = "4 or more";
			}
			System.out.println("Average: " + average +
								" children to get at least one of each gender.");
			System.out.println("Number of families with 2 children: " + twoChilds);
			System.out.println("Number of families with 3 children: " + threeChilds);
			System.out.println("Number of families with 4 or more children: " +
								fourOrMoreChilds);
			System.out.println("The most common number of children is " +
								mostCommon + ".");
		} // TODO: this is the correct place of curle braces!
} // TODO: this is the correct place of curle braces!