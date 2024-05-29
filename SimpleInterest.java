import java.util.* ;
import java.io.*; 

class SimpleInterest {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);

		double pAmt = sc.nextDouble();
		double rate = sc.nextDouble();
		int time = sc.nextInt();

		double si = (pAmt*rate*time)/100;
		System.out.println((int)si);

	}
}
