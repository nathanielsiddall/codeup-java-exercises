import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        boolean io = false;

        while (!io) {
            System.out.println("Say Something to Bob");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String response = "";


            if (input.endsWith("?")) {
                response = "Sure";
            } else if (input.length() < 1) {
                response = "fine, be that way!";
            } else if (input.equals(input.toUpperCase())) {
                response = "Whoa, chill out!";
            } else response = "Whatever";

            System.out.println(response);
            System.out.println("do you want to talk to bob?");
            String ioSwitch = sc.nextLine();
            if (ioSwitch.equalsIgnoreCase("n")){
                io = true;
            }
        }
    }
}





//    Create a class Bob for the following exercise with a main method.
// Bob is a lackadaisical teenager. In conversation, his responses are
// very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says '' if you address him without actually
// saying anything.
//
//        He answers 'Whatever.' to anything else.
