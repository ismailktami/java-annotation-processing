package annotation.example;

import annotation.CustomMethodAnnotation;
import annotation.CustomTypeAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Processing .............");
        Class<AnnotationExample> obj=AnnotationExample.class;
        if(obj.isAnnotationPresent(CustomTypeAnnotation.class)){
            Annotation annotation=obj.getAnnotation(CustomTypeAnnotation.class);
            CustomTypeAnnotation customTypeAnnotation=(CustomTypeAnnotation) annotation;
            System.out.println("Priority is :    "+customTypeAnnotation.priority());
            System.out.println("Created by  :    "+customTypeAnnotation.createdBy());
            System.out.println("Tags        :    "+customTypeAnnotation.tags().toString());
        }


        for(Method method: obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomMethodAnnotation.class)) {
                Annotation an = method.getAnnotation(CustomMethodAnnotation.class);
                CustomMethodAnnotation customMethodAnnotation = (CustomMethodAnnotation) an;
                System.out.println(method.getName());

                if (customMethodAnnotation.enabled()) {
                    System.out.println("enabled    is    true:");
                } else {
                    System.out.println("enabled    is    false:");

                }
            }
        }
    }
}
