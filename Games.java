package com.company;

abstract class Games {
    String title;
Characters[] command;

    public void setCommand(Characters[] command) {
        this.command = command;
    }
    abstract protected String GetWinner(Timer... players_timer);

    abstract protected void start(Characters player) throws InterruptedException;

    abstract protected void end() throws InterruptedException;

    @Override
    public int hashCode() {
        int result = title.hashCode() * 31;
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
Games game=(Games) obj;
        return  this.title==game.title;
    }
}