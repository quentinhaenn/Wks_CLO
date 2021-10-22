package fr.ensma.a3.ia.jeu.AliveElement.Monster;

import fr.ensma.a3.ia.jeu.AliveElement.AbstractAliveElement;
import fr.ensma.a3.ia.jeu.actions.*;

public class Dragon
        extends AbstractAliveElement
        implements IMovements, IAttacked, IAttack, IEarthAttacked, IEarthAttack {

    private int attackPower;

    public Dragon(String id, float newHp) {
        super(id, newHp);
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

    }
}
