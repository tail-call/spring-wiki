# Java EE

Java Platform, Enterprise Edition (Java EE), formerly known as Java 2 Platform, Enterprise Edition (J2EE), is a collection of specifications and APIs for developing and deploying enterprise-level Java applications. Java EE provides a robust and scalable platform for building distributed, transactional, and multi-tiered applications.

Key features and components of Java EE include:

1. **Servlets and JSP**: Servlets and JavaServer Pages (JSP) provide the foundation for building dynamic web applications in Java. Servlets handle HTTP requests and responses, while JSP allows embedding Java code within HTML pages to generate dynamic content.

2. **Enterprise JavaBeans (EJB)**: EJB is a component model for building server-side business logic in Java EE applications. It includes session beans for business logic, entity beans for persistent data entities (deprecated in EJB 3.x), and message-driven beans for asynchronous messaging.

3. **Java Persistence API (JPA)**: JPA is a Java specification for object-relational mapping (ORM), allowing developers to map Java objects to relational database tables and perform database operations using object-oriented paradigms.

4. **Java Message Service (JMS)**: JMS provides a standard messaging API for sending and receiving messages between distributed applications. It supports both point-to-point and publish-subscribe messaging models.

5. **Java Transaction API (JTA)**: JTA is a Java API for managing distributed transactions in Java EE applications. It provides support for transaction demarcation, transaction propagation, and distributed transaction coordination.

6. **Java Naming and Directory Interface (JNDI)**: JNDI is a Java API for accessing naming and directory services in Java EE applications. It provides a standard way to look up and retrieve resources, such as data sources, EJB components, and JMS destinations.

7. **Java EE Web Profile**: The Java EE Web Profile is a subset of the full Java EE platform tailored for web applications. It includes essential APIs such as Servlets, JSP, JPA, JTA, and others, providing a lightweight and streamlined platform for developing web-based applications.

8. **Security**: Java EE provides built-in support for application security, including authentication, authorization, and data encryption. It allows developers to secure applications using declarative security annotations or programmatic security APIs.

9. **Dependency Injection (CDI)**: Contexts and Dependency Injection (CDI) is a lightweight dependency injection framework in Java EE for managing object dependencies and lifecycle. It allows components to be loosely coupled and promotes modular and reusable application design.

Java EE applications are typically deployed to Java EE-compliant application servers, such as Apache Tomcat, WildFly, GlassFish, and IBM WebSphere. These servers provide runtime environments that implement the Java EE specifications and support the deployment and execution of Java EE applications.

Overall, Java EE provides a comprehensive platform for building enterprise-grade applications, offering a wide range of APIs and services for developing scalable, secure, and interoperable software solutions.

## Differences from Jakarta EE

Java EE (Java Enterprise Edition) and [Jakarta EE](jakarta-ee.md) (formerly known as Java EE) are both platforms for building enterprise-scale applications in Java. However, there are some differences between them, primarily related to the evolution of the platform's governance and development process:

1. **Transition from Oracle to the Eclipse Foundation**:
   - Java EE was originally developed by Sun Microsystems and later maintained by Oracle Corporation after Oracle's acquisition of Sun. However, Oracle decided to transition the stewardship of Java EE to the Eclipse Foundation in 2017 due to concerns about the pace of innovation and community involvement.
   - Jakarta EE is the result of this transition, with the Eclipse Foundation taking over the development and evolution of the platform. Jakarta EE inherits much of its technology from Java EE but is developed under the Eclipse Foundation's governance model, which emphasizes open-source collaboration and community-driven development.

2. **Branding and Naming**:
   - Java EE refers to the platform's earlier versions and specifications developed under the stewardship of Sun Microsystems and later Oracle Corporation.
   - Jakarta EE refers to the platform's current and future versions developed under the governance of the Eclipse Foundation. It inherits much of its technology and specifications from Java EE but operates under a new name due to trademark considerations.

3. **Licensing and Intellectual Property**:
   - Java EE was developed under Oracle's licensing and intellectual property policies, which included commercial licensing for certain components and restrictions on the use of the Java EE trademark.
   - Jakarta EE is developed under the Eclipse Foundation's open-source licensing model, which allows for greater flexibility and collaboration among contributors. The use of the Jakarta EE trademark is also governed by the Eclipse Foundation.

4. **Community Involvement and Governance**:
   - Java EE development was primarily driven by Oracle Corporation, with contributions from the broader Java community. However, there were concerns about the level of community involvement and the pace of innovation under Oracle's stewardship.
   - Jakarta EE development is governed by the Eclipse Foundation, which has a strong emphasis on open-source collaboration, community involvement, and transparent decision-making processes. Jakarta EE development is driven by working groups, steering committees, and contributions from various organizations and individuals within the Jakarta EE community.

In summary, while Java EE and Jakarta EE share many similarities in terms of technology and specifications, Jakarta EE represents a new phase in the platform's development under the governance of the Eclipse Foundation. Jakarta EE continues to evolve and innovate on the foundation established by Java EE, with a renewed focus on open-source collaboration, community involvement, and the needs of enterprise Java developers.
