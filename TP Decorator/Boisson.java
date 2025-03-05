/**
 * Interface Boisson : définit les méthodes communes à toutes les boissons.
 * Toute boisson doit implémenter ces méthodes pour fournir une description et un coût.
*/

public interface Boisson {
    String description();
    double cout();
}