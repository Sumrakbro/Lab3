package com.company;

import static java.lang.Thread.sleep;

class Rivers extends  Objects{
String denomination;
Rivers(String denomination){
    this.denomination=denomination;
    this.designation=denomination;
}
protected void flow(Act_Stat flow_stat) throws InterruptedException {
System.out.println(this.denomination+" flows "+flow_stat);
sleep(3000);
}
    @Override
    public int hashCode() {
        int result = denomination.hashCode() * 31;
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
        Rivers river=(Rivers) obj;
        return  this.denomination==river.denomination;
    }
}
