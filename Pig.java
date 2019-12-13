package com.company;

class Pig extends Characters{
    Pig(String name, double borntime, Sex sex) {
        super(name, borntime, sex);
    }

    @Override
    public void worry(Act_Stat act_stat) {
        System.out.println(this.name + " " + act_stat + " worried");
    }

}
