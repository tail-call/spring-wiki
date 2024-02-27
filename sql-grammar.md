# SQL grammar

Грамматика SQL включает в себя различные типы операторов, выражений и инструкций для выполнения запросов к базам данных. 

Вот краткий обзор основных компонентов грамматики SQL:

1. **[DDL (Data Definition Language)](#data-definition-language)**: Этот поднабор SQL используется для определения структуры базы данных. Он включает в себя операторы для создания, изменения и удаления объектов базы данных, таких как таблицы, индексы, представления и т. д. Примеры таких операторов: CREATE TABLE, ALTER TABLE, DROP TABLE и другие.

2. **[DML (Data Manipulation Language)](#data-manipulation-language)**: DML используется для управления данными внутри базы данных. Этот поднабор включает операторы для добавления, изменения, удаления и выборки данных из таблиц. Примеры операторов DML: SELECT, INSERT, UPDATE, DELETE.

3. **[DCL (Data Control Language)](#data-control-language)**: DCL содержит операторы, используемые для управления правами доступа и безопасностью данных в базе данных. Примеры операторов DCL: GRANT, REVOKE.

4. **[TCL (Transaction Control Language)](#transaction-control-language)**: TCL используется для управления транзакциями в базе данных. Он включает операторы для управления транзакциями, такими как COMMIT, ROLLBACK, SAVEPOINT.


Это лишь краткое введение в грамматику SQL. Фактически, каждая СУБД (система управления базами данных) может иметь свои особенности и дополнения к языку SQL. Если вам нужно конкретное описание грамматики для определенной СУБД, вам лучше обратиться к документации этой СУБД.

## Data Definition Language

DDL (Data Definition Language) - это поднабор SQL, который используется для определения структуры базы данных. Он включает операторы для создания, изменения и удаления объектов базы данных, таких как таблицы, индексы, представления и другие.

Вот некоторые основные операторы DDL:

1. **CREATE**: Создает новые объекты базы данных, такие как таблицы, индексы, представления и процедуры. Например:
   ```
   CREATE TABLE tablename (
       column1 datatype,
       column2 datatype,
       ...
   );
   ```

2. **ALTER**: Изменяет структуру существующих объектов базы данных. Например:
   ```
   ALTER TABLE tablename
   ADD columnname datatype;
   ```

3. **DROP**: Удаляет объекты базы данных. Например:
   ```
   DROP TABLE tablename;
   ```

4. **TRUNCATE**: Удаляет все данные из таблицы, но сохраняет ее структуру. Например:
   ```
   TRUNCATE TABLE tablename;
   ```

5. **RENAME**: Переименовывает существующие объекты базы данных. Например:
   ```
   RENAME TABLE oldname TO newname;
   ```

Эти операторы позволяют администраторам баз данных управлять структурой базы данных, создавать новые объекты, изменять существующие и удалять ненужные.

## Data Manipulation Language

DML (Data Manipulation Language) is a subset of SQL (Structured Query Language) that allows users to manipulate data stored in the database. It primarily consists of statements for querying, inserting, updating, and deleting data within database tables. Here's a brief overview of DML statements:

1. **SELECT**: The `SELECT` statement retrieves data from one or more tables in the database. It allows you to specify the columns you want to retrieve, apply filtering conditions with the `WHERE` clause, sort the results with the `ORDER BY` clause, and more.

   Example:
   ```
   SELECT column1, column2 FROM table WHERE condition;
   ```

2. **INSERT**: The `INSERT` statement adds new rows of data into a table in the database.

   Example:
   ```
   INSERT INTO table (column1, column2) VALUES (value1, value2);
   ```

3. **UPDATE**: The `UPDATE` statement modifies existing data in a table by changing the values of one or more columns.

   Example:
   ```
   UPDATE table SET column1 = value1, column2 = value2 WHERE condition;
   ```

4. **DELETE**: The `DELETE` statement removes rows of data from a table based on specified conditions.

   Example:
   ```
   DELETE FROM table WHERE condition;
   ```

5. **MERGE**: The `MERGE` statement performs insert, update, or delete operations on a target table based on the results of a join with a source table.

   Example:
   ```
   MERGE INTO target_table USING source_table ON condition
   WHEN MATCHED THEN UPDATE SET ...
   WHEN NOT MATCHED THEN INSERT ...
   ```

DML statements are fundamental for managing data within a database. They allow users to retrieve, add, modify, and remove data, which are essential operations for interacting with database systems. These statements are used extensively in database applications to perform various data manipulation tasks.

## Data Control Language

Data Control Language (DCL) is a subset of SQL (Structured Query Language) used for controlling access to the database and managing permissions. DCL statements are typically used by database administrators to grant or revoke permissions to database objects, such as tables, views, procedures, and functions. The two main DCL statements are:

1. **GRANT**: The `GRANT` statement is used to give specific privileges or permissions to database users or roles. These privileges include the ability to perform various actions, such as SELECT, INSERT, UPDATE, DELETE, EXECUTE, and others, on specific database objects.

   Syntax:
   ```
   GRANT privilege(s) ON object TO user_or_role;
   ```

   Example:
   ```
   GRANT SELECT, INSERT ON table_name TO user1;
   ```

2. **REVOKE**: The `REVOKE` statement is used to take away previously granted privileges or permissions from database users or roles.

   Syntax:
   ```
   REVOKE privilege(s) ON object FROM user_or_role;
   ```

   Example:
   ```
   REVOKE INSERT ON table_name FROM user1;
   ```

DCL statements are essential for ensuring the security and integrity of the database by controlling who can access or manipulate its data. Database administrators use these statements to grant appropriate permissions to users and roles based on their responsibilities and requirements, thereby enforcing security policies and preventing unauthorized access or modifications to sensitive data.

## Transaction Control Language

Transaction Control Language (TCL) is a subset of SQL (Structured Query Language) used to manage transactions within a database. Transactions are units of work performed against a database, which must be executed as a single, indivisible operation. TCL statements allow you to control the beginning and ending of transactions, as well as their outcome. The main TCL statements include:

1. **COMMIT**: The `COMMIT` statement is used to permanently save the changes made during the current transaction to the database. Once a `COMMIT` statement is executed, all changes made by the transaction become visible to other transactions.

   Syntax:
   ```
   COMMIT;
   ```

2. **ROLLBACK**: The `ROLLBACK` statement is used to undo the changes made during the current transaction and restore the database to its state before the transaction began. It effectively cancels the transaction, discarding any modifications made.

   Syntax:
   ```
   ROLLBACK;
   ```

3. **SAVEPOINT**: The `SAVEPOINT` statement is used to set a named point within a transaction to which you can later roll back. It allows you to create intermediate points in a transaction, enabling partial rollback instead of rolling back the entire transaction.

   Syntax:
   ```
   SAVEPOINT savepoint_name;
   ```

4. **RELEASE SAVEPOINT**: The `RELEASE SAVEPOINT` statement is used to remove a savepoint that was previously defined within the current transaction. It signifies that you no longer need to roll back to that savepoint.

   Syntax:
   ```
   RELEASE SAVEPOINT savepoint_name;
   ```

5. **ROLLBACK TO SAVEPOINT**: The `ROLLBACK TO SAVEPOINT` statement is used to undo the changes made since a specific savepoint within the current transaction. It rolls back the transaction to the specified savepoint, discarding any modifications made after that point.

   Syntax:
   ```
   ROLLBACK TO SAVEPOINT savepoint_name;
   ```

TCL statements are essential for maintaining the integrity and consistency of the database by controlling the execution and outcome of transactions. They allow you to ensure that transactions are completed successfully or rolled back safely in case of errors or other issues.