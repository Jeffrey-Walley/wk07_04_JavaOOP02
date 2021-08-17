package com.tts;

// fields and methods!!

public class Person {


    // create constructors, getters and setters
    private String name;                // these are instance variables and belong to the object and not the class
    private Integer age;
    private String location;


    // person constructor  -- they get the party started!!!!  this is a standard constructor format
    public Person(String name, Integer age, String location) {
        // this is data-binding -- setting up the instance variables to be the same as the values passed as arguements in the constructor
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public void sayHello() {
        System.out.println("Hello, my name is, " + name);
    }

    public void sayHello(String name) {
        System.out.println("Hello there, " + name);   // overload of a method -- added a Sting 'name' to the parameter in this instance
    }

    public Integer ageNextYear() {
       // var is newer keyword in Java that allows you to forgo mentioning the variable type
        // var is only legal in 'local' scope
        var modifiedAge = age + 1;      // 'modifiedAge' is a local variable
       return modifiedAge;

        //  return age + 1;
    }

    public Person(String name) {
        this.name = name;
    }

    // this is a default / 'no args' constructor -- utilized heavily in Java Beans
    public Person() {

   }

// right click and choose generate both 'getters and setters'

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // @Override - an Annotation, represents metadata associated with what it is annotating
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", age=" + age +
                '}';
    }


}
