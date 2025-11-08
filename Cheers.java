
public class Cheers {
        public static void main(String[] args) {
	String userName = args[0];
        int userNumber = Integer.parseInt(args[1]);
        String anChars = "aefhilmnorsxAEFHILMNORSX";
        for (int i = 0; i < userName.length(); i++){
                char c = userName.charAt(i);
                if (anChars.indexOf(c) == -1){
                System.out.println("Give me a  " + Character.toUpperCase(c) + ": " + Character.toUpperCase(c) + "!");      
                } else {
                        System.out.println("Give me an " + Character.toUpperCase(c) + ": " + Character.toUpperCase(c) + "!");
                }
                }
                System.out.println("What does that spell?");
                for (int a = 0; a < userNumber; a++){
                        System.out.println(userName.toUpperCase() + "!!!");
                }
        }
        }

