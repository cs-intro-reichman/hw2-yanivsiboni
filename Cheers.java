
public class Cheers {
        public static void main(String[] args) {
	String userName = args[0];
        int userNumber = Integer.parseInt(args[1]);
        String anChars = "aefhilmnorsxAEFHILMNORSX";
        for (int count = 0; count < userName.length(); count++){
                char c = userName.charAt(count);
                if (anChars.indexOf(c) == -1){
                System.out.println("Give me a  " + Character.toUpperCase(c) + ": " + Character.toUpperCase(c) + "!");      
                } else {
                        System.out.println("Give me an  " + Character.toUpperCase(c) + ": " + Character.toUpperCase(c) + "!");
                }
                }
                System.out.println("What does that spell?");
                for (int a = 0; a < userNumber; a++){
                        System.out.println(userName.toUpperCase() + "!!!");
                }
        }
        }

