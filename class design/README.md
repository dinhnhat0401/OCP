Class design patterns

## Singleton

### Definition

A class that can have only one object at a time.
Any change made to any instance will affects other singleton instance created.

### Design a singleton class

1. Make constructor as private
2. Write a static method that has return type object of this singleton class.

Note: we can use lazy initialization (= delay the creation of an object until the first time it is needed.)

### Singleton class vs normal class

||Singleton|Normal class|
|-|-|-|
|instantiation|use a static method (e.g: getInstance), a singleton class doesn't have public constructor| use public constructor|

## Immutable class

### Def

Immutable class means that once an object is created, we cannot change its content.

### How

1. Make all class members private
2. Not allow setters method
3. Make sure that the object's state won't change

### sample

```
class ImmutableInt {
  private final int value;

  public ImmutableInt(int i) {
    value = i;
  }

  public int getValue() {
    return value;
  }
}
```

Note: must be care taken that all objects that are referenced by the object must be immutable as well.
```
class NotQuiteImmutableList<T> {
  private final List<T> list;

  public NotQuiteImmutableList(List<T> list) {
    // creates a new ArrayList and keeps a reference to it.
    this.list = new ArrayList(list); 
  }

  public List<T> getList() {
    return list;
  }
}

// notQuiteImmutableList contains "a", "b", "c"
List<String> notQuiteImmutableList= new NotQuiteImmutableList(Arrays.asList("a", "b", "c"));

// now the list contains "a", "b", "c", "d" -- this list is mutable.
notQuiteImmutableList.getList().add("d");
```

To make this immutable:

```
public List<T> getList() {
  // return a copy of the list so the internal state cannot be altered
  return new ArrayList(list);
}
```

## Encapsulation

### Why Encapsulation?

### How?


## Static Initialization Blocks and instance intialization blocks

```
As you have seen, you can often provide an initial value for a field in its declaration:

public class BedAndBreakfast {

    // initialize to 10
    public static int capacity = 10;

    // initialize to false
    private boolean full = false;
}
This works well when the initialization value is available and the initialization can be put on one line. However, this form of initialization has limitations because of its simplicity. If initialization requires some logic (for example, error handling or a for loop to fill a complex array), simple assignment is inadequate. Instance variables can be initialized in constructors, where error handling or other logic can be used. To provide the same capability for class variables, the Java programming language includes static initialization blocks.
```

### Static Initialization Blocks

A class can have any number of static initialization blocks, and they can appear anywhere in the class body. The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.

### instance intialization blocks

The Java compiler copies initializer blocks into every constructor. Therefore, this approach can be used to share a block of code between multiple constructors.
