package com.boode.springboot1.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("filter init...");

        System.out.println("age"+filterConfig.getInitParameter("age"));
        System.out.println("uname"+filterConfig.getInitParameter("uname"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        System.out.println("My filter do......");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("my filter destroy...");
    }
}
