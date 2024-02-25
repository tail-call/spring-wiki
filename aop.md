# Aspect-oriented programming

AOP (Aspect-Oriented Programming) в Spring представляет собой методологию, которая позволяет разделить перекрывающиеся аспекты бизнес-логики приложения от его основной функциональности. В основе AOP лежит концепция перехватчиков (interceptors) или советов (advices), которые применяются к определенным точкам выполнения в коде, таким как методы или события.

В Spring AOP аспекты представлены в виде обычных классов, содержащих логику, которая должна быть выполнена в определенной точке приложения. Эти аспекты могут быть применены к целевым объектам (бинам Spring) с помощью специальных аннотаций или XML-конфигурации.

Spring поддерживает следующие виды советов (advices):

1. **Before advice**: Совет, который выполняется перед выполнением целевого метода.

2. **After returning advice**: Совет, который выполняется после успешного завершения выполнения целевого метода.

3. **After throwing advice**: Совет, который выполняется после выброса исключения во время выполнения целевого метода.

4. **After (finally) advice**: Совет, который выполняется в любом случае после выполнения целевого метода.

5. **Around advice**: Совет, который полностью управляет выполнением целевого метода, включая его вызов.

## Аннотации

Вот полный список аннотаций AOP в Spring с примерами:

1. **@Aspect**: Объявляет класс как аспект.

Пример:
```java
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // логика аспекта здесь
}
```

2. **@Before**: Определяет совет, который будет выполнен перед выполнением целевого метода.

Пример:
```java
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.MyService.*(..))")
    public void logBeforeMethodExecution() {
        System.out.println("Before executing method");
    }
}
```

3. **@AfterReturning**: Определяет совет, который будет выполнен после успешного возвращения значения из целевого метода.

Пример:
```java
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @AfterReturning("execution(* com.example.MyService.*(..))")
    public void logAfterReturningMethodExecution() {
        System.out.println("After returning from method");
    }
}
```

4. **@AfterThrowing**: Определяет совет, который будет выполнен после выброса исключения из целевого метода.

Пример:
```java
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @AfterThrowing("execution(* com.example.MyService.*(..))")
    public void logAfterThrowingMethodExecution() {
        System.out.println("After throwing exception from method");
    }
}
```

5. **@After**: Определяет совет, который будет выполнен после выполнения целевого метода (независимо от того, было ли выброшено исключение или нет).

Пример:
```java
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @After("execution(* com.example.MyService.*(..))")
    public void logAfterMethodExecution() {
        System.out.println("After method execution");
    }
}
```

6. **@Around**: Определяет совет, который полностью управляет выполнением целевого метода, включая его вызов.

Пример:
```java
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.example.MyService.*(..))")
    public Object logAroundMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method execution");
        Object result = joinPoint.proceed();
        System.out.println("After method execution");
        return result;
    }
}
```

Это полный список аннотаций AOP в Spring с примерами их использования. Каждая аннотация представляет собой различный тип совета, который можно применить к целевому методу или точке в вашем приложении.