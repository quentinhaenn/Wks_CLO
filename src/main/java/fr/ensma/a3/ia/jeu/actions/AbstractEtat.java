package fr.ensma.a3.ia.jeu.actions;

public abstract class AbstractEtat implements IEtatPerso{
    private Exception exception;

    @Override
    public void Movement() throws Exception {
        throw exception;
    }

    @Override
    public void Stop() throws Exception {
        throw exception;
    }
}
