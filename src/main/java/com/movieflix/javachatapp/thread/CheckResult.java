package com.movieflix.javachatapp.thread;

public class CheckResult {

    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                System.out.println("Result: " + counter);
                counter++;
            }
        }).start();
        while (counter < 10_000) {
            System.out.println("Not reach yet");
            try {
                Thread.sleep(1_000);  // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reaching : " + counter);
    }


}
