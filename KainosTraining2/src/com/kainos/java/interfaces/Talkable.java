package com.kainos.java.interfaces;

public interface Talkable {
    String think();

    default void saySomething(){
        System.out.println(think());
    }
}
