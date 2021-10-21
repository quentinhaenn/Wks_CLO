package fr.ensma.a3.ia.jeu;

public abstract class AbstractGameElement {
    private String objectId;


    public AbstractGameElement(String id) {
        objectId = id;
    }

    /**
     * @return String ObjectId
     */
    public String getObjectId() {
        return objectId;
    }
}
