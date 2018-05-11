package grades;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class newStudent {
    String name;
    ArrayList<Integer> grade = new  ArrayList<>();

    newStudent(String conName, int conGrade){
        name = conName;
        grade.add(conGrade);
    } /*constructor*/

    public double getGradeAverage() {

        double total = 0;
        for (int i = 0; i <= this.grade.size() - 1; i++) {
            total += this.grade.get(i);
        }
        return total / this.grade.size();
    } /*returns the average of the grade*/

    public String getData(String words){
        Scanner sc = new Scanner(System.in);
        System.out.print(words);
         return sc.nextLine();
    }/*returns the input from a system scanner*/

    public ArrayList<Integer> getGrade() {
        return grade;
    }/*returns the grade arraylist*/

    public void setGrade(int input) {

        this.grade.add(input);
    } /*adds a grade to the end of the grade array list*/

    public int rando(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max) + min;
    } /*returns a random number*/

    public void loadGrades(){

        for (int i = 0; i < 10; i++) {
            this.setGrade(this.rando(1, 100));
        }
    } /*uses a loop to create a series of grades.*/




}
