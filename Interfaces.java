package com.company;

interface Interection {
    abstract void lookAt(Objects object, Act_Stat act_stat ) throws InterruptedException;
    abstract void see(Objects object) throws InterruptedException;
    abstract  void throwItem(Items item,Objects purpose);
}
interface Actions {
    abstract void dash(String s,Act_Stat act_stat);
    abstract void Wait(Characters... character) throws InterruptedException;

}

interface ObjectsAction{
    abstract void Fall(Objects purpose);
    abstract void Drift() throws InterruptedException;

}