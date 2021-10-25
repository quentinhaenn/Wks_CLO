package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.actions.IAttacked;
import fr.ensma.a3.ia.jeu.actions.IEarthAttacked;
import fr.ensma.a3.ia.jeu.actions.IMovements;
import fr.ensma.a3.ia.jeu.base.Base;

import java.util.Objects;

public class Worker extends AbstractHuman
        implements IAttacked, IEarthAttacked, IMovements {

    private static int nbInstance;
    private static final String newId = "Worker_" + nbInstance + 1;
    private final int workPower;


    public Worker(Base base, String id, float newHp, int workPower) {
        super(base, id, newHp);
        this.workPower = workPower;
        nbInstance += 1;
    }

    public Worker(Base base, float newHp, int workPower) {
        super(base, newId, newHp);
        this.workPower = workPower;
        nbInstance += 1;
    }

    @Override
    public void Attacked(int power) {
        this.hp -= power;
    }

    @Override
    public void EarthAttacked(int power) {
        this.hp -= power;
    }

    public int getWorkPower() {
        return workPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker worker)) return false;
        if (!super.equals(o)) return false;
        return getWorkPower() == worker.getWorkPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWorkPower());
    }

    @Override
    public String toString() {
        return "Worker{" +
                "hp=" + hp +
                ", workPower=" + workPower +
                '}';
    }

}
