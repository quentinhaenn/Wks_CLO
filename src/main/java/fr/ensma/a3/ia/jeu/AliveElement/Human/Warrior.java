package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.Catapult;
import fr.ensma.a3.ia.jeu.actions.IEarthAttack;
import fr.ensma.a3.ia.jeu.actions.IEarthAttacked;
import fr.ensma.a3.ia.jeu.actions.IMovements;
import fr.ensma.a3.ia.jeu.base.Base;

import java.util.Objects;

public class Warrior
        extends AbstractHuman
        implements IMovements,
        IEarthAttack,
        IEarthAttacked {
    private final int attackPower;
    private static int nbInstance = 0;
    private boolean isAssociated;
    private static final String newId = "Warrior_" + nbInstance + 1;

    public Warrior(Base base, String id, float newHp, int attack) {
        super(base, id, newHp);
        attackPower = attack;
        nbInstance ++;
    }

    public Warrior(Base base, float newHp, int attack){
        super(base,newId, newHp);
        attackPower = attack;
        nbInstance += 1;
    }

    public void Associate(Catapult catapult){
        if (!this.isAssociated){
            this.isAssociated = true;
            catapult.setAssociated(this);
        }
    }
    public boolean isAssociated(){
        return isAssociated;
    }

    public int getNbWarriors() {
        return nbInstance;
    }

    @Override
    public void Move() {
        super.Move();
    }

    @Override
    public String Talk(AbstractHuman interlocutor, String sentence) {
        return super.Talk(interlocutor, sentence);
    }

    @Override
    public void EarthAttack(IEarthAttacked target) {
        target.EarthAttacked(this.attackPower);
    }

    @Override
    public void EarthAttacked(int power) {
        this.hp -= power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior warrior)) return false;
        if (!super.equals(o)) return false;
        return attackPower == warrior.attackPower && isAssociated() == warrior.isAssociated();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), attackPower, nbInstance, isAssociated());
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "hp=" + hp +
                ", attackPower=" + attackPower +
                ", nbInstance=" + nbInstance +
                ", isAssociated=" + isAssociated +
                '}';
    }
}
