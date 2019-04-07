# Concurrency notes

## ArrayBlockingQueue

### Definition

A bounded BlockingQueue backed by an array.
This queue orders elements FIFO.
Head: the element that has been on the queue longest time
Tail: the element that has been on the queue shortest time
New element will be added to the tail

Attempts to put an element into a full queue will result in the operation blocking.
attempts to take an element from an empty queue will similarly block.


