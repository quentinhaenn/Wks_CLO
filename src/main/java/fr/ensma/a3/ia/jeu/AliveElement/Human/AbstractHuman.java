package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.AliveElement.AbstractAliveElement;
import fr.ensma.a3.ia.jeu.actions.IMovements;
import fr.ensma.a3.ia.jeu.base.Base;


import java.util.logging.Logger;

public abstract class AbstractHuman
        extends AbstractAliveElement
        implements IMovements {

    private static final Logger LOGGER = Logger.getLogger(AbstractHuman.class.getName());

    public AbstractHuman(Base base, String id, float newHp) {
        super(base, id, newHp);
    }

    public String Talk(AbstractHuman interlocutor, String sentence){
        return "Je parle à :" + interlocutor.toString() + "et je lui dit : \n" + sentence;
    }

    @Override
    public void Move() {
        System.out.println("Je marche! \n");
    }

}
