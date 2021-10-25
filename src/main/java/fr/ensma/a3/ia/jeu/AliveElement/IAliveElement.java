package fr.ensma.a3.ia.jeu.AliveElement;

public interface IAliveElement {

    default String GetId() {
        return null;
    }

    public default void alarm() {}
}
