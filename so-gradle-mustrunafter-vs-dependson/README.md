# Stack Overlow Example

Gradle `mustRunAfter` vs `dependsOn`

Answer: https://stackoverflow.com/a/76833528/22270964

## Task Order

- dependsOn: foo1 -> bar1 -> toy1  
- mustRunAfter: foo2 -> bar2 -> toy2

## Output

### Using `dependsOn`

When the task `toy1` is run, the other tasks `foo1` and `bar1` will be run earlier then `toy1`

```
Executing 'toy1'...


> Task :foo1
foo1

> Task :bar1
bar1

> Task :toy1
toy1
```

### Using `mustRunAfter`

When only the task `toy2` is run, no other task will be run earlier 

```
Executing 'toy2'...


> Task :toy2
toy2
```

When the tasks `toy2` and `bar2` are run together, `bar2` will be run before `toy2`

```
Executing 'toy2 bar2'...


> Task :bar2
bar2

> Task :toy2
toy2
```
