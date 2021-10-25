package fr.ensma.a3.ia.jeu.AliveElement;

import fr.ensma.a3.ia.jeu.AbstractGameElement;

import java.util.Objects;

public abstract class AbstractAliveElement
        extends AbstractGameElement
        implements IAliveElement {
    protected float hp;
    protected String id;

    public AbstractAliveElement(String newId, float newHp){
        hp = newHp;
        id = newId;
    }

    public float getHp() {
        return hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractAliveElement)) return false;
        AbstractAliveElement that = (AbstractAliveElement) o;
        return Float.compare(that.getHp(), getHp()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp());
    }

    @Override
    public String toString() {
        return "AbstractAliveElement{" +
                "hp=" + hp +
                '}';
    }

    @Override
    public String GetId() {
        return this.id;
    }
}
