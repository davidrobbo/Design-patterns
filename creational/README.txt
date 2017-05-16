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

### PROTOTYPE ###

The Prototype pattern is somewhat controversial due to it's relation to object cloning. However, when the resources required
to instantiate and build an object are vast, and if some other areas of the system require access to the same data, then
simply copying the object as opposed to re-building (e.g. multiple DB queries) is more efficient.

In order to expose the class as cloneable, the class should implement 'Java.lang.Cloneable'. The standard 'Object' class
exposes a shallow copy method as a standard (copies an objects properties, but not relations), therefore in order to
perform a deep copy, a new clone method must be implemented.

################

### SINGLETON ###

Similar in some respects to the prototype pattern when it comes to preventing consumption of system resources when different
parts of the system can function while accessing a single object.

This pattern is used to ensure only one copy of the class is instantiated and accessible in the JVM at any one time. The
singleton class provides a global public static access point to the instance, which itself calls a private constructor.
The private constructor itself is utilised to ensure external objects and classes are prevented from introducing more
copies of the class into the JVM.

#################