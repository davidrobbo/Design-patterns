### OBSERVER ###

The observer pattern offers a one-to-many relationship* between a subject (an entity to be observed) and observers
(entities monitoring the subject). It is a behavioural pattern which follows a publish-subscribe model, where decoupled
objects can subscribe to events which when published allows them to respond accordingly.

*In most use cases, the observer defines a one-to-many relationship, although it can be implemented using other relations,
although there are issues regarding added complexity when debugging and potential memory leakage.

################

### CHAIN OF RESPONSIBILITY ###

The Chain Of Responsibility allows the client to dump the request at the entrance and receive their expected response
without knowing that the request has been through a recursive handling mechanism.

A request is passed from a base class iteratively to multiple objects which each attempt to handle the request.
The request is recursively passed back to the parent/base which keeps a pointer to the next object in the event
if the client's request is not currently satisfied.

IMPORTANT: remember that there must be a handler for when the request cannot be satisfied by one the members of the chain.

In the example provided, the ATM class would be used when a client requests a certain amount of money. As money
comes in many denominations, the class must identify what denomination should be given and how many of each. In order
to do so, a range of classes implementing the Processor contract try and resolve the request and return back with whether
the outcome is complete or if the next pointer is required.

###############################