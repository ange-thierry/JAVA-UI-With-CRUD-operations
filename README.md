# Java UI with CRUD Operations

This is a Java Swing application built with the NetBeans Ant project system.

## Requirements

- JDK 8 or later
- MySQL Server
- NetBeans, or Apache Ant to build the project

## Database configuration

The application connects to the `comment` database on `localhost:3306` as the
`root` user. Set the database password in the `DB_PASSWORD` environment
variable before running the application. Do not store database credentials in
source files.

## Build and run

Open the project in NetBeans and use **Run Project**, or build it with Ant:

```text
ant clean jar
java -jar dist/login-001.jar
```
