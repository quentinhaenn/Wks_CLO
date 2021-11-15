package fr.ensma.a3.ia.jeu.InanimateElement.Weapon.MeleeWeapon;

import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.AbstractWeapon;
import fr.ensma.a3.ia.jeu.base.Base;

public class AbstractMeleeWeapon extends AbstractWeapon {

    protected int power;
    protected int weight;

    public AbstractMeleeWeapon(Base base, String newId, float newResistance) {
        super(base, newId, newResistance);
    }

    public AbstractMeleeWeapon(Base base) {
        super(base);
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Weapon type = Melee" +
                "power=" + power +
                ", weight=" + weight +
                '}';
    }
}
