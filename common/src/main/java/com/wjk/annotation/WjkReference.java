package com.wjk.annotation;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @author wjk
 */
@DubboReference
@Autowired
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface WjkReference {

    @AliasFor(annotation = DubboReference.class)
    boolean check() default true;

    @AliasFor(annotation = DubboReference.class)
    String protocol() default "";

    @AliasFor(annotation = DubboReference.class)
    String mock() default "";

    @AliasFor(annotation = Autowired.class)
    boolean required() default true;
}
