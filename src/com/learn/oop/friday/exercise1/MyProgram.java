package com.learn.oop.friday.exercise1;

public class MyProgram {
    public static void main(String[] args) {

        Instrument flute = new Instrument();
        String sound = flute.makeASound();

        // System.out.println(sound);

        String makeASoundWithNote = flute.makeASoundWithNote(Notes.DO);
        System.out.println(makeASoundWithNote);
    }


}
