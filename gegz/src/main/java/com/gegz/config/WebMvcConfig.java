package com.gegz.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.BeanNameViewResolver;

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/**/*.do")
//                .addPathPatterns("/**/*.html");
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
       /* registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars*")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");*/
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("loginIn");
        registry.addViewController("/login").setViewName("loginIn");
    }

    /**
     * 视图解析器配置
     *
     * @return ViewResolver
     */
    @Bean
    public ViewResolver excelReportViewResolver() {
        BeanNameViewResolver viewResolver = new BeanNameViewResolver();
        viewResolver.setOrder(1);
        return viewResolver;
    }

    /**
     * excel视图解析器配置
     *
     * @return View
     */
   /* @Bean
    public View excelReportView() {
        return new ExcelReportView();
    }
*/
    /**
     * 设置springdispatch默认名字为default
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }


    /**
     * 自定义异常页
     */
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {

        return (container -> {
            ErrorPage error401Page = new ErrorPage(HttpStatus.FORBIDDEN, "/403.html");
            //ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
            //ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
            container.addErrorPages(error401Page);
        });
    }

}
