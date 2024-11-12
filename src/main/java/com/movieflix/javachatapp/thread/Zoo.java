package com.movieflix.javachatapp.thread;

public class Zoo {
    public static void pause() {
        try {
            System.out.println("Thread started!");
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("Thread finished!");
        }
    }

    public static void main(String[] args) {
        var job = new Thread(()-> pause());
        job.start();
        System.out.println("Main method finished!");
    }
}
