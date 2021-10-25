package fr.ensma.a3.ia.jeu.InanimateElement;

import fr.ensma.a3.ia.jeu.AbstractGameElement;
import fr.ensma.a3.ia.jeu.base.Base;

public class AbstractInanimateElement
        extends AbstractGameElement
        implements IObject{

    protected float resistance;
    protected String id;

    public AbstractInanimateElement(Base base, String newId, float newResistance) {
        super(base);
        this.base.addObject(this);
        id = newId;
        resistance = newResistance;
    }

    public AbstractInanimateElement(Base base) {
        super(base);
    }

    @Override
    public String GetObjectId() {
        return id;
    }
}
