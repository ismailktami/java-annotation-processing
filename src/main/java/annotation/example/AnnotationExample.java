package annotation.example;

import annotation.CustomMethodAnnotation;
import annotation.CustomTypeAnnotation;

@CustomTypeAnnotation(
        createdBy = "hassan",
        lastModified = "1/11/2019",
        priority = CustomTypeAnnotation.Priority.HIGH,
        tags = {"java","annotation"}
)
public class AnnotationExample {


    @CustomMethodAnnotation()
    String shouldBeAlwaysBeProcessed(){
        return "this should always be processed";
    }



    @CustomMethodAnnotation()
    void willThrowException(){
        throw new RuntimeException("this will throw an exception ");
    }

    @CustomMethodAnnotation(enabled = false)
    void shouldNotBeBeProcessed(){
        throw new RuntimeException("this should never be processed ");
    }
}
