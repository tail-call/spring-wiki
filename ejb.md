# EJB

Enterprise JavaBeans (EJB) is a server-side component architecture for the development and deployment of distributed enterprise applications in Java. It simplifies the development of scalable, transactional, and secure enterprise applications by providing a standardized component model for building business logic.

There are several types of Enterprise JavaBeans:

1. **Session Beans**: Session beans represent business logic or workflows in the application. There are two types of session beans:

   - **Stateless Session Beans**: These beans do not maintain conversational state between method invocations and are designed to handle short-lived tasks.
   
   - **Stateful Session Beans**: These beans maintain conversational state between method invocations, allowing them to store client-specific data throughout a session. They are useful for implementing shopping carts, user sessions, etc.

2. **[Entity Beans (Deprecated in EJB 3.x)](entity-beans.md)**: Entity beans represent persistent data entities in the application. They are typically used to model data stored in a database and provide an object-oriented view of database tables. However, entity beans have been deprecated in EJB 3.x in favor of Java Persistence API (JPA).

3. **Message-Driven Beans**: Message-driven beans (MDBs) are used for processing asynchronous messages in the Java Message Service (JMS) environment. They listen for incoming messages from JMS queues or topics and execute business logic in response to these messages.

Key features of Enterprise JavaBeans include:

- **Transaction Management**: EJB containers provide built-in support for declarative transaction management, allowing developers to specify transactional behavior using annotations or deployment descriptors.

- **Security**: EJB containers enforce security policies defined by the application, ensuring that only authorized users can access protected resources and invoke EJB methods.

- **Concurrency Control**: EJB containers manage concurrent access to session beans, ensuring thread safety and scalability of the application.

- **Remote Method Invocation**: EJBs support remote method invocation (RMI) and allow clients to invoke EJB methods across different JVMs and physical machines, making them suitable for distributed applications.

- **Dependency Injection**: EJB 3.x introduced dependency injection (DI) for injecting resources, such as data sources, JMS resources, and other EJBs, into session beans and MDBs.

Overall, Enterprise JavaBeans provide a powerful and standardized framework for building enterprise applications in Java. They promote modularity, scalability, and maintainability by encapsulating business logic into reusable and interoperable components.