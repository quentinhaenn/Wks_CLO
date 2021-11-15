package fr.ensma.a3.ia.jeu.InanimateElement.Weapon.MeleeWeapon;

import fr.ensma.a3.ia.jeu.actions.IEarthAttack;
import fr.ensma.a3.ia.jeu.actions.IEarthAttacked;
import fr.ensma.a3.ia.jeu.base.Base;

public class Axe extends AbstractMeleeWeapon implements IEarthAttack {
    public Axe(Base base, String newId, float newResistance) {
        super(base, newId, newResistance);
        this.power = 20;
        this.weight = 5;
    }

    public Axe(Base base) {
        super(base);
        this.power = 20;
        this.weight = 5;
    }

    @Override
    public void EarthAttack(IEarthAttacked target) {
        target.EarthAttacked(this.power);
    }

    @Override
    public String toString() {
        return " Axe{" +
                "power=" + power +
                ", weight=" + weight +
                '}';
    }
}
