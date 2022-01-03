package org.epamproject.learning.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
/*    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return super.createRootApplicationContext();
    }*/

//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        return super.createServletApplicationContext();
//    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }
}
