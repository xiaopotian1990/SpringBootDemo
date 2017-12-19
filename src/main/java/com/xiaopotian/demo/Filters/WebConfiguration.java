package com.xiaopotian.demo.Filters;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by zoulu on 2017-12-19.
 */
@Configuration
public class WebConfiguration {
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("paramName","paramValue");
        filterRegistrationBean.setName("MyFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

    public class MyFilter implements Filter {

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request=(HttpServletRequest)servletRequest;
            System.out.println("this is MyFilter,url :"+request.getRequestURI());
            filterChain.doFilter(servletRequest,servletResponse);
        }

        @Override
        public void destroy() {

        }
    }
}
