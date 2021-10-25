package fr.ensma.a3.ia.jeu.AliveElement.Monster;

import fr.ensma.a3.ia.jeu.AliveElement.AbstractAliveElement;
import fr.ensma.a3.ia.jeu.actions.*;
import fr.ensma.a3.ia.jeu.base.Base;

import java.util.Objects;

public class Dragon
        extends AbstractAliveElement
        implements IMovements, IAttacked, IAttack, IEarthAttacked, IEarthAttack {

    private final int attackPower;
    private static int nbInstances;

    public Dragon(Base base, String id, float newHp, int attackPower) {
        super(base, id, newHp);
        this.attackPower = attackPower;
        nbInstances +=1 ;
    }

    @Override
    public void Attack(IAttacked target) {
        target.Attacked(this.attackPower);
    }

    @Override
    public void Attacked(int power) {
        this.hp -= power;
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
    public void Move() {
        System.out.println("Je vole!\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dragon dragon)) return false;
        if (!super.equals(o)) return false;
        return attackPower == dragon.attackPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), attackPower);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "hp=" + hp +
                ", attackPower=" + attackPower +
                '}';
    }
}
