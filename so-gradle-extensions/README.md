# Stack Overflow Example

Answers
- https://stackoverflow.com/a/76957235/22270964
- https://stackoverflow.com/a/76982712/22270964

This example demonstrates how to add and simply apply a custom repository.

A custom repository is defined as a method in the `RepositoryHandler`
like `mavenCentral()` using Kotlin extensions mechanism. So to achieve that 
in the target project, this library must be published and included as a dependency to
the classpath of the target project.

For example, using `gradle.init.kts`:

```
allprojects {
    buildscript {
        repositories {
            mavenLocal()
        }

        dependencies {
            classpath("net.emv:so-gradle-extensions:0.1")
        }
    }
}
```

And the following repository definition will be available
in the `build.gradle.kts` file of the target project:

```
repositories {
    myRepo()
}
```
