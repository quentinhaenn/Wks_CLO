package fr.ensma.a3.ia.jeu.InanimateElement;

import fr.ensma.a3.ia.jeu.AbstractGameElement;

public class AbstractInanimateElement
        extends AbstractGameElement
        implements IObject{

    protected float resistance;
    protected String id;

    public AbstractInanimateElement(String newId, float newResistance) {
        id = newId;
        resistance = newResistance;
    }

    @Override
    public String GetObjectId() {
        return id;
    }
}
