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

