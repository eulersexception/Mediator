package edu.hm.cs.swa.medi;

public class InOfficeColleague extends Colleague {

    public InOfficeColleague(Mediator m, String name) {
        super(m, name);
    }

    @Override
    public void receive(String message) {
        System.out.println(message);
    }
}
