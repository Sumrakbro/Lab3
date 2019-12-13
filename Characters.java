package com.company;

import static java.lang.Thread.sleep;

abstract class Characters implements Interection, Actions {
    protected String name;
    protected double borntime;
    protected Sex sex;

    Characters(String name, double borntime, Sex sex) {
        this.name = name;
        this.borntime = borntime;
        this.sex = sex;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public void SetBorntime(double time) {
        this.borntime = time;
    }

    public double GetBorntime() {
        return this.borntime;
    }

    @Override
    public void lookAt(Objects object, Act_Stat act_stat) throws InterruptedException {
        System.out.println(this.name + " " + Act_Stat.waiting + " looks at " + object.designation);
    sleep(2000);

    }

    public void worry(Act_Stat act_stat) {
    }

    @Override
    public void throwItem(Items item, Objects purpose) {
        System.out.println(this.name + " throw " + item.designation + " " + purpose.designation);
    }

    @Override
    public void dash(String s, Act_Stat act_stat) {
        System.out.println(this.name + " " + act_stat + " rush" + s);
    }



    @Override
    public void Wait(Characters... character) throws InterruptedException {
        if (character.length > 1) {
            System.out.print(this.name);
            for (int i = 0; i < character.length; i++) {
                System.out.print(",");
                System.out.print(character[i].name + " ");
            }
            System.out.println(" are waiting");
    sleep(3000);
        }
    }

    public void see(Objects object) throws InterruptedException {
        System.out.println(this.name + " sees " + object.designation);
        sleep(1000);
    }

    public void protrude() {

    }

    @Override
    public int hashCode() {
        int result;
        result = 31 * this.name.hashCode();
        result = result * 31 + (int) this.borntime;
        result = result * 31 + this.sex.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Characters character = (Characters) obj;
        return (this.name == character.name)&(this.sex==character.sex)&(this.borntime==character.borntime);
    }

    @Override
    public String toString() {
        return name;
    }
}

