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
      or add into dependencies in build.gradle :
```
    compile group: 'org.springframework.boot', name: 'spring-boot-devtools'
```


2) ```File –> Setting –> Build, Execution, Deployment –> Compiler ```  mark Build project automatically

3) Press SHIFT+CTRL+A  and typing 'registry'

4) Mark  ```compiler.automake.allow.when.app.running ```

5) Change ```Running Application Update Policies``` on Update to rebuild on lost focus

6) ```CTRL+F9``` to update project

# Lombok support

1) Install lombok plugin and restart an IDEA

2) Find ```Annotation Processors``` in settings and mark ```Enable annotation processing```

# Swagger

Swagger2 documentation avaliable on {server.url}:3000/swagger-ui.html
