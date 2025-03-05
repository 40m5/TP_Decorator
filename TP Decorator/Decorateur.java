/**
 * Classe abstraite Decorateur : sert de base pour tous les décorateurs.
 * Elle implémente l'interface Boisson et contient une référence à une Boisson.
 */

 public class Decorateur implements Boisson {
    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String description() {
        return boisson.description();
    }

    @Override
    public double cout(){
        return boisson.cout();
    }
    
}
