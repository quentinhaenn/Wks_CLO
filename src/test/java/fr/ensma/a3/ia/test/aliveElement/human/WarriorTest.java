package fr.ensma.a3.ia.test.aliveElement.human;

import fr.ensma.a3.ia.jeu.AliveElement.Human.Warrior;
import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.DistanceWeapon.Catapult;
import fr.ensma.a3.ia.jeu.InanimateElement.Weapon.DistanceWeapon.Munitions;
import fr.ensma.a3.ia.jeu.base.Base;
import fr.ensma.a3.ia.jeu.base.EBaseColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class WarriorTest {

    private static Base base = new Base("Xarsaroth", EBaseColor.Blouge);
    private Warrior guerrier1 = new Warrior(base, "Jackie", 50.0f);
    private Warrior guerrier2 = new Warrior(base, "Michel", 50.0f);
    private Catapult catapulte = new Catapult(base, "cata_pute", 50.0f,new Munitions(100, 10));


    @Test
    @DisplayName("Test de l'assiociation du guerrier à la catapulte")
    void associate() {
        System.out.println("Début du test associate");
        guerrier1.Associate(catapulte);
        assert (guerrier1.isAssociated());
        assert (catapulte.IsAssociated() && catapulte.getUser().equals(guerrier1));
    }


    @Test
    @DisplayName("Test de la taille de la liste des guerriers")
    void getNbWarriors() {
        assert(guerrier1.getNbWarriors() == 2);
    }

    @Test
    void earthAttack() {
        guerrier1.EarthAttack(guerrier2);
        assert (guerrier2.getHp() == guerrier1.getHp() - 150);
    }

    @Test
    void earthAttacked() {
        guerrier1.EarthAttacked(20);
        assert (guerrier1.getHp() == 50.0f - 20);
    }

    @Test
    void testEquals() {
        Warrior warrior1 = new Warrior(base, "Jackie", 50.0f);
        assert (warrior1.equals(guerrier1));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}