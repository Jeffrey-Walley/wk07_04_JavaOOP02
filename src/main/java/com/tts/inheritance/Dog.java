package com.tts.inheritance;

public class Dog extends Animal {

    @Override
    public void doSpeak() {
       //  super.doSpeak();         // super shows that it is pointing to the parent
        System.out.println("Bow Wow WoW");
    }
}
