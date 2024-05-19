package builderPattern;

public class Main {
    public static void main(String[] args) {
        Director directorObj1 = new Director(new EngineeringStudentBuilder());
        Director directorObj2 = new Director(new EngineeringStudentBuilder());

        Student engineeringStudent = directorObj1.createEngineeringStudent();
        Student mbaStudent = directorObj2.createMBAStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
