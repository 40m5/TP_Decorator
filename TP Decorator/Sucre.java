/**
 * Classe Sucre : un décorateur qui ajoute du sucre à une boisson.
 * Elle étend la classe abstraite Decorateur.
 */

public class Sucre extends Decorateur {
    public Sucre(Boisson boisson){
        super(boisson);
    }

    @Override
    public String description(){
        return boisson.description() + ", Sucre";
    }

    @Override
    public double cout(){
        return boisson.cout() + 0.2; // Ajoute 0.2€ pour le sucre

    }
    
}
