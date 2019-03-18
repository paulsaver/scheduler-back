# Scheduler-back
Backend part of web app Scheduler.

# Hot Swap Spring Boot application

1) Add into pom.xml:
```
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
      <optional>true</optional>
</dependency>
```
2) ```File –> Setting –> Build, Execution, Deployment –> Compiler ```  mark Build project automatically

3) Press SHIFT+CTRL+A  and typing 'registry'

4) Mark  ```compiler.automake.allow.when.app.running ```

5) Change ```Running Application Update Policies``` on Update to rebuild on lost focus

6) ```CTRL+F9``` to update project
