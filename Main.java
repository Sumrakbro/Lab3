package com.company;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bear bear = new Bear("Winnie Pooh", System.currentTimeMillis(), Sex.MALE);
        Pig pig = new Pig("Piglet", System.currentTimeMillis() - bear.borntime, Sex.MALE);
        Rabbit rabbit = new Rabbit("Rabbit", System.currentTimeMillis() - bear.borntime, Sex.MALE);
        Kenguru little_roo = new Kenguru("Little Roo", System.currentTimeMillis() - bear.borntime, Sex.MALE);
        nonsense nonsense = new nonsense("Nonsense");
        Rivers river = new Rivers("River");
        river.flow(Act_Stat.lazily);
        Sticks bear_stick = new Sticks("winnie pooh stick");
        Sticks Pig_stick = new Sticks("piglet stick");
        Sticks Little_roo_stick = new Sticks("little roo stick");
        Sticks rabbit_stick = new Sticks("rabbit stick");

        Timer Bear_timer = new Timer(bear);
        Timer Pig_timer = new Timer(pig);
        Timer Little_roo_timer = new Timer(little_roo);
        Timer rabbit_timer = new Timer(rabbit);
        Timer nonsense_timer = new Timer();

        nonsense.start(rabbit);
        nonsense_timer.setStart(System.currentTimeMillis());
        sleep(100);
        pig.throwItem(Pig_stick, river);
        Pig_timer.setStart(System.currentTimeMillis());
        sleep(100);
        bear.throwItem(bear_stick, river);
        Bear_timer.setStart(System.currentTimeMillis());
        little_roo.throwItem(Little_roo_stick, river);
        Little_roo_timer.setStart(System.currentTimeMillis());
        sleep(100);
        rabbit.throwItem(rabbit_stick, river);
        rabbit_timer.setStart(System.currentTimeMillis());
        Pig_stick.Fall(river);
        Pig_stick.Drift();
        pig.dash(" on the other side of the bridge", Act_Stat.scampering);
        pig.lookAt(river, Act_Stat.waiting);
        sleep(1);
        bear_stick.Fall(river);
        bear_stick.Drift();
        bear.dash(" on the other side of the bridge", Act_Stat.scampering);
        bear.lookAt(river, Act_Stat.waiting);
        Little_roo_stick.Fall(river);
        Little_roo_stick.Drift();
        little_roo.dash(" on the other side of the bridge ", Act_Stat.scampering);
        little_roo.lookAt(river, Act_Stat.waiting);
        sleep(1);
        rabbit_stick.Fall(river);
        rabbit_stick.Drift();
        rabbit.dash(" on the other side of the bridge ", Act_Stat.scampering);
        rabbit.lookAt(river, Act_Stat.waiting);
        little_roo.jump(Act_Stat.clockwork);
        little_roo.squek("Stick, stick, hurry! Stick, stick, hurry!");
        bear.Wait(pig, rabbit, little_roo);
        String s = ">";
        String s2 = "=";
        String s3 = null;
        sleep(5000);
        System.out.println("ONE ETERNITY LATER");
        sleep(2000);
        pig.see(Pig_stick);
        pig.worry(Act_Stat.terribly);
        nonsense.end();
        Pig_timer.setEnd(System.currentTimeMillis());
        nonsense_timer.setEnd(Pig_timer.end);
        Bear_timer.setEnd(System.currentTimeMillis());
        Little_roo_timer.setEnd(System.currentTimeMillis());
        rabbit_timer.setEnd(System.currentTimeMillis());

        Pig_timer.end = (nonsense_timer.end - nonsense_timer.start) - (Pig_timer.getEnd() - Pig_timer.getStart());
        Bear_timer.end = (nonsense_timer.end - nonsense_timer.start) - (Bear_timer.getEnd() - Bear_timer.getStart());
        Little_roo_timer.end = (nonsense_timer.end - nonsense_timer.start) - (Little_roo_timer.getEnd() - Little_roo_timer.getStart());
        rabbit_timer.end = (nonsense_timer.end - nonsense_timer.start) - (rabbit_timer.getEnd() - rabbit_timer.getStart());
        System.out.println(nonsense.GetWinner(Bear_timer, Pig_timer, Little_roo_timer, rabbit_timer));

    }
}
