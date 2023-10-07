# Stack Overflow Example

This example shows the ability of Hibernate when a table references itself

Answer: https://stackoverflow.com/a/76763688/22270964

## How to use

To simplify the demonstration the H2 database will be used by default.

You can just run the main class and use HTTP API to get the results as follows:

- `http://localhost:8088/api/category/Food`
- `http://localhost:8088/api/category/Vegetable`
- `http://localhost:8088/api/category/Meat`
- `http://localhost:8088/api/category/Apple`

## Limitations

The `Category` entity can be serialized using Jackson only with ignoring self-reference fields.
If these fields aren't ignored it will result to the stackoverflow exception. 
