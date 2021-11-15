package fr.ensma.a3.ia.jeu.InanimateElement.Weapon.DistanceWeapon;

public class Munitions {
    private int power;
    private int magazineSize;

    public Munitions(int power, int magazineSize){
        this.power = power;
        this.magazineSize = magazineSize;
    }

    public int getMagazineSize() {
        return magazineSize;
    }


    public int getPower() {
        return power;
    }
}
