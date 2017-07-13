# Useful Links
XML Schema - http://edutechwiki.unige.ch/en/XML_Schema_tutorial_-_Basics
WSDL URl - http://localhost:8080/ws/courses.wsdl

## Error
java.lang.NoClassDefFoundError: javax/wsdl/extensions/ExtensibilityElement

## Security with WS-Security
 - Authentication
 - Digital signatures
 - Certificates
 
 - Implementation -> XWSS - XML and Web Services Security.
   - Security Policy
   - XwsSecurityInterceptor

## Security Dependencies
```xml
	<dependency>
            <groupId>org.springframework.ws</groupId>
            <artifactId>spring-ws-security</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.security</groupId>
                    <artifactId>spring-security-core</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.wss</groupId>
            <artifactId>xws-security</artifactId>
            <version>3.0</version>
            <exclusions>
                <exclusion>
                    <groupId>javax.xml.crypto</groupId>
                    <artifactId>xmldsig</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>javax.activation</groupId>
            <artifactId>activation</artifactId>
            <version>1.1.1</version>
        </dependency>
```    

## Security Request
```xml
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
	<Header>
		<wsse:Security
			xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
			mustUnderstand="1">
			<wsse:UsernameToken>
				<wsse:Username>user</wsse:Username>
				<wsse:Password>password</wsse:Password>
			</wsse:UsernameToken>
		</wsse:Security>
	</Header>
	<Body>
		<GetCourseDetailsRequest xmlns="http://in28minutes.com/courses">
			<id>1</id>
		</GetCourseDetailsRequest>
	</Body>
</Envelope>
```
## securityPolicy.xml
<?xml version="1.0" encoding="UTF-8"?>
<xwss:SecurityConfiguration 
xmlns:xwss="http://java.sun.com/xml/ns/xwss/config">
	<xwss:RequireUsernameToken
		passwordDigestRequired="false" nonceRequired="false" />
</xwss:SecurityConfiguration>
