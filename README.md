# Mediator Pattern

The mediator is a good choice of pattern when the communication between objects is complicated, but well defined.

In this exercise, we want to implement a simple chat room. We are using the mediator pattern. 

@startuml
skinparam linetype polyline
skinparam linetype ortho
interface Mediator {
    + send(message: String , sender: Colleague)
}

interface Colleague {
    - name: String
<<<<<<< HEAD
    + send (message: String)
    + {abstract} receive (message: String)
=======
    + send (message: String): void
    + {abstract} recieve (message: String)
>>>>>>> parent of 81f8008... README.md  corrected
}
 
class ConcreteMediator {
    - colleagues: ArrayList<Colleague>
    + addColleague (colleague: Colleague)
    + send(message: String, sender: Colleague)
}

class InOfficeColleague {
    + receive (message: String)
}

class MobileColleague {
    + receive (message: String)
}


ConcreteMediator .up.|> Mediator
InOfficeColleague .up.|> Colleague
MobileColleague .up.|> Colleague
Colleague -left-> " " Mediator: -mediator


@enduml

The Mediator defines the interface for communication between Colleague objects. The `ConcreteMediator` implements the `Mediator` interface and coordinates communication between `Colleague` objects. It is aware of all the colleagues and their purpose with regards to inter communication. The concrete colleagues communicate with other colleagues through the mediator.

Without this pattern, all of the colleagues would need to know about each other, leading to high coupling. By having all colleagues communicate through one central point we have a decoupled system while maintaining control on the object's interactions.

### create a simple chat room 

**You have the following task:**

1. ✅[Implement Mediator](testClass[Mediator]), Mediator Interface with the method `send(String message, Colleague sender)`

2. ✅[Implement ConcreteMediator](testClass[ConcreteMediator]), the ConcreteMediator implements the `send` method. Please make sure only the other colleagues and not the sender will receive the message.

3. ✅[Implement Colleague](testClass[Colleague],testAttributes[Colleague],testMethods[Colleague]), Colleague Interface holding mediator as an attribute. The constructor is `public Colleague(Mediator m, String name){}`

4. ✅[Implement InOfficeColleague](testClass[InOfficeColleague],testMethods[InOfficeColleague])

5. ✅[Implement MobileColleague](testClass[MobileColleague],testMethods[MobileColleague])

`Client.java` test drives your chat room.
