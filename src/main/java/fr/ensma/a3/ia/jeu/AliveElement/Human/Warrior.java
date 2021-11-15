package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.DistanceWeapon.Catapult;
import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.MeleeWeapon.AbstractMeleeWeapon;
import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.MeleeWeapon.Axe;
import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.MeleeWeapon.Knife;
import fr.ensma.a3.ia.jeu.actions.*;
import fr.ensma.a3.ia.jeu.base.Base;

import java.util.Objects;

public class Warrior
        extends AbstractHuman
        implements IMovable,
        IEarthAttack,
        IEarthAttacked {
    private AbstractMeleeWeapon weapon;
    private static int nbInstance = 0;
    private boolean isAssociated;
    private static final String newId = "Warrior_" + nbInstance + 1;

    public Warrior(Base base, String id, float newHp) {
        super(base, id, newHp);
        weapon = new Knife(base);
        nbInstance ++;
    }

    public Warrior(Base base, float newHp){
        super(base,newId, newHp);
        weapon = new Knife(base);
        nbInstance += 1;
    }

    public Warrior(Base base, float newHp, AbstractMeleeWeapon weapon){
        super(base,newId, newHp);
        this.weapon = weapon;
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
        target.EarthAttacked(this.weapon.getPower());
    }

    @Override
    public void EarthAttacked(int power) {
        this.hp -= power;
    }

    public void evolveWarrior(){
        this.weapon = new Axe(this.base);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior warrior)) return false;
        if (!super.equals(o)) return false;
        return weapon == warrior.weapon && isAssociated() == warrior.isAssociated();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weapon, nbInstance, isAssociated());
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "hp=" + hp +
                ", Weapon=" + weapon +
                ", nbInstance=" + nbInstance +
                ", isAssociated=" + isAssociated +
                ", Weapon = " + weapon +
                '}';
    }
}
