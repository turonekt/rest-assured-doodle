package com.kainos.java.trainings.enums;

public enum ShirtSize {
    S("small", 87,92),
    M("medium", 93, 96),
    L("large", 97, 102),
    XL("extra large", 103, 112);

    private final String name;
    private final int minChestSize;
    private final int maxChestSize;

    ShirtSize(String name, int minChestSize, int maxChestSize) {
        this.name = name;
        this.minChestSize = minChestSize;
        this.maxChestSize = maxChestSize;
    }

    public int getMinChestSize() {
        return minChestSize;
    }

    public int getMaxChestSize() {
        return maxChestSize;
    }

    public static void main(String[] args) {
        ShirtSize s = ShirtSize.S;

        System.out.println(s.getMaxChestSize());
        System.out.println(ShirtSize.S.getMaxChestSize());
    }
}


