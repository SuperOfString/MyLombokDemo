## 一、什么是APT

`APT (Annotation Processing Tool)` 注解处理器，是 `javac` 的一个工具，他可以在源码生成class的时候，处理Java语法树。注解处理器可以用于很多场景，比如：

1. Lombok的实现，在编译时修改字节码生成 `get` 和 `set` 方法。
2. 框架，比如Spring。
3. 构建工具，比如Maven、Gradle。
4. 测试框架，比如JUnit。
5. 自定义注解处理器。


## 二、定义处理器

继承 `AbstractProcessor`

```java 
@AutoService(Processor.class)
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class MyGetterProcessor extends AbstractProcessor {

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {}

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnv) {}
}
```

- @AutoService 谷歌提供的SPI工具，当使用这个注解会自定生成Java SPI文件。当然如果不想用谷歌的工具，我们也可以自己来写配置文件。

``` 
├── classes
│   ├── META-INF
│   │   └── services
│   │       └── javax.annotation.processing.Processor
```

- @SupportedAnnotationTypes("*")

支持的注解类型

- @SupportedSourceVersion(SourceVersion.RELEASE_17)

支持的源码类型


[参考文章](https://www.cnblogs.com/javastack/p/15386924.html)
