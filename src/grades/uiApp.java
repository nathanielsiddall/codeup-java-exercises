package grades;

public class uiApp extends newStudent  {

    private Object keys;

    uiApp() {
        super("", 0);
    }


    public void setKeys(Object input){
         keys = input;
    }

    public void ui(){


       String input = super.getData("student data information system: ");
        switch (input) {
            case "-help":
                System.out.println("-names will output all the student names ");
                System.out.println("-grade  Search grade by student names");
                ui();
                break;
            case "-names":
                System.out.println(keys);
                ui();
                break;
            case "-grade":
                System.out.println(keys);
               String gradeName = getData("What Student?");

//                System.out.println(getGrade());
                ui();
                break;
            default:
                input = super.getData("command not found, do you wish to continue? ");
                if (input.equals("yes")) {
                    ui();
                }
                break;
        }
    }/*interacts with the user to access data*/


}