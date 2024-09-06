package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Runner('*'));
        executorService.execute(new Runner('-'));
        executorService.execute(new Runner('#'));
        executorService.shutdownNow();
    }
}
