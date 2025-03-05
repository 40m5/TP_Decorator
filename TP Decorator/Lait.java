/**
 * Classe Lait : un décorateur qui ajoute du lait à une boisson.
 * Elle étend la classe abstraite Decorateur.
 */


public class Lait extends Decorateur {
    public Lait(Boisson boisson){
        super(boisson);
    }

@Override
public String description(){
    return boisson.description() + ", Lait";
}

@Override
public double cout(){
    return boisson.cout() + 0.5; // Ajoute 0.5€ pour le lait 
}

}
