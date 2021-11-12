package fr.ensma.a3.ia.jeu.itemCollection;

import fr.ensma.a3.ia.jeu.AbstractGameElement;
import fr.ensma.a3.ia.jeu.actions.ITroupable;
import fr.ensma.a3.ia.jeu.actions.ITrouper;
import fr.ensma.a3.ia.jeu.base.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Troup extends AbstractGameElement
        implements ITrouper , ITroupable {

    private List<ITroupable> listTroupe;
    private Exception ContainerException;

    public Troup(Base base) {
        super(base);
        listTroupe = new ArrayList<ITroupable>();
    }

    @Override
    public void addCharacter(ITroupable character) {
        listTroupe.add(character);
    }

    @Override
    public void suppCharacter(ITroupable character) throws Exception {
        if(!listTroupe.remove(character)){
            throw ContainerException;
        }
    }

    @Override
    public void Move() {
        for (ITroupable character : listTroupe){
            character.Move();
        }
    }

    @Override
    public String introduceYou() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("---------------------\n" + "Troupe (")
                .append(listTroupe.size()).append(") \n")
                .append("--------------------------\n");
        for (ITroupable character: listTroupe) {
            String s = character.toString();
            buffer.append(s);
        }
        System.out.println(buffer);
        return null;
    }
}
