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
