package fr.ensma.a3.ia.jeu.AliveElement.Human;

import fr.ensma.a3.ia.jeu.AliveElement.AbstractAliveElement;
import fr.ensma.a3.ia.jeu.actions.IMovable;
import fr.ensma.a3.ia.jeu.actions.Rest;
import fr.ensma.a3.ia.jeu.actions.Run;
import fr.ensma.a3.ia.jeu.actions.Walk;
import fr.ensma.a3.ia.jeu.base.Base;


import java.util.logging.Logger;

public abstract class AbstractHuman
        extends AbstractAliveElement
        implements IMovable {

    private static final Logger LOGGER = Logger.getLogger(AbstractHuman.class.getName());



    public AbstractHuman(Base base, String id, float newHp) {
        super(base, id, newHp);
        setMoveState(new Walk());
        setEtatCourant(new Rest(this));
    }

    public void movementEvolution(){
        if(!(moveState instanceof Run run)){
            setMoveState(new Run());
        }
    }

    public String Talk(AbstractHuman interlocutor, String sentence){
        return "Je parle à :" + interlocutor.toString() + "et je lui dit : \n" + sentence;
    }

    @Override
    public void Move() throws Exception {
        try{
            etatCourant.Movement();
            System.out.println("Je marche! \n");}
        catch (Exception e){
            System.out.println("Je suis déjà en mouvement !");
        }
    }

    public void Rest() throws Exception {
        try{
            etatCourant.Stop();
            System.out.println("Je me repose!");
        }
        catch (Exception e){
            System.out.println("Je suis déjà à l'arrêt !");
        }
    }
}
