import java.util.Scanner;

public class ControlFlowExercises {
    private static void Grades() {
        System.out.println("what is the grade number?");
        Scanner sc = new Scanner(System.in);
        int grade = Integer.parseInt(sc.nextLine());

        if (grade > 100 || grade < 0){
            System.out.println("thats not a valid number");}
        else if (grade > 88){
            if (grade > 95){System.out.println("you got an A+");}
            else {System.out.println("You Got an A");}}
        else if (grade > 80){
            if (grade > 85){System.out.println("You Got an +");}
            else {System.out.println("You Got an B");}}
        else if (grade > 67){ System.out.println("You Got an C");}
        else if (grade > 60){System.out.println("You Got an D");}
        else if (grade > 59){System.out.println("You Got an F");}
        else if (grade < 59){System.out.println("Just get out");}
    }
    private static void Thingy() {



    }

    public static void main(String[] args) {
//        int x = 1;
//        int i = 0;
//        while (i <= 15){
//            i++;
//            System.out.println("you're at number: " + i);
//        }
//
//        do {
//
//            x *=  2;
//
//            System.out.println(x);
//
//        }while (x <= 100000);


//        for (int a = 0; a <= 100; a++){
//            System.out.println(a);
//
//            if (a % 5 == 0){
//                System.out.println("buzz");
//            }
//
//            if (a % 3 == 0) {
//                System.out.println("fizz");
//
//        }
//
//
//    }
//

//        System.out.println("enter an integer");
//        Scanner sc = new Scanner(System.in);
//        int num = Integer.parseInt(sc.nextLine());
//        System.out.println("number | squared | cubed");
//        System.out.println("-------|---------|------");
//        for (int i = 0; i != num + 1; i++){
//            int square = i * 2;
//            int cube = i * 3;
//            System.out.println("   " + i + "   |    " +  square  + "   |    " + cube + "  ");
//
//        }
        Grades();
        Thingy();



    }


}


