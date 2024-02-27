# Java Core

Java Core, also known as Java Standard Edition (Java SE), is the fundamental platform for developing and running Java programs. It provides the core libraries, APIs, and tools necessary for building standalone desktop applications, command-line utilities, and smaller-scale Java applications.

Key components and features of Java Core include:

1. **Java Development Kit (JDK)**: The JDK is a software development kit that includes tools for compiling, debugging, and running Java programs. It includes the Java compiler (`javac`), Java Virtual Machine (JVM), and various development utilities.

2. **Java Language**: Java Core includes the Java programming language itself, which is an object-oriented, class-based language designed for simplicity, readability, and portability. Java's syntax is similar to C and C++, making it familiar to developers from those languages.

3. **Core Libraries (Java API)**: Java Core provides a comprehensive set of core libraries, also known as the Java API (Application Programming Interface). These libraries include classes and interfaces for common tasks such as string manipulation, I/O operations, networking, concurrency, collections, and more. The Java API is organized into packages such as `java.lang`, `java.io`, `java.util`, `java.net`, etc.

4. **Platform Independence**: One of Java's key features is platform independence. Java programs can run on any platform that supports the Java Virtual Machine (JVM), including Windows, macOS, Linux, and various other operating systems, without modification. This is achieved through the "write once, run anywhere" (WORA) principle.

5. **Garbage Collection**: Java Core includes a garbage collector that automatically manages memory allocation and deallocation. Developers do not need to manually allocate or free memory as in languages like C or C++.

6. **Multithreading and Concurrency**: Java Core provides built-in support for multithreading and concurrency, allowing developers to create multithreaded applications easily. Java's `java.util.concurrent` package provides high-level concurrency utilities, thread pools, synchronization mechanisms, and atomic variables.

7. **Security**: Java Core includes a robust security model with features such as bytecode verification, sandboxing, and a security manager. This helps ensure that Java applications are secure by default and protected against common security vulnerabilities.

8. **Reflection**: Java Core supports reflection, which allows programs to inspect and modify their own structure at runtime. Reflection enables dynamic loading of classes, introspection of objects, and invocation of methods at runtime.

Java Core serves as the foundation for higher-level Java platforms such as [Java Enterprise Edition (Java EE)](java-ee.md) and Java Micro Edition (Java ME). It is widely used for developing a wide range of applications, including desktop GUI applications, web applications, mobile apps, embedded systems, and more.

## Relations with Jakarta EE

Java Core (Java SE) and [Jakarta EE](jakarta-ee.md) (formerly known as Java EE) are related in the sense that Jakarta EE builds upon the foundation provided by Java Core. Here's how they are related:

1. **Platform Foundation**:
   - Java Core (Java SE) forms the foundation of the Java platform. It provides the core libraries, APIs, and tools necessary for developing and running Java applications on desktops, servers, and other environments.
   - Jakarta EE builds upon Java Core by adding additional APIs and specifications specifically tailored for developing enterprise-level applications, particularly web-based and distributed applications.

2. **Compatibility**:
   - Jakarta EE specifications and APIs are designed to be compatible with Java Core. Jakarta EE applications can leverage the core Java APIs provided by Java SE, such as the collections framework, I/O libraries, concurrency utilities, and more.
   - Jakarta EE application servers, which implement the Jakarta EE specifications, are built on top of Java SE and utilize its runtime environment, including the Java Virtual Machine (JVM) and core libraries.

3. **Integration**:
   - Jakarta EE applications often integrate with core Java technologies and libraries. For example, Jakarta EE web applications commonly use Servlets and [JavaServer Pages (JSP)](jsp.md), which are part of the Java Core (Java EE) platform.
   - Jakarta EE applications can also leverage other core Java APIs and technologies for tasks such as database access (e.g., JDBC), XML processing (e.g., JAXB), JSON processing (e.g., JSON-P), and more.

4. **Development Process**:
   - Both Java Core and Jakarta EE are developed and maintained by the broader Java community. While Java Core is governed by Oracle Corporation as part of the Java Platform, Jakarta EE is developed under the governance of the Eclipse Foundation.
   - The Eclipse Foundation oversees the development of Jakarta EE specifications, working with contributors from various organizations and individuals within the Jakarta EE community.

In summary, Java Core and Jakarta EE are closely related components of the Java platform. Java Core provides the foundational libraries and runtime environment for all Java applications, including Jakarta EE applications. Jakarta EE extends Java Core by adding additional APIs and specifications tailored for enterprise application development, particularly in the areas of web development, distributed computing, and transaction processing.
