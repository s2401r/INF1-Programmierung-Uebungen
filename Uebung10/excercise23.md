
### Aufgabe a)
- leftmost innermost:
```haskell
second (sqr 2, sqr 4)
second (2 * 2, 4 * 4)
second (4, 16)
16
```

- leftmost outermost:
```haskell
second (sqr 2, sqr 4)
sqr 4
4 * 4
16
```

### Aufgabe b)
- leftmost innermost:
```haskell
head ones
head 1, 1, 1, 1, 1, 1, 1, ....
1
```

- leftmost outermost:
```haskell
head ones
head (1: ones)
1
```

### Aufgabe c)
- leftmost innermost:  
```haskell
map inc [2, 3]
map inc (2: (3: [])
map (+1) (2: (3: [])
(+1) 2 : map (+1) (3: [])
    (+1) 3 : map (+1) ([])
        (+1) [] : []
    4 : []
3 : (4 : [])
[3, 4]
```

- leftmost outermost:
```haskell
map inc [2, 3]
map inc (2: (3: [])
inc 2 : map inc (3: [])
(+1) 2 : map (+1) (3: [])
    (+1) 3 : map (+1) ([])
        (+1) [] : []
    4 : []
3 : (4 : [])
[3, 4]              
```
