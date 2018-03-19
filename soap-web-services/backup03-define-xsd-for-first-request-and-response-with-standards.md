
## Complete Code Example


### /example-files/course-details.xsd

```
<?xml version="1.0" encoding="UTF-8"?>

<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" 
targetNamespace="http://in28minutes.com/courses" 
xmlns:tns="http://in28minutes.com/courses" elementFormDefault="qualified">
	
	<xs:element name="GetCourseDetailsRequest">
		<xs:complexType>
			<xs:sequence>
				<xs:element name= "id" type="xs:integer"/>
			</xs:sequence>	
		</xs:complexType>
	</xs:element>
	
	<xs:element name="GetCourseDetailsResponse">
		<xs:complexType>
			<xs:sequence>
				<xs:element name= "CourseDetails" type="tns:CourseDetails"/>
			</xs:sequence>	
		</xs:complexType>
	</xs:element>
	
	<xs:complexType name="CourseDetails">
		<xs:sequence>
			<xs:element name="id" type="xs:integer"/>
			<xs:element name="name" type="xs:string"/>
			<xs:element name="description" type="xs:string"/>
		</xs:sequence>
	</xs:complexType>
	
</xs:schema>
```
---

### /example-files/Request.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<GetCourseDetailsRequest xmlns="http://in28minutes.com/courses" 
xsi:schemaLocation="http://in28minutes.com/courses course-details.xsd" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<id>123</id> <!-- numbers  -->
</GetCourseDetailsRequest>
```
---

### /example-files/Response.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<GetCourseDetailsResponse xmlns="http://in28minutes.com/courses"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://in28minutes.com/courses course-details.xsd">
	<CourseDetails>
		<id>123</id>
		<name>Spring in28minutes</name>
		<description>You would learn the basics of Spring Framework</description>
	</CourseDetails>
</GetCourseDetailsResponse>
```
---

### /pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.in28minutes.soap.webservices</groupId>
	<artifactId>soap-course-management</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>soap-course-management</name>
	<description>Demo project for Spring Boot</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web-services</artifactId>
		</dependency>

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

	<repositories>
		<repository>
			<id>spring-snapshots</id>
			<name>Spring Snapshots</name>
			<url>https://repo.spring.io/snapshot</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</repository>
		<repository>
			<id>spring-milestones</id>
			<name>Spring Milestones</name>
			<url>https://repo.spring.io/milestone</url>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>
	</repositories>

	<pluginRepositories>
		<pluginRepository>
			<id>spring-snapshots</id>
			<name>Spring Snapshots</name>
			<url>https://repo.spring.io/snapshot</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
		</pluginRepository>
		<pluginRepository>
			<id>spring-milestones</id>
			<name>Spring Milestones</name>
			<url>https://repo.spring.io/milestone</url>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</pluginRepository>
	</pluginRepositories>


</project>
```
---

### /src/main/java/com/in28minutes/soap/webservices/soapcoursemanagement/SoapCourseManagementApplication.java

```java
package com.in28minutes.soap.webservices.soapcoursemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapCourseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapCourseManagementApplication.class, args);
	}
}
```
---

### /src/main/resources/application.properties

```properties
```
---

### /src/test/java/com/in28minutes/soap/webservices/soapcoursemanagement/SoapCourseManagementApplicationTests.java

```java
package com.in28minutes.soap.webservices.soapcoursemanagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SoapCourseManagementApplicationTests {

	@Test
	public void contextLoads() {
	}

}
```
---
