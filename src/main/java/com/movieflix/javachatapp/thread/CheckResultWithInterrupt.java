package com.movieflix.javachatapp.thread;

public class CheckResultWithInterrupt {

    private static int counter = 0;

    public static void main(String[] args) {
        final var mainThread = Thread.currentThread();
        new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter++;
            }
            mainThread.interrupt();
        }).start();

        while (counter < 1_000_000) {
            System.out.println("Not reached yet: " + counter);
            try {
                Thread.sleep(1);  // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!:  "  + counter);
            }
        }
        System.out.println("Reached counter: " + counter);
    }

}
