package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.LOCAL_VARIABLE })
@interface Info {
int AuthorID();
 String Author() default "Default";
 String Supervisor() default "Default";
 String Date();
String Time();
int Version();
String Description() default "Default";
}
@Info(AuthorID=524, Date="5-5-2022", Time="06:50PM", Version=1)
class dev
{

 @Info(AuthorID=424, Date="5-5-2022", Time="06:50 PM", Version=1)
         public void getInfo() {
           System.out.println("getInfo");
    }
}
public class Annotation2{

public static void main(String[] args) {
     dev obj=new dev(); 
     obj.getInfo();
        }
}


