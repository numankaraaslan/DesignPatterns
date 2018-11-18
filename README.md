You can find simple and memorable examples of design patterns. Here is a summary with side notes:

Algorithm: A word used by programmers when they do not want to explain what they did
Design Pattern: A concept used by programmer when the DO want to explain what they did
An approach to tackle any kind of development problem
It is an architectural method
You may be inventing of using a design pattern already in your code
Design pattern is NOT coding, it is an approach

**** Benefits ****

Makes your approach of the problem explainable, without getting into details
Gives you ideas to come up with solutions under different circumstances
Can be combined like puzzle pieces
Does not dictate a certain programing language

**** Disadvantages ****

Does not always make coding easier or simpler
Sometimes relies on OOP principles
The more not alwasy the merrier
Easy to get lost and lose sight of what you are doing
Some are look-alikes

**** When to use and why ****

Do NOT try to apply it everywhere
Documenting is more powerful than using a design pattern
Use it when
Implementing a complex bussiness logic
There are tight constraints (Memory, CPU, Security)
You are developing an API for developers

**** Behavioral ****

Visitor
Observer
Strategy
Chain of Responsibility
Command
Mediator

Usually implemented for you own project

**** Creational ****

Sinlgeton
Builder
Factory

Mostly for certain constraints or requirements
Whenever you create an object, there is a possible creational DP

**** Structural ****

Proxy
Adapter
Decorator
Bridge
Facade

Can be API implementations

**** Visitor ****

Example: Postman
Can be a client using web services
Logic is under the visitor
Reverse observer pattern

**** Observer ****

Example: Weathercast
A web service with many clients
A listener implementation (Click, swipe, touch)
Reverse visitor
Not mediator, observers do not send information to each other via center
Literally implemented in Java as Observable and Observer

**** Strategy ****

Example: Actor
Dependency Injection
Violates single responsibility
Not state pattern. This changes behavior

**** Chain of responsibility ****

Example: Digestive system
An object is being delivered
Not visitor, the same object is carried on through other objects
Not observer, nobody knows anyone other then next (sometimes previous) and there is no center
If one fails whole system fails, memento or state is the savior (Reverse it back to last state and send it to previous)

**** Command ****

Example: Manager says "work"
Best suited for plugin based development
Command + Observer + Chain of Responsibility
Very compatible with chain of responsibility and observer (You usualy need workers with a manager)

**** Mediator ****

Example: Chat app
Looks like visitor and observer combined
Can benefit iterator under the hood
NOT chain of responsibility, this is pure mediators responsibility
May need another behavioral and structural pattern to manage interconnections

**** Singleton ****

Example: One and only
An eager type and lazy type
Watch for multiple threads on a multithreded environment

**** Builder ****

Example: Return this
Less parameters, fluent code
You don’t have to keep the reference
Java string builder and hibernate criteria api
Can be used in a factory

**** Factory ****

Example: Well, Vehicle factory :D
A creator that can create subclasses
Can't combine with facade, you need all the details
Abstract factory gives you a blueprint of factory
Abstract factory alternative: Return a builder pattern and let them build necessary features
Or use a strategy pattern (small manufacturing blocks) to change on runtime

**** Proxy ****

Example: SideKick
When an object is too important
2 possbile implementations (Subclass, Instance)
Proxy can have a singleton inside
Not facade, idea is to conceal the implementation
Not bridge, the problem is to keep the implementation safe

**** Adapter ****

Example: Women :)
Provide an easy to use connector to develop on an abstraction
Adapt an adapter as long as keeping the original
Can benefit from facade (makeHerHappy method)
DataAdapter in Android and java swing adapters

**** Decorator ****

Example: Wrapper, Packaging
New funcionality while keeping the original
Feels like adapter but problem is to add functionality, not to make it usable to others
Aspect oriented approach uses this
Java file reader classes

**** Bridge ****

Example: Public relations (Or Rossi VS Ken Block)
Worst definition ever (Decouple an abstraction from its implementation so that the two can vary independently)
The idea is to abstract the complexity and create a simple unifier
Not facade, this one is connecting (The complexity is on both sides)
Not adapter, Two sides are being handled in a unfier adaptation (2 hands 1 brain)

**** Facade ****

Example: Managers assistant
Making it look simpler from outside
Can benefit proxy but the problem is to simplify the logic
Also, there can be lots of small asbtractions behind

**** Extra ****

State is a time machine, holds the properties
Memento is the memory of the state of the object (not the object itself)
Iterator is hiding the complex iteration logic from outside by providing a next() method
A worfklow application, State DP can use Memento, Memento can use Iterator
