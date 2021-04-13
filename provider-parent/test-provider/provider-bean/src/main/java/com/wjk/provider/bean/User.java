package com.wjk.provider.bean;

import lombok.*;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @Author Wangjunkai
 * @Date 2021/4/10 0:30
 **/

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User implements Serializable {

    private String name;
    private Integer age;
}