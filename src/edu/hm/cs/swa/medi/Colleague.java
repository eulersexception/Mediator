package edu.hm.cs.swa.medi;

public abstract class Colleague {

    private Mediator mediator;
    private String name;

    public Colleague(Mediator m, String name) {
        mediator = m;
        this.name = name;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void receive(String message);

}
