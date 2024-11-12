package com.movieflix.javachatapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        try {
            ExecutorService service = Executors.newSingleThreadExecutor();
            service.execute(() -> System.out.println("Hello World"));
            Future future = service.submit(() -> System.out.println("Hello World"));
            service.shutdown();
            while (!service.isTerminated()) {

                System.out.println("not terminated");
            }
            System.out.println(future.isDone());
        } finally {

        }

    }
}
