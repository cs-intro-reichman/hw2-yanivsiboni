// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int userNumber = Integer.parseInt(args[0]);
	String mode = args[1];

	for (int i = 1; i <= userNumber; i++){
		int steps = 1;
		long number = i;

		if (mode.equals("v")){
	System.out.print(number);
		}
		
		while (number != 1){
			if (number % 2 == 0) {
				number = number / 2;
			} else {
			number = number * 3 + 1;
			}
			steps++;
			
			if(mode.equals("v")){
				System.out.print(" " + number);
			}
			
	}
	if (mode.equals("v"))	{
System.out.println(" (" + steps + ")");
	}
}
System.out.println("Every one of the first " + userNumber + " hailstone sequences reached 1.");
}
}