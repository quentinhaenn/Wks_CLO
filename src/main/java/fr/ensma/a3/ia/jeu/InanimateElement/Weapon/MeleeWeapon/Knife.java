package fr.ensma.a3.ia.jeu.InanimateElement.Weapon.MeleeWeapon;

import fr.ensma.a3.ia.jeu.actions.IEarthAttack;
import fr.ensma.a3.ia.jeu.actions.IEarthAttacked;
import fr.ensma.a3.ia.jeu.base.Base;

public class Knife extends AbstractMeleeWeapon implements IEarthAttack {
    public Knife(Base base, String newId, float newResistance) {
        super(base, newId, newResistance);
        this.power = 10;
        this.weight = 1;
    }

    public Knife(Base base) {
        super(base);
        this.power = 10;
    }

    @Override
    public void EarthAttack(IEarthAttacked target) {
        target.EarthAttacked(this.power);
    }

    @Override
    public String toString() {
        return " Knife{" +
                "power=" + power +
                ", weight=" + weight + '}' ;
    }
}
