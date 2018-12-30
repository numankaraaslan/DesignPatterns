You can find simple and memorable examples of design patterns. Here is a summary with side notes:

Algorithm: A word used by programmers when they do not want to explain what they did

Design Pattern: A concept used by programmer when the DO want to explain what they did

Design pattern is an approach to tackle any kind of development problem. It is an architectural method.

You may be inventing of using a design pattern already in your code. Design pattern is NOT coding, it is an approach

**** Benefits ****

- Makes your approach of the problem explainable, without getting into details

- Gives you ideas to come up with solutions under different circumstances

- Can be combined like puzzle pieces

- Does not dictate a certain programing language

**** Disadvantages ****

- Does not always make coding easier or simpler

- Sometimes relies on OOP principles

- The more not always the merrier

- Easy to get lost and lose sight of what you are doing

- Some are look-alikes

**** When to use and why ****

Do NOT try to apply it everywhere. Documenting is more powerful than using a design pattern.

Use it when, implementing a complex bussiness logic, there are tight constraints (Memory, CPU, Security), you are developing an API for other developers.

**** Creational ****

Sinlgeton, Builder, Factory

Usage: Mostly for certain constraints or requirements.

Tip: Whenever you create an object, there is a possible creational DP.

**** Behavioural ****

Visitor, Observer, Strategy, Chain of Responsibility, Command, Mediator

Usage: Usually implemented for you own project

Tip: When your codes start behaving, you would reailze there can be a behavioural DP.

**** Structural ****

Proxy, Adapter, Decorator, Bridge, Facade

Usgae: Can be API implementations or when you are using a library that you cannot change the codes.

Tip: The importance or necessity of structural DPs emerge when your code starts behaving.

**** Extra ****

State pattern holds the properties and defines states of an object.

Memento is the memory of the state of the object like a time machine. (Does not remember the object itself)

Iterator is hiding the complex iteration logic from outside by providing a simple next() method.

In a worfklow application, the flow can be implemented with Memento with the help of State and Iterator or Chain of Responsibility.

**** The application of design patterns into your project ****

Building a house is a nice example of design patterns in an application.

Step 1: Decide building blocks (Creational DP)
Concrete blocks or briks or iron or steel ...etc.

Step 2: Define the structure and build it (Structural DP)
Most important step because requires deep understanding of the bussiness. This step will consequtively effect the next step.

Step 3: Put people in house to live (Behavioural DP)
When people start living in the house you will see the behaviour in action and you will need a behaviour management.
