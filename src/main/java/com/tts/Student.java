package com.tts;
            // fields, constructors, methods, getters and setters, and @Overrides make a rich dynamic Class
public class Student extends Person {

    private Integer gradYear;
    private Boolean enrolled = false;

    public void enrolledStudent() {
        enrolled = true;
    }

    public Student(String name, Integer age, String location, Integer gradYear, Boolean enrolled) {
        // below is a reference to the Person constructor
        super(name, age, location);
        this.gradYear = gradYear;
        this.enrolled = enrolled;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public void setGradYear(Integer gradYear) {
        this.gradYear = gradYear;
    }

    public Boolean getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + super.getName() +
                ", gradYear= " + gradYear +
                ", enrolled= " + enrolled +
                '}';
    }
}
