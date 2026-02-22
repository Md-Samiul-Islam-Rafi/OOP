class Student {

    // properties/variables
    String versity;
    String name;
    int id;
    String section;
    double cgpa;

    // constructor
    Student(String versity, String name, int id, String section, double cgpa) {
        this.versity = versity;
        this.name = name;
        this.id = id;
        this.section = section;
        this.cgpa = cgpa;
    }

    // method
    void Study() {
        System.out.println(name + " is now studying at this time.");
    }

    void ShowDetails() {
        System.out.println("Student University: " + versity);
        System.out.println("Student Name: " + name);
        System.out.println("Student Id: " + id);
        System.out.println("Student Section: " + section);
        System.out.println("Student CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(
                "Daffodil International University", 
                "Samiul",
                24135430,
                "G",
                3.33);

        s1.ShowDetails();
        s1.Study();
    }
}
