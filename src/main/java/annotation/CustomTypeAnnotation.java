package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomTypeAnnotation {

public enum Priority{
    LOW,MEDIUM,HIGH
};
Priority priority() default Priority.MEDIUM;

String[] tags() default "";
String createdBy() default "Ismail";
String lastModified() default "1/1/2019";
}
