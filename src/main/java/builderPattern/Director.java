package builderPattern;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        } else return null;
    }

    public Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setName("Hrithik").setSubjects().Build();
    }

    public Student createMBAStudent() {
        return studentBuilder.setRollNumber(2).setName("Abc").setFatherName("Def").setMotherName("ghi").setSubjects().Build();
    }
}
