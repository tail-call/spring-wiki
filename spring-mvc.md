# Spring MVC

Spring MVC (Model-View-Controller) - это фреймворк для создания веб-приложений на основе паттерна проектирования MVC. В Spring MVC модель представляет бизнес-логику приложения, представление (View) отображает информацию пользователю, а контроллер (Controller) обрабатывает входящие запросы и управляет взаимодействием между моделью и представлением.

Основные компоненты Spring MVC:

1. **DispatcherServlet**: Центральный сервлет, который обрабатывает все входящие запросы, направляет их на соответствующие контроллеры и обрабатывает представления.

2. **Controller**: Компонент, который принимает входящие запросы, обрабатывает их и возвращает модель и представление в ответ.

3. **Model**: Представляет бизнес-логику и данные приложения.

4. **View**: Отображает данные, предоставленные моделью, пользователю. Обычно представления представляют собой HTML-шаблоны, но могут быть и другие типы (JSON, XML и т. д.).

5. **HandlerMapping**: Определяет, какой контроллер должен обрабатывать определенный запрос.

6. **ViewResolver**: Определяет, какое представление должно быть использовано для отображения данных.

Пример контроллера в Spring MVC:

```java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Spring MVC!");
        return "hello"; // возвращает имя представления
    }
}
```

Пример представления (hello.jsp):

```jsp
<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC Example</title>
</head>
<body>
    <h1>${message}</h1>
</body>
</html>
```

Это основы Spring MVC. Он обладает множеством функций, таких как валидация данных, обработка исключений, работа с формами и т. д. В целом, Spring MVC предоставляет мощный инструментарий для разработки веб-приложений в Java.