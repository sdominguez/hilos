package com.threads;

public class Runner implements Runnable{

    public static void main(String[] args) {
        Thread runner1 = new Thread(new Runner('*'));
        Thread runner2 = new Thread(new Runner('+'));
        Thread runner3 = new Thread(new Runner('#'));
        Thread runner4 = new Thread(new Runner('-'));
        runner1.start();
        runner2.start();
        runner3.start();
        runner4.start();
    }

    private char c;
    private String progress;
    public Runner(char c){
        this.c = c;
        progress="";
    }

    @Override
    public void run() {
        int i = 1;

        while(i <= 20){
            progress+=c;
            System.out.println(progress);
            try {
                Thread.sleep(900L);
            } catch (InterruptedException e) {}
            i++;
        }

    }
}
