package fr.ensma.a3.ia.jeu.InanimateElement.Weapon;

import fr.ensma.a3.ia.jeu.InanimateElement.AbstractInanimateElement;

public class AbstractWeapon
        extends AbstractInanimateElement {

    protected Munitions munitions;
    protected int munitionLoaded;
    protected int remainingMunition;


    public AbstractWeapon(String id, Munitions mun) {
        super(id);
        munitions = mun;
        munitionLoaded = mun.getMagazineSize();
        remainingMunition = munitionLoaded;

    }

    public void Reload(){
        munitionLoaded +=1;
        remainingMunition -=1;
    }

}
