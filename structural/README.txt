### COMPOSITE ###

The composite pattern utilises 3 distinct parts; a common interface, which both a leaf and composite implement. This pattern
is used to represent part-whole hierarchies where we can ask each node in the tree to perform a common action

The interface defines common methods that the leaf and composite use. However, the key difference is that the leaf is the
bottom of the branch and does not consist of children, whereas the composite contains children nodes.

In the example used, both a ProjectManager and Developer Class implement the Employee interface. However, a PM will
have many children, and therefore, as a composite object, will implement the 'report' method differently that the node
object/developer. The developer when asked to report, simply states it's name and salary, where the Composite can reflect
on the List of it's children.

##################

### DECORATOR ###

If we require some form of extra functionality that a base class does not (or should not) possess, then simply adding
this to the class would be in breach of the OPEN/CLOSED principle, as we would modify as opposed to extending the
class.

The example used shows a base abstract class of car which defines some basic methods and properties of a car. There are
also some sub classes defined. However, when a customer requires a property not offered in the base class (e.g.
the ability to take the car off road (4x4)) we need some extra functionality the car does not offer. Therefore, we could
simple extend the base class and create a new 4x4Car class. However, this opens the door to 'class explosion' where the
system gets bloated with masses of classes. In order to combat this, we define an abstract class called CarDecorator
which allows us to define additional functionality. In the class, we compose an instance of the Car class as a property
of the Decorator object so that we can access all of it's functionality. We then can utilise this functionality to
change how and what the Decorator does (in this instance, our decorator will offer some extra functionality, and then use
an 'addFeatureCost' method to alter the classes cost (Car total + feature cost).
#################

### ADAPTER ###

The adapter pattern is used for altering the interface of a class to one that the client expects. In the example, a robust
and stable algorithm is utilise in the 'OldLibrarySort@sort' method. However, this returns an ArrayList<Integer>, and our
client has a library or some form of functionality that requires the type of int[].

We could theoretically re-write the same algorithm used in the OldSortLibrary, however, this would not conform to DRY
principles. Therefore, we encapsulate the Old functionality into a new interface that is able to take and return the client's
expected type, but perform some translation on the data type between the input and output phases

###############