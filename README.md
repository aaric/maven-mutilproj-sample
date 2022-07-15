# maven-mutilproj-sample

> *Maven testing for spring boot.*

## Maven

```bash
# run
mvn spring-boot:run -Dspring-boot.run.profiles=dev
curl http://localhost:8080/api/v1/test/base64/0/springboot
curl http://localhost:8080/api/v1/test/pojo/10

# package
mvn clean package
#java -jar ./target/demo-0.0.1-SNAPSHOT.jar
java -jar ./sub-backend/target/sub-backend-0.0.1-SNAPSHOT.jar

# wrapper
mvn wrapper:wrapper
```
