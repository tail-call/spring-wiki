# Java Naming and Directory Interface

JNDI (Java Naming and Directory Interface) - это стандартный интерфейс Java API, который предоставляет единый способ доступа к различным сервисам и объектам, используемым в Java-приложениях. Он часто используется для поиска и доступа к ресурсам, таким как базы данных, [JMS (Java Message Service)](05-jms.md), [EJB (Enterprise JavaBeans)](06-ejb.md) и другим компонентам, которые могут быть управляемыми контейнерами, такими как серверы приложений.

JNDI предоставляет абстракцию над различными реестрами и источниками данных, позволяя Java-приложениям получать доступ к этим ресурсам независимо от их конкретной реализации или расположения.

В контексте Spring, JNDI может использоваться для внедрения ресурсов, таких как источники данных (DataSource), в Spring бины. Это может быть особенно полезно, когда вы хотите использовать настройки и ресурсы, определенные в контейнере приложений, таком как Tomcat, JBoss или WebLogic.

Пример использования JNDI для внедрения DataSource в Spring конфигурации:

```xml
<bean id="dataSource" class="org.springframework.jndi.JndiObjectFactoryBean">
    <property name="jndiName" value="java:comp/env/jdbc/myDataSource"/>
</bean>
```

В этом примере `jndiName` устанавливает путь к ресурсу DataSource, определенному в контейнере приложений через JNDI. Когда приложение запускается, Spring будет искать ресурс DataSource в контексте JNDI и использовать его для настройки объекта `dataSource`.

## В Java

Вот пример использования JNDI для доступа к ресурсу DataSource в коде Java:

```java
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JndiExample {

    public static void main(String[] args) {
        try {
            // Инициализация контекста JNDI
            InitialContext initialContext = new InitialContext();
            
            // Получение ресурса DataSource из JNDI
            DataSource dataSource = (DataSource) initialContext.lookup("java:comp/env/jdbc/myDataSource");
            
            // Получение соединения из DataSource
            try (Connection connection = dataSource.getConnection()) {
                // Ваш код для работы с соединением
                System.out.println("Успешное подключение к базе данных!");
            } catch (SQLException e) {
                System.err.println("Ошибка при получении соединения с базой данных: " + e.getMessage());
            }
        } catch (NamingException e) {
            System.err.println("Ошибка при инициализации контекста JNDI: " + e.getMessage());
        }
    }
}
```

В этом примере:

1. Мы создаем объект `InitialContext`, который инициализирует контекст JNDI.
2. Мы используем метод `lookup()` для поиска ресурса DataSource с именем `java:comp/env/jdbc/myDataSource` в контексте JNDI.
3. После того, как мы получаем DataSource, мы можем использовать его для получения соединения с базой данных, вызывая метод `getConnection()`.
4. Мы использовали конструкцию `try-with-resources` для автоматического закрытия соединения после использования.
5. Ловим исключения `NamingException` и `SQLException`, чтобы обработать возможные ошибки при доступе к ресурсам через JNDI.