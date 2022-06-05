## Todo Tasks

1. Replace `java.util.Date` with `java.time.LocalDate` or `java.time.LocalDateTime`
2. Replace `spring.datasource.url=jdbc:h2:mem:testdb;NON_KEYWORDS=USER` with `@Table(name = "USER_DETAILS")` and also column name should be `userName`
3. Replace H2 `sysdate()` function(deprecated) with `CURRENT_DATE()` function
4. Replace `javax` with `jakarta` in model or entities from `Spring Boot 3.0.0` version
5. Replace `private static List<User> users = new ArrayList<>();` with `private static final List<User> users = new ArrayList<>();`
6. Replace all generics with respective type for example `List list = new ArrayList<>();` replace with `List<DataType> list = new ArrayList<>();`
7. Integrate Project Lombok library https://projectlombok.org/features/all -- Optional
8. `serialVersionUID` can be annotated with `@Serial` annotation, for example:
```java
   @Serial
   private static final long serialVersionUID = 3518170101751491969L;
```
