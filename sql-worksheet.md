# SQL Worksheet

## Ссылка на курс

https://stepik.org/course/63054/syllabus

## Термины и общая информация

* *Отношение* – это структура данных целиком, набор записей (в обычном понимании – таблица) , в  примере – это Сотрудник;
* *Кортеж* – это каждая строка , содержащая данные (более распространенный термин – запись ), например, `<001, Борин С.А, 234-01-23, программист>`, все кортежи в отношении должны быть различны;
* *Мощность* – число кортежей в таблице (проще говоря, число записей), в данном случае 3, мощность отношения может быть любой (от 0 до бесконечности), порядок следования кортежей - неважен;
* *Атрибут* – это столбец в таблице (более распространенный термин – поле ), в примере – Табельный номер, Фамилия И.О., Телефон, Должность) 
* *Размерность* – это число атрибутов в таблице, в данном случае – 4;
* размерность отношения должна быть больше 0, порядок следования атрибутов существенен;
* *Домен атрибута* – это допустимые значения (неповторяющиеся), которые можно занести в поле , например для атрибута Должность домен – {`инженер`, `программист`}.

Для ключевого поля использовать `INT PRIMARY KEY AUTO_INCREMENT`

Рекомендации по записи SQL запроса
* Ключевые слова: SQL не является регистрозависимым языком (CREATE и create - одно и тоже ключевое слово). 
* Ключевые слова SQL и типы данных рекомендуется  записывать прописными (большими) буквами.
* Имена таблиц и полей - строчными (маленькими) буквами.
* SQL-запрос можно писать на нескольких строках.
* В конце SQL-запроса ставится точка с запятой (хотя если Вы пишете один запрос, это необязательно).

Порядок выполнения
  
1. FROM
2. WHERE
3. GROUP BY
4. HAVING
5. SELECT
6. ORDER BY

## Ключевые слова и функции

### IF

Это типа как тернарник

```sql
SELECT title, amount, price, 
    IF(amount<4, price*0.5, price*0.7) AS sale
FROM book;
```

### BETWEEN, IN

```sql
SELECT title, amount 
FROM book
WHERE amount BETWEEN 5 AND 14;
```

```sql
SELECT title, author
FROM book
WHERE price BETWEEN 540.50 AND 800 AND amount IN (2, 3, 5, 7); 
```

### ORDER BY

```sql
SELECT title, author, price
FROM book
ORDER BY title;
```

```sql
SELECT title, author, price
FROM book
ORDER BY 1, 3 DESC;
```

### LIKE


```sql
SELECT * FROM book WHERE author LIKE '%М.%'
```

```sql
SELECT * FROM book WHERE title LIKE 'Поэм_'
```

```sql
SELECT title, author
FROM book
WHERE title LIKE '_% _%' AND (author LIKE '% С._.' OR author LIKE '% _.С.');
```

### DISTINCT

```sql
SELECT DISTINCT author
FROM book;
```

### MIN, MAX, AVG, SUM, COUNT, GROUP BY

`MIN()`, `MAX()`, `AVG()`, `SUM()` и `COUNT()` — групповые функции, применяются к группам

```sql
SELECT author, SUM(amount), COUNT(amount)
FROM book
GROUP BY author;
```

```sql
SELECT author, MIN(price) AS min_price
FROM book
GROUP BY author;
```

```sql
SELECT author, MIN(price) AS Минимальная_цена, MAX(price) AS Максимальная_цена, AVG(price) AS Средняя_цена
FROM book
GROUP BY author;
```

```sql
SELECT SUM(amount) AS Количество
FROM book;
```

### HAVING

Следует после  `GROUP BY`.

```sql
SELECT author, SUM(amount * price) AS Стоимость
FROM book
GROUP BY author
HAVING SUM(amount * price) > 5000;
```

```sql
SELECT author, SUM(amount * price) AS Стоимость
FROM book
WHERE title <> 'Идиот'
GROUP BY author
HAVING SUM(amount * price) > 5000
ORDER BY SUM(amount * price) DESC;
```

## Вложенные запросы

Могут быть в выражении:

```sql
SELECT title, author, price, amount
FROM book
WHERE price = (
   SELECT MIN(price) -- Вот он, вложенный запрос
   FROM book
);
```

```sql
SELECT author, title, price
FROM book
WHERE price <= (
    SELECT AVG(price)
    FROM book
)
ORDER BY price DESC;
```

```sql
SELECT title, author, amount 
FROM book
WHERE ABS(amount - (SELECT AVG(amount) FROM book)) > 3;
--                  ^
--            теперь он тут
```

```sql
SELECT author, title, price
FROM book
WHERE price - (SELECT MIN(price) FROM book) <= 150
ORDER BY price ASC;
```

А могут после `IN`:

```sql
SELECT species, owner, quantity, habitat_cost
FROM lizard
-- Владелец среди тех, у кого количество ящериц больше 12
WHERE owner IN (
    SELECT owner
    FROM lizard
    GROUP BY owner
    HAVING SUM(quantity) >= 12
);
```

```sql
SELECT author, title, amount
FROM book
WHERE amount IN (
    SELECT amount
    FROM book
    GROUP BY amount
    HAVING COUNT(amount) = 1
);
```

### ANY, ALL

```sql
SELECT title, author, amount, price
FROM book
WHERE amount < ALL (
    SELECT AVG(amount) 
    FROM book 
    GROUP BY author 
);
```



```sql
```

<!-- ^ yap this guy -->
