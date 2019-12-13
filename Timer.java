package com.company;

class Timer {
    double start;
    double end;
    Characters owner;
    Timer(Characters character){
        this.owner=character;
    }
    Timer(){

    }
    public void setStart(double start) {
        this.start = start;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public double getEnd() {
        return this.end;
    }

    public double getStart() {
        return this.start;
    }
    @Override
    public int hashCode() {
        int result = owner.hashCode() * 31;
        return result;
    }
}
