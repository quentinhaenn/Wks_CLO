package fr.ensma.a3.ia.jeu.AliveElement;

import fr.ensma.a3.ia.jeu.AbstractGameElement;
import fr.ensma.a3.ia.jeu.actions.*;
import fr.ensma.a3.ia.jeu.base.Base;

import java.util.Objects;

public abstract class AbstractAliveElement
        extends AbstractGameElement
        implements IAliveElement ,
        IMovable,
        ITroupable{
    protected float hp;
    protected String id;

    public IEtatPerso getEtatCourant() {
        return etatCourant;
    }

    public void setEtatCourant(IEtatPerso newEtat) {
        this.etatCourant = newEtat;
    }

    public IEtatPerso getRest() {
        return rest;
    }

    public IEtatPerso getInMove() {
        return inMove;
    }

    protected IEtatPerso etatCourant;
    protected IEtatPerso rest;
    protected IEtatPerso inMove;

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
        etatCourant = new Rest(this);
        rest = new Rest(this);
        inMove = new InMove(this);

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
    public void Move() throws Exception {
        moveState.Move();
    }
}
