public class Opg1Main {

    public static Opg1StudentKlasse findOldest(Opg1StudentKlasse[] students) {
        Opg1StudentKlasse oldest = students[0];
        for(Opg1StudentKlasse s : students){
            if(s.age > oldest.age){
                oldest = s;
            }
        }
        return oldest;
    }

    public static Opg1StudentKlasse findByID(Opg1StudentKlasse[] students, String ID){
        for(Opg1StudentKlasse s : students){
            if(s.studentID != null && s.studentID.equals(ID)){
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args){
        Opg1StudentKlasse student1 = new Opg1StudentKlasse("Anna", 21);
        Opg1StudentKlasse student2 = new Opg1StudentKlasse("Peter", 19);
        Opg1StudentKlasse student3 = new Opg1StudentKlasse("Maria", 23);

        Opg1StudentKlasse[] students = {student1, student2, student3};

        System.out.println("Alle studerende:");
        for(Opg1StudentKlasse s : students){
            s.printInfo();
        }
        Opg1StudentKlasse oldest = findOldest((students));
        System.out.println("\nÆldste studerende:");
        oldest.printInfo();

        // Ekstra udfordring
        System.out.println("\n=== Med student ID ===");
        Opg1StudentKlasse st1 = new Opg1StudentKlasse("Anna", 21, "S001");
        Opg1StudentKlasse st2 = new Opg1StudentKlasse("Peter", 19, "S002");
        Opg1StudentKlasse st3 = new Opg1StudentKlasse("Maria", 23, "S003");

        Opg1StudentKlasse[] studentsWithID = {st1, st2, st3};

        Opg1StudentKlasse found = findByID(studentsWithID, "S002");
        if (found != null) {
            System.out.println("Fundet studerende med ID S002:");
            found.printInfo();
        }
    }
}
