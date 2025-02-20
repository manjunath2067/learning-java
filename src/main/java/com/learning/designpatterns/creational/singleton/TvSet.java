package com.learning.designpatterns.creational.singleton;

public class TvSet {

    // So whenever you are using flag kind of variable which is changed by one thread
    // and accessible by other threads, then we need to use the volatile keyword
    private static  TvSet tvSetInstance = null;

    /**
     * 1. make default constructor as private
     * 2. crate static creation method which acts as constructor, this method calls this private constructor to create object
     */
    private TvSet() {
        System.out.println("TvSet instance created");
    }

    //this is one for to handle to threads in multithreaded environment
    // but here why do we need synchronization for whole method
    // we can add to particular line of code which we want to be executed for the creating of new instances
    public static TvSet getTvSetInstance() {
        if (tvSetInstance == null) {
            tvSetInstance = new TvSet();
        }
        return tvSetInstance;
    }

    // this method now do the double-checking and call the creation of new instances
    // so now synchronised is there for particular line of code 32
    public static TvSet getTvInstances() {
        if (tvSetInstance == null) {            //optimisation
            synchronized (TvSet.class) {
                if (tvSetInstance == null)   // double checking
                {
                    tvSetInstance = new TvSet();
                }
            }
        }
        return tvSetInstance;
    }
}
