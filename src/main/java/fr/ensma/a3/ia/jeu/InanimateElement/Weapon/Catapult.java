package fr.ensma.a3.ia.jeu.InanimateElement.Weapon;

import fr.ensma.a3.ia.jeu.AliveElement.Human.Warrior;
import fr.ensma.a3.ia.jeu.actions.*;

public class Catapult
        extends AbstractWeapon
        implements IAttack, IEarthAttack, IEarthAttacked, IAttacked, IMovements {

    private boolean isAssociated;
    private Warrior user;

    public Catapult(String id, float resistance, Munitions mun) {
        super(id, resistance, mun);
        isAssociated = false;
    }

    public boolean IsAssociated(){
        return isAssociated;
    }

    public void setAssociated(Warrior warrior){
        if (!warrior.isAssociated()){
            warrior.Associate(this);
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
}
