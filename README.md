# SOAP web services tp

A student soap web service example.

## Tech stack

- Java 11, built with Maven
- Spring Boot 2.1.8.RELEASE
- Spring Web (REST controllers)
- Spring Web Services (SOAP)
- Lombok
- WSDL4J

## Concepts covered

SOAP endpoint, inheritance.

## Project structure

- `com.isg.soa.soap.students`: GetStudentDetailsRequest, GetStudentDetailsResponse, ObjectFactory, StudentDetails, package-info
- `com.isg.soa.soap.web.services.tp.soapwebservicestp`: ServletInitializer, SoapWebServicesTpApplication, SoapWebServicesTpApplicationTests, WebServiceConfig
- `com.isg.soa.soap.web.services.tp.soapwebservicestp.student`: Student, StudentDetailsEndpoint
- Tests: 1 test class
- Contract: `src/main/resources/student-details.xsd`

## How to run

Requirements: a JDK 11+ and Maven (or the included Maven wrapper).

```bash
./mvnw spring-boot:run
```

The API then listens on `http://localhost:8080`.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
