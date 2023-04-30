# Dependency Injection


### What is a Component?

Components in SpringBoot are classes defined by annotations. Some important annotations are:

@Component -> detects beans automatically.
@Service -> used to define business logic and operations.
@Repository -> used to manage data access and persistence in an application.
@Controller/@RestController -> used to handle HTTP requests in a web application.@Controller sends the respons in normal format, @RestController sends the response in JSON or XML Format

### What is a Bean?

A bean is like an object in java but the difference is that it is seriazable and if it has a field like "name" it needs to have a method called "setName" verbatim. While in Java that method does not have to be specifically "setName".
<br>
Beans are stored in Application Context and they can be accesed like this:

~~~ ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MyComponent bean = ctx.getBean(MyComponent.class);
		System.out.println(bean); 
~~~
       


### What is the Scope of the Beans

Scope of the beans means the lifetime of the object.
<br>
Singleton -> One instance on that object will be created , because a class is a blueprint and you can create multiple objects ,but you want one object of th@Laizy ->By default, all beans in Spring Boot are eagerly initialized, which means that they are created when the application starts up. This can lead to longer startup times and increased memory usage, especially for applications with a large number of beans so the usage of this annotation will do the initialization of the bean when it will be needed.

Prototype ->this annotation is used to indicate that a bean should be created in a new instance every time it is requested by another component in the application ```@Scope("prototype")```.is class so you can use the singleton scope @Scope("singleton") in the @Component class. For each call you get the same bean.

<br>

@Laizy ->By default, all beans in Spring Boot are eagerly initialized, which means that they are created when the application starts up. This can lead to longer startup times and increased memory usage, especially for applications with a large number of beans so the usage of this annotation will do the initialization of the bean when it will be needed.

<br>

Prototype -> this annotation is used to indicate that a bean should be created in a new instance every time it is requested by another component in the application ```@Scope("prototype")```.
- Session -> are created once per user session and are destroyed when the session expires @Scope("session").

- Request -> are created once per HTTP request and are destroyed at the end of the request @Scope("request").

- Application -> are created once per web application and are destroyed when the application is shut down @Scope("application").

