package com.kainos.java.interfaces;

public interface LaoudTalkable extends Talkable {
    @Override
    default void saySomething() {
        System.out.println(think().toUpperCase());
    }
}
