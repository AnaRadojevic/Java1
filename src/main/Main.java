package main;

import media.Radio;
import media.Television;

public class Main {

    public static void main(String[] args) {

        Television myTv = new Television();

        myTv.info();
        myTv.setcurrentProgram(5);
        myTv.setVolume(50);
        myTv.setTurnOn(true);

        myTv.info();

        myTv.setcurrentProgram(8);
        myTv.setVolume(30);
        myTv.setTurnOn(true);

//        System.out.println("Terenutni program je: " + myTv.getcurrentProgram());
//        System.out.println("Zvuk je: " + myTv.getVolume());
//        System.out.println("Ukljuceno: " + myTv.getturnOn());
//        System.out.println("Terenutni program je: " + myTv.getcurrentProgram());
//        System.out.println("Zvuk je: " + myTv.getVolume());
//        System.out.println("Ukljuceno: " + myTv.getturnOn());
        Radio myRadio = new Radio(100.4, 500, 'F');

        myRadio.info();
    }

}
