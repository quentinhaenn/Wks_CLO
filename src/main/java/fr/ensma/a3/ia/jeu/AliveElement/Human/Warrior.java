package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.Catapult;

public class Warrior extends AbstractHuman{
    private int attackPower;
    private int nbInstance = 0;
    private boolean isAssociated;

    public Warrior(String id, float newHp, int attack) {
        super(id, newHp);
        attackPower = attack;
        nbInstance += 1;
    }

    public boolean Associate(Catapult catapult){
        if (!this.isAssociated){
            this.isAssociated = true;
            return true;
        }else return false;
    }
    public boolean isAssociated(){
        return isAssociated;
    }

    public int getNbWarriors() {
        return nbInstance;
    }

}
