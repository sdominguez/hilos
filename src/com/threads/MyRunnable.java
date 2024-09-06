package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable implements Runnable{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.shutdown();
    }

    @Override
    public void run() {
        System.out.println("Hilo en ejecución");
    }
}
