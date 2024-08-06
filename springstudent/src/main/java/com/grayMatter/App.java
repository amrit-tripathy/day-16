package com.grayMatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grayMatter.beans.Order;
import com.grayMatter.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("student-bean.xml");
//         Student st=(Student) context.getBean("stud");
//         System.out.println(st);
//        Order ord = (Order) context.getBean("ord");
//        System.out.println(ord);
//         Student st=(Student) context.getBean("studs");
//         System.out.println(st);
           Student st = (Student) context.getBean("st");
           System.out.println(st);
           
           
    }
}
