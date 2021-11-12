package fr.ensma.a3.ia.jeu.actions;

public interface ITrouper {

    public void addCharacter(ITroupable character);
    public void suppCharacter(ITroupable character) throws Exception;
}
