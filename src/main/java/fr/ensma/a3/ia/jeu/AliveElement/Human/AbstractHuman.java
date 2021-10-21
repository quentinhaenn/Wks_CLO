package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.AliveElement.AbstractAliveElement;
import fr.ensma.a3.ia.jeu.actions.IMovements;

public abstract class AbstractHuman
        extends AbstractAliveElement
        implements IMovements {

    public AbstractHuman(String id, float newHp) {
        super(id, newHp);
    }

    public String Talk(AbstractHuman interlocutor, String sentence){
        return sentence;
    }
}
