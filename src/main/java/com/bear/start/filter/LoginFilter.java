package com.bear.start.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/api/*"},filterName = "LoginFilter")
public class LoginFilter implements Filter {
    /**
     *
     * @param filterConfig
     * @throws ServletException
     *
     * 容器初始化的时候就会调用
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init");
    }

    /**
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     *
     * 请求拦截时
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter doFiler");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String userName = request.getParameter("userName");
        if (userName.equals("bear")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            return;
        }
    }

    /**
     * 请求拦截后
     */
    @Override
    public void destroy() {
        System.out.println("Filter destroy");
    }
}
