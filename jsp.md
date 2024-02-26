# JSP

JavaServer Pages (JSP) is a technology used to develop dynamic web pages based on Java technology. It enables developers to embed Java code in HTML pages, allowing for the creation of dynamic content that interacts with server-side logic.

Key features and concepts of JavaServer Pages include:

1. **Server-Side Scripting**: JSP allows developers to embed Java code directly into HTML pages using special tags, such as `<% %>` for scriptlets, `<%= %>` for expressions, and `<%@ %>` for directives. This enables the generation of dynamic content that can be processed on the server before being sent to the client.

2. **Seamless Integration with Java**: JSP pages are compiled into Java servlets by the web container at runtime. This seamless integration with Java allows developers to leverage existing Java libraries, frameworks, and APIs within their JSP pages, making it a powerful tool for building complex web applications.

3. **Tag Libraries**: JSP supports the use of custom tag libraries, which encapsulate reusable components and functionality. Tag libraries provide a higher level of abstraction and allow developers to create more modular and maintainable code.

4. **[Expression Language (EL)](jsp-el.md)**: JSP includes an Expression Language (EL), which provides a simplified syntax for accessing and manipulating data stored in [JavaBeans](javabeans.md) components, request parameters, session attributes, and other objects available in the JSP environment.

5. **Implicit Objects**: JSP provides several implicit objects, such as request, response, session, application, out, and pageContext, which are automatically available within JSP pages. These objects provide access to various aspects of the request and response cycle, session management, and application context.

6. **MVC Architecture**: JSP is often used in conjunction with servlets and JavaBeans within the Model-View-Controller (MVC) architectural pattern. Servlets handle the request processing, JSP pages represent the view layer for presenting dynamic content, and JavaBeans encapsulate the application logic and data model.

7. **Dynamic Content Generation**: With JSP, developers can generate dynamic content based on user input, database queries, business logic, or any other server-side processing. This allows for the creation of interactive and data-driven web applications.

Overall, JavaServer Pages is a versatile technology for building dynamic web applications in Java. It provides a familiar syntax for Java developers and seamlessly integrates with other Java technologies, making it a popular choice for web development. However, it's worth noting that newer approaches such as servlets with template engines or server-side frameworks like Spring MVC have gained popularity in recent years for building modern web applications.

## Example

Here's a simple example of a JavaServer Pages (JSP) file that demonstrates basic functionality:

<!-- php syntax highlighting seems nice enough -->
```php
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple JSP Example</title>
</head>
<body>
    <h1>Hello, World!</h1>
    
    <%-- Scriptlet: Java code embedded within <% %> --%>
    <% 
        String name = "John";
        out.println("Welcome, " + name + "!");
    %>
    
    <br>
    
    <%-- Expression: Evaluate and print a Java expression within <%= %> --%>
    <% 
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
    %>
    <p>The sum of <%= num1 %> and <%= num2 %> is <%= sum %>.</p>
    
    <br>
    
    <%-- Declaration: Define Java methods or variables using <%! %> --%>
    <%!
        // Define a Java method
        public int calculateProduct(int x, int y) {
            return x * y;
        }
        
        // Define a Java variable
        String message = "Welcome to our website!";
    %>
    
    <p><%= message %></p>
    
    <%-- Expression Language (EL): Accessing Java objects using ${} --%>
    <p>${"Hello, EL!"}</p>
    
    <%-- Include another JSP file --%>
    <%@ include file="footer.jsp" %>
</body>
</html>
```

In this example:

- We start with the standard JSP directive (`<%@ page %>`) to set the page language and character encoding.
- We then have HTML markup mixed with JSP elements.
- Scriptlets (`<% %>`) are used to embed Java code within the page. We declare a string variable `name` and print a welcome message.
- Expressions (`<%= %>`) are used to evaluate and print Java expressions within the HTML content. Here, we calculate the sum of two numbers.
- Declarations (`<%! %>`) allow us to define Java methods or variables that are available throughout the JSP page. Here, we define a method `calculateProduct` and a variable `message`.
- We demonstrate accessing variables using [Expression Language (EL)](jsp-el.md) syntax `${}`.
- Finally, we include another JSP file using `<%@ include %>`, which allows for modularization and reuse of code.