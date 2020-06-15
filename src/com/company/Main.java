package com.company;

import com.company.creature.Person;

public class Main {
    public static void main(String[] args) {

        Sense sense = new Sense();
        sense.initSense();
        Ui.printWelcome(sense.getPerson());
        sense.play();


    }
}

