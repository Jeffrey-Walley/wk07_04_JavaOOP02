package com.tts;
import com.tts.Person;
import com.tts.inheritance.Animal;             // importing that Animal
import com.tts.inheritance.Dog;

import java.util.List;

/* think of a Class as a template for objects
     Classes are composed of:
     - instance variables (properties, boolean) <aka Fields>
     - constructors -- looks like a method, but has NO return
     - methods (actions)

access modifiers:
    private - only in the class they are declared
    public - can be called from anywhere in the program
    protected -
    final -

*/
public class Main {
    public static void main(String[] args) {

        String myString = "Hello World";
        System.out.println(myString.getClass());           // will return the Class Type

        Person trelvyn = new Person("Trelvyn", 6, "Spain");
        Person jimmel = new Person("Jimmel", 15, "Syrupsport");
        Person ra = new Person("Ra");
        Person catDog = new Person();

        System.out.println(trelvyn.getName());
        System.out.println(jimmel.getName());

        // println immediately invokes an objects 'toString()' method
        System.out.println(trelvyn);                     // this returns the class and memory hascode
                // after adding @Override annotation on Person Class it now returns "Person{name='Trelvyn, age=6}"
        System.out.println(jimmel);
        System.out.println(ra);
        System.out.println(catDog);

   // using com.tts.inheritance.Animal
     Dog myDog = new Dog();
       myDog.doSpeak();                     // calls 'doSpeak()' method from Dog ('Bow Wow Wow')

    trelvyn.sayHello();
    trelvyn.sayHello(jimmel.getName());
        System.out.println(trelvyn.getName() + " will be " + trelvyn.ageNextYear() + " years old next year.");

    // Book Example

    Book myBook = new Book();
    Book otherBook = new Book();
    myBook.author = "RL Stine";
        System.out.println(myBook.author);              // give RL Stine, which we inputed as the author value
        System.out.println(otherBook.author);           // gives Hemingway, which is default author

        Student me = new Student("Me",
                45,
                "Detroit",
                2023,
                false);

        System.out.println(me);

        // List<Student> studentList = new ArrayList<>();

        List<Student> studentList = List.of(
                new Student("Slim", 18, "USA", 2030, true),
                new Student("Clamp", 16, "Bossier-City", 2024, true),
                new Student("Jeebers", 12, "this Plane", 2024, true)
        );

      //  studentList.forEach(el -> el.setEnrolled(false));     // set all the enrolled to 'false'
      //   System.out.println(studentList);

        studentList                         // this is the 'newer' method to writing code, does same thing as a for loop
                .stream().filter(el -> el.getEnrolled())
                .forEach(el -> System.out.println(el));    // does the same thing

        // this does the same thing
        for (Student element : studentList) {
            System.out.println(element);
        }
    }
}
