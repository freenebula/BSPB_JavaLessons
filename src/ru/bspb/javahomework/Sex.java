package ru.bspb.javahomework;

public enum Sex {
    MALE("Муж."),
    FEMALE("Жен.");

    Sex(String name){
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }

    @Override
    public  String toString() {
        return name;
    }
}
