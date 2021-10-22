package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.Catapult;
import fr.ensma.a3.ia.jeu.actions.IEarthAttack;
import fr.ensma.a3.ia.jeu.actions.IEarthAttacked;
import fr.ensma.a3.ia.jeu.actions.IMovements;

public class Warrior
        extends AbstractHuman
        implements IMovements,
        IEarthAttack,
        IEarthAttacked {
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

    @Override
    public void Move() {
        super.Move();
    }

    @Override
    public String Talk(AbstractHuman interlocutor, String sentence) {
        return super.Talk(interlocutor, sentence);
    }

    @Override
    public void EarthAttack(IEarthAttacked target) {
        target.EarthAttacked(this.attackPower);
    }

    @Override
    public void EarthAttacked(int power) {
        this.hp -= power;
    }
}
