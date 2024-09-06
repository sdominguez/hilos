package com.threads;

public class Task extends Thread{

    @Override
    public void run() {
        int a = 20;
        while(a>=0){
            System.out.println(a+" Hello guys!");
            a--;
        }
    }

    public static void main(String[] args) {
        Task task  = new Task();
        task.start();
    }
}
