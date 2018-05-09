package util;

import java.util.Scanner;

public class Input {

    private String scanner;

    static String  getString(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static Boolean yesNo(String input){
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("yeah");
    }

    static int getInt(int min, int max){
        System.out.println("provide a number between " + min + " " + max);

        String rawData = getString();
        int num = Integer.parseInt(rawData);

        if (num < max && num > min){
            return num;
        }
        else {
            getInt(min, max);
        }


        return 1776;
    }

    static double getDouble(double min, double max){
        System.out.println("provide a decimal number between " + min + " " + max);

        String rawData = getString();
        double num = Double.parseDouble(rawData);

        if (num < max && num > min){
            return num;
        }
        else {
            getDouble(min, max);
        }


        return 1776;
    }

    public static void main(String[] args) {

//           boolean thing = yesNo(input);
//
//            if (thing){
//                System.out.println("this worked");
//            }else {
//                System.out.println("NOPE");
//            }
//
//       int thing = getInt(1, 10);
//
//        System.out.println(thing);

       double thing = getDouble(1, 10);

        System.out.println(thing);





    }
}
