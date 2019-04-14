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

