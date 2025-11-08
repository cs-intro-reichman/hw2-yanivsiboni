//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	String userName = args[0];
        int userNumber = Integer.parseInt(args[1]);
        int index = 0;
        String anChars = "aefhilmnorsxAEFHILMNORSX";
        int count = 0;
        while (count < userNumber + 1){
                char c = userName.charAt(index);
                if (anChars.indexOf(c) == -1){
                System.out.println("Give me a " + Character.toUpperCase(c) + ": " + Character.toUpperCase(c) + "!");      
                } else {
                        System.out.println("Give me an " + Character.toUpperCase(c) + ": " + Character.toUpperCase(c) + "!");
                }
                count++;
                index++;
                }
                System.out.println("What does that spell?");
                for (int a = 0; a < userNumber + 1; a++){
                        System.out.println(userName.toUpperCase() + "!!!");
                }
        }
        }

