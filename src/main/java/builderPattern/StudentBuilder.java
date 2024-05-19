package builderPattern;

import java.util.List;

public abstract class StudentBuilder {
    String name;
    String fatherName;
    String motherName;
    Integer rollNumber;
    List<String> subjects;

    public StudentBuilder setName(String name) {
        this.name= name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName= fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName= motherName;
        return this;
    }

    public StudentBuilder setRollNumber(Integer rollNumber) {
        this.rollNumber= rollNumber;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student Build() {
        return new Student(this);
    }
}
