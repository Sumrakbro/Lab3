package com.company;

import static java.lang.Thread.sleep;

class Sticks extends Items {

    Sticks(String designation) {
        super(designation);
    }

    @Override
    public void Fall(Objects purpose) {
        System.out.println(this.designation+" fell in " + purpose.designation);
    }

    @Override
    public void Drift() throws InterruptedException {
        System.out.println(this.designation + " drift");sleep(1000);
    }

    @Override
    public int hashCode() {
        int result = designation.hashCode() * 31;
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
        Sticks stick = (Sticks) obj;
        return this.designation == stick.designation;
    }
}
