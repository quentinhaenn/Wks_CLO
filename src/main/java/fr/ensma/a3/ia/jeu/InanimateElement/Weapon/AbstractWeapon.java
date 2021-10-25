package fr.ensma.a3.ia.jeu.InanimateElement.Weapon;

import fr.ensma.a3.ia.jeu.InanimateElement.AbstractInanimateElement;
import fr.ensma.a3.ia.jeu.base.Base;

public class AbstractWeapon
        extends AbstractInanimateElement {

    protected Munitions munitions;
    protected int munitionLoaded;
    protected int remainingMunition;


    public AbstractWeapon(Base base, String id, float newResistance, Munitions mun) {
        super(base, id, newResistance);
        munitions = mun;
        munitionLoaded = mun.getMagazineSize();
        remainingMunition = munitionLoaded;

    }

    public void Reload(){
        munitionLoaded +=1;
        remainingMunition -=1;
    }

}
