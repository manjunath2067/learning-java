package com.learning.designpatterns.behavioral.observer;

interface Observer {

    void update(
          int temperature,
          int humidity,
          int pressure
    );

}
