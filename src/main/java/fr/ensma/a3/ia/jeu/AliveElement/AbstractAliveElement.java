package fr.ensma.a3.ia.jeu.AliveElement;

import fr.ensma.a3.ia.jeu.AbstractGameElement;

public abstract class AbstractAliveElement extends AbstractGameElement {
    protected float hp;

    public AbstractAliveElement(String id, float newHp){
        super(id);
        hp = newHp;
    }

    public float getHp() {
        return hp;
    }
}
