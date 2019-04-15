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

## Executor @ java.util.concurrent

### What

* An object that excutes submitted Runnable tasks

### When

* An Executor is normally used instead of explicitly creating threads

### Why

### How

* For example, rather than invoking new Thread(new(RunnableTask())).start() for each of a set of tasks, you might use:

```
Executor executor = anExecutor;
executor.execute(new RunnableTask1());
executor.execute(new RunnableTask2());
```

## Executors

Factory and utility methods for Executor, ExecutorService, ScheduledExecutorService, ThreadFactory, and Callable classes defined in this package. This class supports the following kinds of methods:

+ Methods that create and return an ExecutorService set up with commonly useful configuration settings.

+ Methods that create and return a ScheduledExecutorService set up with commonly useful configuration settings.

+ Methods that create and return a "wrapped" ExecutorService, that disables reconfiguration by making implementation-specific methods inaccessible.

+ Methods that create and return a ThreadFactory that sets newly created threads to a known state.

+ Methods that create and return a Callable out of other closure-like forms, so they can be used in execution methods requiring Callable.

## ExecutorService @ java.util.concurrent

### What

An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more asynchoronous tasks.

### When

Same with Executor

### Why

### How

A sketch of a network service in which threads in a thread pool service incoming requests.

```
class NetworkService implements Runnable {
  private final ServerSocket serverSocket;
  private final ExecutorService pool;

  public NetworkService(int port, int poolSize) throws IOException {
    serverSocket = new ServerSocket(port);
    pool = Executors.newFixedThreadPool(poolSize);
  }

  public void run() {
    try {
      for (;;) {
        pool.execute(new Handler(serverSocket.accept()));  
      }
    } catch (IOException e) {
      pool.shutdown();
    }
  }
}

class Handler implements Runnable {
  private final Socket socket;
  Handler(Socket socket) {
    this.socket = socket;
  }

  public void run() {
  }
}
```

## Fork/Join

### What

an implementation of the ExecutorService interface that helps you take advantage of multiple processors.

The fork/join framework distributes tasks to worker threads in a thread pool.

### When



### Why

The fork/join framework is distinct because it uses a work-stealing algorithm.
Worker threads that run out of things to do can steal tasks from other threads that are still busy.

### How

