package com.company;

class Rabbit extends Characters{
    Rabbit(String name, double borntime, Sex sex) {
        super(name, borntime, sex);
    }
    public void command() {
        System.out.println("Throw!");
    }

    @Override
    public void protrude() {

    }


}
