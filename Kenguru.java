package com.company;

import static java.lang.Thread.sleep;

class Kenguru extends Characters{
    Kenguru(String name, double borntime, Sex sex) {
        super(name, borntime, sex);
    }
    public void squek(String s) {
        System.out.println(s);
    }
    public void jump(Act_Stat act_stat) throws InterruptedException {
        System.out.print(this.name + " jump " + act_stat);
        this.squek(" Stick, stick, hurry! Stick, stick, hurry!");
        sleep(1000);
    }
}
