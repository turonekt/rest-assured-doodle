package com.kainos.java.interfaces;

public class Main {
    public static void main(String[] args){
        Drum drum = new Drum();
        Guitar guitar = new Guitar();

        Instrumental[] instruments = new Instrumental[] {drum, guitar};

        for (Instrumental instrument:instruments){
            instrument.play();
        }
    }
}
