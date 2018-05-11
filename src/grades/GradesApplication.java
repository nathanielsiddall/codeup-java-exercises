package grades;
import java.util.HashMap;


public class GradesApplication extends uiApp   {

    public static void main(String[] args) {

        HashMap<String, newStudent> students = new HashMap<>();
            students.put("alice", new newStudent("alice", 42));
            students.put("bubba", new newStudent("bubba", 89));
            students.put("charlie", new newStudent("charlie", 67));
            students.put("Portia", new newStudent("Portia", 32));
            students.put("Jerrica", new newStudent("Jerrica", 32));
            students.put("Tess", new newStudent("Tess", 32));
            students.put("Hipolito", new newStudent("Hipolito", 32));
            students.put("Adrianna", new newStudent("Adrianna", 32));
            students.put("Shasta", new newStudent("Shasta", 32));
            students.put("Debroah", new newStudent("Debroah", 32));
            students.put("Loyd", new newStudent("Loyd", 32));
            students.put("Jc", new newStudent("Jc", 32));
            students.put("Edra", new newStudent("Edra", 32));
            students.put("Bobbi", new newStudent("Bobbi", 32));
            students.put("Latarsha", new newStudent("Latarsha", 32));
            students.put("Soraya", new newStudent("Soraya", 32));
            students.put("Emmie", new newStudent("Emmie", 32));
            students.put("Sparkle", new newStudent("Sparkle", 32));
            students.put("Krishna", new newStudent("Krishna", 32));
            students.put("Jarred", new newStudent("Jarred", 32));
            students.put("Florida", new newStudent("Florida", 32));
            students.put("Cathleen", new newStudent("Cathleen", 32));
            students.put("Teodora", new newStudent("Teodora", 32));
            students.put("Kyoko", new newStudent("Kyoko", 32));
            students.put("Vicky", new newStudent("Vicky", 32));
            students.put("Bernard", new newStudent("Bernard", 32));
            students.put("Fredrick", new newStudent("Fredrick", 32));
            students.put("May", new newStudent("May", 32));//data for the hashmap.

        uiApp ui = new uiApp();

//        System.out.println(students.get("alice").getGradeAverage());

        for (String name : students.keySet()) {
            students.get(name).loadGrades();
        }
        Object keyRing = students.keySet();
        ui.setKeys(keyRing);
        ui.ui();


        for ( String name : students.keySet()){
            System.out.println("grades for " + name);
            System.out.println(students.get(name).getGrade());
        }
    }
}
