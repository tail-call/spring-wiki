# Java lambdas

In Java, lambda expressions provide a concise way to represent anonymous functions or closures, allowing you to pass behavior as an argument to methods or construct instances of functional interfaces more compactly. Lambda expressions are particularly useful in functional-style programming, especially when working with collections, streams, and parallel processing.

Here's a basic syntax of a lambda expression in Java:

```java
(parameters) -> expression or statement block
```

- Parameters: Represents the input parameters of the lambda expression.
- Arrow (`->`): Separates the parameters from the body of the lambda expression.
- Expression or Statement Block: Represents the body of the lambda expression, which can be an expression or a block of statements.

Here are a few examples to illustrate the usage of lambda expressions in Java:

1. Lambda with no parameters:
```java
() -> System.out.println("Hello, World!");
```

2. Lambda with one parameter:
```java
(x) -> x * x
```

3. Lambda with multiple parameters:
```java
(x, y) -> x + y
```

4. Lambda with a statement block:
```java
(x, y) -> {
    int sum = x + y;
    return sum;
}
```

Lambda expressions are commonly used in combination with functional interfaces, which are interfaces with a single abstract method. For example, [java.util.function][juf] package provides a variety of functional interfaces, such as `Predicate`, `Function`, `Consumer`, and `Supplier`, which are commonly used with lambda expressions.

Here's an example of using lambda expression with the `Predicate` functional interface to filter a list:

```java
List<String> names = Arrays.asList("John", "Doe", "Alice", "Bob");

// Using lambda expression to filter names starting with "A"
List<String> filteredNames = names.stream()
                                 .filter(name -> name.startsWith("A"))
                                 .collect(Collectors.toList());

System.out.println(filteredNames); // Output: [Alice]
```

Lambda expressions offer a powerful and concise way to write code, especially when working with functional programming constructs in Java. They help reduce boilerplate code and improve readability, making your code more expressive and maintainable.

## Type declaration

In Java, lambda expressions do not have an explicit type declaration. Instead, the type of a lambda expression is inferred based on the context in which it is used. This is known as type inference.

When you assign a lambda expression to a functional interface type, the compiler automatically infers the target type based on the signature of the abstract method in the functional interface. This allows you to write concise code without having to explicitly specify the type of the lambda expression.

Here's an example to illustrate lambda type inference in Java:

```java
// Functional interface with a single abstract method
interface MyFunction {
    void doSomething();
}

public class Main {
    public static void main(String[] args) {
        // Lambda expression assigned to a functional interface type
        MyFunction lambda = () -> System.out.println("Doing something");
        
        // Calling the method defined by the functional interface
        lambda.doSomething();
    }
}
```

In this example, the lambda expression `() -> System.out.println("Doing something")` is assigned to a variable of type `MyFunction`. Since `MyFunction` is a functional interface with a single abstract method `doSomething()`, the compiler infers that the lambda expression implements this method.

It's important to note that lambda expressions in Java are inherently tied to functional interfaces, which are interfaces with a single abstract method. The type of a lambda expression is determined by the functional interface to which it is assigned.

If the lambda expression has multiple parameters or a return type, the compiler infers the types of these parameters and return type based on the context in which the lambda expression is used and the target functional interface's method signature. You don't need to specify these types explicitly; the compiler handles it for you through type inference.

## Functional interfaces

The [java.util.function][juf] package in Java provides a variety of functional interfaces that can be used with lambda expressions and method references. Here is a list of some commonly used functional interfaces from this package:

1. **Supplier<T>**: Represents a supplier of results. It has a single method `T get()` which does not take any arguments and returns a result of type T.

2. **Consumer<T>**: Represents an operation that accepts a single input argument and returns no result. It has a single method `void accept(T t)`.

3. **BiConsumer<T, U>**: Represents an operation that accepts two input arguments and returns no result. It has a single method `void accept(T t, U u)`.

4. **Predicate<T>**: Represents a predicate (boolean-valued function) of one argument. It has a single method `boolean test(T t)`.

5. **BiPredicate<T, U>**: Represents a predicate (boolean-valued function) of two arguments. It has a single method `boolean test(T t, U u)`.

6. **Function<T, R>**: Represents a function that accepts one argument and produces a result. It has a single method `R apply(T t)`.

7. **BiFunction<T, U, R>**: Represents a function that accepts two arguments and produces a result. It has a single method `R apply(T t, U u)`.

8. **UnaryOperator<T>**: Represents an operation on a single operand that produces a result of the same type as its operand. It extends Function<T, T>.

9. **BinaryOperator<T>**: Represents an operation upon two operands of the same type, producing a result of the same type as the operands. It extends BiFunction<T, T, T>.

10. **Supplier<T>**: Represents a supplier of results. It has a single method `T get()` which does not take any arguments and returns a result of type T.

11. **DoubleSupplier, IntSupplier, LongSupplier**: Specialized versions of Supplier that return double, int, and long values respectively.

12. **IntPredicate, LongPredicate, DoublePredicate**: Specialized versions of Predicate that operate on int, long, and double values respectively.

13. **IntFunction<R>, LongFunction<R>, DoubleFunction<R>**: Specialized versions of Function that accept an int, long, or double argument and produce a result of type R.

14. **ToIntFunction<T>, ToLongFunction<T>, ToDoubleFunction<T>**: Represents a function that produces an int, long, or double result and accepts an argument of type T.

15. **IntToDoubleFunction, IntToLongFunction, LongToIntFunction, LongToDoubleFunction, DoubleToIntFunction, DoubleToLongFunction**: Represents functions that accept an int, long, or double value and produce a double, long, or int result respectively.

16. **IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator**: Represents an operation on a single operand of the given type that produces a result of the same type.

17. **IntBinaryOperator, LongBinaryOperator, DoubleBinaryOperator**: Represents an operation upon two operands of the given type and produces a result of the same type.

These are some of the commonly used functional interfaces available in the [java.util.function][juf] package. They provide a way to represent functions as objects, enabling functional programming constructs in Java.

<!-- References -->

[juf]: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html "java.util.function"