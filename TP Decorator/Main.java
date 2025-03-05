/**
 * Classe Main : point d'entrée du programme.
 * Elle permet de tester le système de café personnalisable.
 */

public class Main {
    public static void main(String[] args) {
        // Crée un café de base
        Boisson boisson = new Cafe();
        System.out.println(boisson.description() + " : " + boisson.cout() + "€");

        // Ajoute du lait
        boisson = new Lait(boisson);
        System.out.println(boisson.description() + " : " + boisson.cout() + "€");

        // Ajoute du sucre
        boisson = new Sucre(boisson);
        System.out.println(boisson.description() + " : " + boisson.cout() + "€");

        // Ajoute du caramel
        boisson = new Caramel(boisson);
        System.out.println(boisson.description() + " : " + boisson.cout() + "€");
    }
}
