package com.wjk.annotation;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
@DubboService
@Component
public @interface WjkService {

    @AliasFor(annotation = DubboService.class)
    String[] protocol() default {};


    @AliasFor(annotation = DubboService.class)
    String accesslog() default "";

}
