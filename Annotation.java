package Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

 

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
    int version()default 1;
}
class abc
{
    int a;
    public abc(int a)
    {
        this.a=a;
    }
    @Test(version=2)
    public void tes2()
    {
        if(a%2==0) {
            System.out.println("Divisible by 2");
        }
    }
    @Test(version=3)
    public void tes3()
    {
        if(a%3==0) {
            System.out.println("Divisible by 3");
        }
    }
}
public class Annotation {

 

 

    @Test(version=8)
    public static void justPrint()
    {
        System.out.println("just print");
    }

 

 

    public static void main(String[] args){
        abc obj=new abc(12);
        obj.tes2();
        obj.tes3();
        justPrint();
    }
}
