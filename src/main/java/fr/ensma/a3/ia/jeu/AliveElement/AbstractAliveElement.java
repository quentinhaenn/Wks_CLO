package fr.ensma.a3.ia.jeu.AliveElement;

import fr.ensma.a3.ia.jeu.AbstractGameElement;
import fr.ensma.a3.ia.jeu.actions.IMovable;
import fr.ensma.a3.ia.jeu.actions.ITroupable;
import fr.ensma.a3.ia.jeu.actions.Immobile;
import fr.ensma.a3.ia.jeu.base.Base;

import java.util.Objects;

public abstract class AbstractAliveElement
        extends AbstractGameElement
        implements IAliveElement ,
        IMovable,
        ITroupable{
    protected float hp;
    protected String id;

    public void setMoveState(IMovable moveState) {
        this.moveState = moveState;
    }

    protected IMovable moveState;

    public AbstractAliveElement(Base base, String newId, float newHp){
        super(base);
        this.base.addAliveElement(this);
        hp = newHp;
        id = newId;
        moveState = new Immobile();
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

    @Override
    public void alarm() {
        System.out.println("Nous sommes attaqués! Tous à la base!\n");
    }

    @Override
    public String introduceYou(){
        return toString();
    }

    @Override
    public void Move(){
        moveState.Move();
    }
}
