package com.company;

import static java.lang.Thread.sleep;

class nonsense extends Games {
    public nonsense(String title) {
        this.title = title;
    }

    @Override
    protected String GetWinner(Timer... players_timer) {
        double mintime = players_timer[1].end;
        int index = 1;
        for (int i = 0; i < players_timer.length; i++) {
            if (mintime > players_timer[i].end) {
                mintime = players_timer[i].end;
                index = i;
            }
        }
        return players_timer[index].owner + " win";
    }

    @Override
    protected void start(Characters player) throws InterruptedException {
        System.out.println(this.title + " start");
        System.out.print(player.name + ":");
        Rabbit playerr=(Rabbit)player;
        playerr.command();
        sleep(1000);
    }

    @Override
    protected void end() throws InterruptedException {
        System.out.println(this.title + " finish");sleep(3000);
    }
}
