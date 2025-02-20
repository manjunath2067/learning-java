package com.learning.designpatterns.behavioral.observer;

interface Observable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
