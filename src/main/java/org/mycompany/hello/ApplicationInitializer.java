package org.mycompany.hello;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer
{

    //Called first when the application starts loading.
    public void onStartup(ServletContext servletContext)
            throws ServletException
    {
        System.out.println("Inside application initializer...");

        // if use xml configuration
//        //Registering the class that incorporates the annotated DispatcherServlet configuration of spring
//        XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
//        applicationContext.setConfigLocation("/WEB-INF/rest-servlet.xml");
//
//        //Registering the dispatcher servlet mappings.
//        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(applicationContext));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping("/");

        // if use annotation configuration
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(RootConfig.class);

        servletContext.addListener(new ContextLoaderListener(applicationContext));

        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcher", new DispatcherServlet(applicationContext));
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");
    }

}
