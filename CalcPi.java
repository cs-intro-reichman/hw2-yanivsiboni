// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   int userNumber = Integer.parseInt(args[0]);
	   double pi = 0;
	   for (int i = 0; i < userNumber; i++){
	   pi = pi + Math.pow((-1), i) / ((2 * i) + 1);
	   }
	   pi = pi * 4;

	   System.out.println("pi according to Java: " + Math.PI);
	   System.out.println("pi, approximated:    " + pi);

	}
}
