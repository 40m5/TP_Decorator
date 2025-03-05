/**
 * Classe Caramel : un décorateur qui ajoute du caramel à une boisson.
 * Elle étend la classe abstraite Decorateur.
 */


public class Caramel extends Decorateur {
    public Caramel(Boisson boisson){
        super(boisson);
    }

    @Override
    public String description(){
        return boisson.description() + ", Caramel";
    }

    @Override
    public double cout(){
        return boisson.cout() + 0.7; // Ajoute 0.7€ pour le caramel
    }
    
}
