package com.movieflix.javachatapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {

            System.out.println("begin");
            executorService.execute(() -> System.out.println("hello"));
            executorService.execute(() -> System.out.println("world"));
            executorService.execute(() -> System.out.println("java"));
            System.out.println("end");
        } finally {
            executorService.shutdown();
        }
    }
}
