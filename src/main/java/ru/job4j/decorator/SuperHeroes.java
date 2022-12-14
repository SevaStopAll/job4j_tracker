package ru.job4j.decorator;

public class SuperHeroes {

    public static void main(String[] params) {
        SuperHero firstHero = new SuperAgility(new SuperIntelligence(new GreenSuperHero()));
        SuperHero secondHero = new SuperPower(new SuperAgility(new RedSuperHero()));
        printInfo(firstHero);
        printInfo(secondHero);

        fight(firstHero, secondHero);
    }

    private static void fight(SuperHero first, SuperHero second) {
        if (first.getChanceOfSurvival() > second.getChanceOfSurvival()) {
            printAlive(first);
        } else if (second.getChanceOfSurvival() > first.getChanceOfSurvival()) {
            printAlive(second);
        } else {
            System.out.println("Шансы на выживание равны");
        }
    }

    private static void printInfo(SuperHero superHero) {
        System.out.printf("У супергероя `%1$s` шанс на выживание равен %2$d", superHero.getDescription(), superHero.getChanceOfSurvival());
    }

    private static void printAlive(SuperHero superHero) {
        System.out.printf("Выживет супергерой `%1$s`", superHero.getDescription());
    }
}
