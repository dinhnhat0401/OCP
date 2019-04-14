# Concurrency notes

## ArrayBlockingQueue

### What is ArrayBlockQueue

A bounded BlockingQueue backed by an array.

This queue orders elements FIFO.

Head: the element that has been on the queue longest time

Tail: the element that has been on the queue shortest time

New element will be added to the tail

### What can cause operaton blocking in an ArrayBlockingQueue

Attempts to put an element into a full queue will result in the operation blocking.

Attempts to take an element from an empty queue will similarly block.

## CyclicBarrier

### What is a CyclicBarrier?

A synchronization aid that allows a set of threads to all wait for each other to reach a common barrier point

## ReadWriteLock

### What is it?

A ReadWriteLock maintains a pair of associated locks,
one for read-only operations and one for writing.
The read lock may be held simultaneously by multiple reader threads,
so long as there are no writers. The write lock is exclusive

## Executors

Factory and utility methods for Executor, ExecutorService, ScheduledExecutorService, ThreadFactory, and Callable classes defined in this package. This class supports the following kinds of methods:

+ Methods that create and return an ExecutorService set up with commonly useful configuration settings.

+ Methods that create and return a ScheduledExecutorService set up with commonly useful configuration settings.

+ Methods that create and return a "wrapped" ExecutorService, that disables reconfiguration by making implementation-specific methods inaccessible.

+ Methods that create and return a ThreadFactory that sets newly created threads to a known state.

+ Methods that create and return a Callable out of other closure-like forms, so they can be used in execution methods requiring Callable.

