package fr.ensma.a3.ia.jeu.base;

import fr.ensma.a3.ia.jeu.AbstractGameElement;

public class Base extends AbstractGameElement {
    private String baseName;
    private EBaseColor baseColor;

    public Base(String id, String name, EBaseColor color) {
        super(id);
        baseName = name;
        baseColor = color;
    }
}
