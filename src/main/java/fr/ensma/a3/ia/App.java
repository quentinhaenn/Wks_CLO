package fr.ensma.a3.ia;

import fr.ensma.a3.ia.jeu.AliveElement.Human.Warrior;
import fr.ensma.a3.ia.jeu.AliveElement.Human.Worker;
import fr.ensma.a3.ia.jeu.base.Base;
import fr.ensma.a3.ia.jeu.base.EBaseColor;

public class App {
    public static void main(String[] args) {
        System.out.println("Bienvenue à Xarsaroth! \n");
        Base base1 = new Base("Xarsaroth", EBaseColor.Blouge);
        /**
         * Test des fonctionnalités du guerrier
         */
        Warrior guerrier1 = new Warrior(base1, 100.0f);
        Warrior guerrier2 = new Warrior(base1,"Alain",100.0f);
        Warrior guerrier3 = guerrier1;
        boolean isEqual = guerrier1.equals(guerrier3);
        System.out.println(guerrier2);
        System.out.println(isEqual);

        guerrier1.EarthAttack(guerrier2);

        System.out.println(guerrier2.getHp());

        guerrier1.evolveWarrior();
        System.out.println(guerrier1.toString());

        String discussion = guerrier1.Talk(guerrier2, "Bonjour aventurier, j'ai perdu mon marteau!\n");
        System.out.println(discussion);

        Worker jackie = new Worker(base1,"Jackie", 80.0f, 150);

    }
}
