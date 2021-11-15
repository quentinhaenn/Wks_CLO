package fr.ensma.a3.ia.jeu.InanimateElement.Weapon.DistanceWeapon;

import fr.ensma.a3.ia.jeu.AliveElement.Human.Warrior;
import fr.ensma.a3.ia.jeu.actions.*;
import fr.ensma.a3.ia.jeu.base.Base;

public class Catapult
        extends AbstractDistanceWeapon
        implements IAttack, IEarthAttack, IEarthAttacked, IAttacked, IMovable {

    private boolean isAssociated;
    private Warrior user;

    public Catapult(Base base, String id, float resistance, Munitions mun) {
        super(base, id, resistance, mun);
        isAssociated = false;
        user = null;
    }

    public boolean IsAssociated(){
        return isAssociated;
    }

    public void setAssociated(Warrior warrior){
        if (this.user == null || !this.user.equals(warrior)){
            this.isAssociated = true;
            this.user = warrior;
        }
    }

    @Override
    public void Attack(IAttacked target) {
        target.Attacked(this.munitions.getPower());
    }

    @Override
    public void Attacked(int power) {
        this.resistance -= power;
    }

    @Override
    public void EarthAttack(IEarthAttacked target) {
        target.EarthAttacked(this.munitions.getPower());
    }

    @Override
    public void EarthAttacked(int power) {
        this.resistance -= power;
    }

    @Override
    public void Move() {
        System.out.println("La catapulte bouge... \n");
    }

    public Warrior getUser() {
        return user;
    }
}
