package com.vartime.easy.spring.cloud.producer.model;

import com.vartime.easy.commons.base.BaseObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseObject {
    private Long id;
    private String name;
}
