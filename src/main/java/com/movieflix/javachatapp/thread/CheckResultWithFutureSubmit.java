package com.movieflix.javachatapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CheckResultWithFutureSubmit {
    private static int counter = 0;
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> future = service.submit(() -> {
                for (int i = 0; i < 1_000_000; i++) {
                    counter++;
                }
            });
            future.get(10, TimeUnit.NANOSECONDS);
            System.out.println("Reached counter: " + counter);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Not reached " + counter);
        } finally {
            service.shutdown();
        }
    }
}
