public class StringExercise {
    public static void main(String[] args) {

        Quote();
    }
    private static void Quote() {
        String message = "this is a thing";

        for (int i = 0; i < 6; i++) {
            switch (i){
                case 0: message = "We don't need no education";
                    break;
                case 1: message = "We don't need no thought control";
                    break;
                case 2: message = "Check \"this\" out!, \"s inside of \"s!";
                    break;
                case 3: message = "In windows, the main drive is usually C:\\";
                    break;
                case 4: message = "I can do backslashes \\, double backslashes \\\\,";
                    break;
                case 5: message = "and the amazing triple backslash \\\\\\!\n";
                    break;

            }System.out.println(message);
        }
    }
}
