package com.learning.designpatterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TvSetDriver {

    public static void main(String[] args) {

//       //  when we try to run this singleton class to run in a multithreaded environment
        ExecutorService executor = Executors.newFixedThreadPool(2); // no. of threads

        executor.execute(() -> TvSet.getTvSetInstance());
        executor.execute(() -> TvSet.getTvSetInstance());


//        //member 1
//        TvSet tvSet = TvSet.getTvSetInstance();
//
//        //member 2
//        TvSet tvSet2 = TvSet.getTvSetInstance();
//
//        System.out.println(tvSet);
//        System.out.println(tvSet2);

        /**
         * Notes:
         * Intent: Ensure a class has only one instance and provide a global point of access to it.
         *
         * -> Database connection pool in an application. You want to ensure there's only one connection pool shared across
         * the entire application to manage database connections efficiently.
         *
         * public class DatabaseConnection {
         *     private static DatabaseConnection instance;
         *
         *     private DatabaseConnection() {
         *         // private constructor
         *     }
         *
         *     public static synchronized DatabaseConnection getInstance() {
         *         if (instance == null) {
         *             instance = new DatabaseConnection();
         *         }
         *         return instance;
         *     }
         * }
         *
         *
         * Achieved:
         * 1. guaranteed one instance
         *
         */
    }

}
