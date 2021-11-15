package fr.ensma.a3.ia.jeu.actions;

import fr.ensma.a3.ia.jeu.AliveElement.AbstractAliveElement;

import java.util.Objects;

public class Rest extends AbstractEtat{

    private AbstractAliveElement character;

    public Rest(AbstractAliveElement character){
        this.character = character;
    }

    @Override
    public void Movement() throws Exception {
        character.setEtatCourant(character.getInMove());
    }

}
