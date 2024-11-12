package com.movieflix.javachatapp.thread;

public class CreateAThread {

    public static void main(String[] args) {
        Runnable printInventory = () -> System.out.println("Inventory");
        Runnable printRecords = ()-> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Records: " + i);
            }
        };

        System.out.println("begin");

        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();

        System.out.println("end");


    }
}


