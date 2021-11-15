package fr.ensma.a3.ia.jeu.actions;

import fr.ensma.a3.ia.jeu.AliveElement.AbstractAliveElement;

import java.util.Objects;

public class InMove extends AbstractEtat{

    private AbstractAliveElement character;

    public InMove(AbstractAliveElement character){
        this.character = character;
    }

    @Override
    public void Stop() throws Exception {
        character.setEtatCourant(character.getRest());
    }
}
