
public class Person {

    private String name;

    public String getName(){
       return name;
    }
    public void setName(String newName){
         name = newName;
    }
    public void sayHello(){
        System.out.println(name);
    }


public Person(String name){
        this.name = name;
}

    public static void main(String[] args) {

//        Person user = new Person();
//        user.name = "in the jungle the mighty jungle the lion sleeps tonight";
//        System.out.println(user.name);


        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

}











