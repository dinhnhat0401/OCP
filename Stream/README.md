# Stream

## Classes

Stream
IntStream
LongStream
DoubleStream

## Definition

No storage. A stream is not a data structure that stores elements.
It conveys elements from a source such as a data structure, an array, a generator function, or an IO channel, through a pipeline of computational operations.

## Functions

intermediate functions: filter, map
Intermediate functions return a new stream. Don't actually perform any filtering but instead create a  new stream contain elements of the initial stream thatr match the given predicate.

terminal functions: forEach, reduce

## Sample

Order of sorted method:

(s1, s2) > 0 -> s2, s1
(s1, s2) == 0 -> s1 = s2
(s1, s2) < 0 -> s1, s2

Sample:

```
        Arrays.stream(cities).sorted((s1,s2) -> s2.compareTo(s1))
                .forEach(System.out::println);

decending order because: (s1, s2) > 0 => s2 > s1 and the order is s2, s1
```
