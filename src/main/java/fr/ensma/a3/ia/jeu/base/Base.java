package fr.ensma.a3.ia.jeu.base;

import fr.ensma.a3.ia.jeu.AbstractGameElement;
import fr.ensma.a3.ia.jeu.AliveElement.IAliveElement;
import fr.ensma.a3.ia.jeu.InanimateElement.IObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Base {
    private final String baseName;
    private final EBaseColor baseColor;
    private final List<IAliveElement> AliveElementList;
    private final List<IObject> ObjectList;

    public Base(String name, EBaseColor color) {
        baseName = name;
        baseColor = color;
        AliveElementList = new ArrayList<>();
        ObjectList = new ArrayList<>();
    }

    public String getBaseName() {
        return baseName;
    }

    public EBaseColor getBaseColor() {
        return baseColor;
    }

    public int getNbAliveElement(){
        return AliveElementList.size();
    }

    public int getNbObjectElement(){
        return ObjectList.size();
    }

    public void addAliveElement(IAliveElement element){
        AliveElementList.add(element);
    }

    public void addObject(IObject object){
        ObjectList.add(object);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Base base)) return false;
        return getBaseName().equals(base.getBaseName()) && getBaseColor() == base.getBaseColor()
                && Objects.equals(AliveElementList, base.AliveElementList)
                && Objects.equals(ObjectList, base.ObjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBaseName(), getBaseColor(), AliveElementList, ObjectList);
    }

    @Override
    public String toString() {
        return "Base{" +
                "baseName='" + baseName + '\'' +
                ", baseColor=" + baseColor +
                ", AliveElementList=" + AliveElementList +
                "Size=" + AliveElementList.size() +
                ", ObjectList=" + ObjectList +
                "Size=" + ObjectList.size() +
                '}';
    }


}
