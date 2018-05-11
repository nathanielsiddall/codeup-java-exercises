import java.util.ArrayList;
import java.util.Random;

public class grades {

    static class Student{

        String name;
        ArrayList<Integer> grade = new  ArrayList<>();

        public String getName() {
            return name;
        }

        Student(String conName, int conGrade){
            name = conName;
            grade.add(conGrade);
        } /*constructor*/

        public double getGradeAverage() {

            double total = 0;
            for (int i = 0; i <= this.grade.size() - 1; i++) {
                total += this.grade.get(i);
            }
             return total / this.grade.size();
        }

        public void setGrade(int input) {

            this.grade.add(input);
        }

        public int rando(int min, int max){
            Random rand = new Random();
            return rand.nextInt(max) + min;
        }
    }
    public static void main(String[] args) {
            Student bubba = new Student("bubba", 78);

            for (int i = 0; i < 10000; i++){
                bubba.setGrade(bubba.rando(1, 100));
            }
//           System.out.println(bubba.grade);
        System.out.println(bubba.getGradeAverage());


    }
}
