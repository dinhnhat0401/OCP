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
