package edu.hm.cs.swa.medi;

public class MobileColleague extends Colleague {

    public MobileColleague(Mediator m, String name) {
        super(m, name);
    }

    @Override
    public void receive(String message) {
        System.out.println(message);
    }
}
