### ABSTRACT FACTORY ###

Often referred to as the factory of factories and has similar functionality to the Factory pattern. The Abstract Factory
class will have a method which will resolve one of many factory classes. These factory classes can then use their own
logic to resolve a concrete implemenation.

The example used is one where the Abstract Factory class resolves a CarFactory (Abstract class); the options here are
the VauxhallFactory and the FordFactory which subsequently user the Factory pattern to provide a conrete implemenation
of the Car Interface (in this case, Mondeo or Astra).

#######################

### FACTORY ###

A simple pattern where the client requests one of many potential sub-classes to a parent/super-class. In the example
provided, the Factory class accepts a string @model which will then provide a concrete implementation of the Car interface.

This is ideal as it only exposes the required functionality to the client where they request a type of object with a
defined API, and will resolve a sub class that can fulfill their needs without being aware of the logic by which the
object is created.

#######################