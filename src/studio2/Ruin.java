package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Starting Amount:");
		int startAmount = in.nextInt();
		System.out.println("Enter probability that you win a single play:");
		double winChance = in.nextDouble();
		System.out.println("Enter win limit:");
		int winLimit= in.nextInt();
		System.out.println("Enter the number of day’s you’ll simulate:");
		int totalsimulationdays = in.nextInt();
		

		
		for(int i=0; i<totalsimulationdays; i++) {
			int money = startAmount;
			while (money< winLimit && money> 0) {
				int randomInt = (int)(Math.random()*100);
				if (randomInt < winChance ) {
					System.out.println("We win!");
					money++;
			
				}
				else {
					System.out.println("We lose!");
					money--;
				}
				
			}
	
			
		
			
		}
		
		
		

	}

}
