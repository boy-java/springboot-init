package com.bear.start.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * q应用启动时就会加载contextInitialized可以作为起始的资源加载
 */
@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("======contextInitialized========");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("======contextDestroyed========");
    }
}
