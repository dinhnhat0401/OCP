# JDBC

Provide an application programming interface (API) that can access and manipulate relational databases and use SQL to perform CRUD operations.

## Describe the interfaces that Make Up the Core of JDBC API

### Driver

There are 4 type of implementations of JDBC drivers.

Type 1: Drivers that implement the JDBC API as a mapping to another data access API.

Type 2: Drivers that are written partly in the Java programming language and partly in native code. These drivers use a native client library specific to the data source to which they connect. Again, because of the native code, their portability is limited. Oracle's OCI (Oracle Call Interface) client-side driver is an example of a Type 2 driver.

Type 3: Drivers that use a pure Java client and communicate with a middleware server using a database-independent protocol. The middleware server then communicates the client's requests to the data source.

Type 4: Drivers that are pure Java and implement the network protocol for a specific data source. The client connects directly to the data source.

#### HOW

+ To set up the Driver to run a quick sample

```
1. Go to https://dev.mysql.com/downloads/connector/j/, get the latest version of Connector/J

2. Remember to set the classpath to include path of the connector jar file.
If we don't set it, below errors can occur:

No suitable driver found for jdbc:mysql://127.0.0.1:3306/msystem_development

java.lang.ClassNotFoundException: com.mysql.jdbc:Driver
```

+ To set up the CLASSPATH

```
Method 1:
export CLASSPATH=".:mysql-connector-java-8.0.15.jar"
java MyClassFile

Method 2:
java -cp .:mysql-connector-java-8.0.15.jar MyClassFile
```

#### DriverManager

- uses factory pattern to "construct" an instance of a Connection object by passing a string to its getConnection() method 


### Connection

* java.sql.Connection interface defines the contract for an object that represents the connection

### JDBC URLs

jdbc:<subprotocol>:<subname>

```
subprotocol example:
jdbc:derby
jdbc:mysql
jdbc:oracle

jdbc:mysql://localhost:3306/mydb
```

### Statement

* Provides an abstraction of the functionality needed to get a SQL statement to execute on a database.

### ResultSet Interfaces

* When a statement object is closed, its current ResultSet object is also closed if exist.
* An abstraction functionality needed to process a result set that is returned from the SQL query.

example:

```
public ResultSet executeQuery(String sql) throws SQLException
```

## Identify the components Required to connect to a DB using the DriverManager class



## Submit Queries and Read Result from DB

### ResultSet cursor types

1. TYPE_FORWARD_ONLY: default value for a ResultSet
2. TYPE_SCROLL_INSENSITIVE: A cursor position can be moved in the result forward or backward, or positioned to a particular cursor location.
3. TYPE_SCROLL_SENSITIVE: A cursor can be moved in the results forward or backward, or positioned to a particular cursor location. Any changes made to the underlying data are reflected in the open result set. Not implemented in a database or JDBC driver very often.

### Data concurrency with resultset

1. CONCUR_READ_ONLY: default value for result set concurrency. Any open result set is read-only and cannot be modified or changed.
2. CONCUR_UPDATABLE: A result set can be modified through the ResultSet methods while the result set is open.


