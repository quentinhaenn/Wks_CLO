package fr.ensma.a3.ia.jeu.InanimateElement.Weapon.DistanceWeapon;

import fr.ensma.a3.ia.jeu.InanimateElement.AbstractInanimateElement;
import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.AbstractWeapon;
import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.DistanceWeapon.Munitions;
import fr.ensma.a3.ia.jeu.base.Base;

public class AbstractDistanceWeapon
        extends AbstractWeapon {

    protected Munitions munitions;
    protected int munitionLoaded;
    protected int remainingMunition;


    public AbstractDistanceWeapon(Base base, String id, float newResistance, Munitions mun) {
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
