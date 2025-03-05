/**
 * Classe Cafe : représente une boisson de base, ici un simple café.
 * Elle implémente l'interface Boisson.
 */

 public class Cafe implements Boisson {
    @Override
    public String description(){
        return "Café";
    }

    @Override
    public double cout(){
        return 1.0; //Prix de base du café
    }

    
}


