package com.grayMatter;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.grayMatter.beans.CustomerBean;
import com.grayMatter.beans.DataSource;
import com.grayMatter.beans.HelloBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
//        HelloBean hb = new HelloBean();
//        hb.sayHello();
//    	ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
//    	HelloBean hb = (HelloBean) context.getBean("hello");
//    	hb.sayHello();
//    	
//    	HelloBean hb1 =(HelloBean) context.getBean("hello");
//    	hb1.sayHello();
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("customer-bean.xml");
//    	CustomerBean c =(CustomerBean) context.getBean("cust");
//    	System.out.println(c);
//    	
//    	CustomerBean c1 = (CustomerBean) context.getBean("cust1");
//    	System.out.println(c1);
    	
//    	//hashcode example===so if we create multiple objects of same bean we have same hashcode
//    	CustomerBean c11 =(CustomerBean) context.getBean("cust");
//    	System.out.println(c11.hashCode()); //1296456465
//    	System.out.println(c.hashCode());   //1296456465
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
    	 DataSource ds = (DataSource) context.getBean("dbCon");
 
    	 Connection con = ds.getConnection();
    	 System.out.println("connection established");
    	 
    	 
    }
}
