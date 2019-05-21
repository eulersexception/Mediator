package edu.hm.cs.swa.medi;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague sender) {
        for(Colleague member : colleagues)
            if(!member.getName().equals(sender.getName()))
                member.receive(message);
    }

}
