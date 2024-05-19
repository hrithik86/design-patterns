package builderPattern;

import java.util.List;

public class Student {
    String name;
    String fatherName;
    String motherName;
    Integer rollNumber;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.name=studentBuilder.name;
        this.fatherName=studentBuilder.fatherName;
        this.motherName=studentBuilder.motherName;
        this.rollNumber=studentBuilder.rollNumber;
        this.subjects=studentBuilder.subjects;
    }
}
