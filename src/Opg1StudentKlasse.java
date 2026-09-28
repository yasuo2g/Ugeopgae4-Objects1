public class Opg1StudentKlasse {
    String name;
    int age;
    String studentID;

    public Opg1StudentKlasse(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Opg1StudentKlasse(String name, int age, String studentID){
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }
    public void printInfo(){
        System.out.println(name + " er " + age + " år");
        if (studentID != null){
            System.out.println("  ID: " + studentID);
        }
    }
}
