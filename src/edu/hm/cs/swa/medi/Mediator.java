package edu.hm.cs.swa.medi;

public interface Mediator {

    void send(String message, Colleague sender);
}
