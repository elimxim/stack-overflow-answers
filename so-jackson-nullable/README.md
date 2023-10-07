# Stack Overflow Example

Answer: https://stackoverflow.com/a/77089448/22270964

This example shows how to tell Jackson to write `null` values as EMPTY

There are two ways:

- using `@JsonSerialize.nullsUsing` as the preferred way
- using a whole object serializer 
