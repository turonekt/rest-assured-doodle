package com.kainos.java.interfaces;

public interface LoudTalkable extends Talkable {
    @Override
    default void saySomething() {
        System.out.println(think().toUpperCase());
    }
}
