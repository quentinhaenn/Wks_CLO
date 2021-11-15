package fr.ensma.a3.ia.jeu.InanimateElement.Weapon;

import fr.ensma.a3.ia.jeu.InanimateElement.AbstractInanimateElement;
import fr.ensma.a3.ia.jeu.base.Base;

public abstract class AbstractWeapon extends AbstractInanimateElement {
    public AbstractWeapon(Base base, String newId, float newResistance) {
        super(base, newId, newResistance);
    }

    public AbstractWeapon(Base base) {
        super(base);
    }

    @Override
    public String toString() {
        return "AbstractWeapon{" +
                "resistance=" + resistance +
                ", id='" + id + '\'' +
                '}';
    }
}
