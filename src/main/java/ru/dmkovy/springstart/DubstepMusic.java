package ru.dmkovy.springstart;

public class DubstepMusic implements Music{
    // Фабричный метод: приватный конструктор и паблик статик метод для создания нового объекта
    private DubstepMusic() {}
    public static DubstepMusic getDubstepMusic() {
        return new DubstepMusic();
    }
    @Override
    public String getSong() {
        return "Heavy Artillery Bass Song";
    }

    public void doMyInit() {
        System.out.println("Doing initialization");
    }
    public void doMyDestroy() {
        System.out.println("Doing destruct");
    }
}
