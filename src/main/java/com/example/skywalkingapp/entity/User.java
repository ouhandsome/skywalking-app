package com.example.skywalkingapp.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author handsome
 */
@Data
@Component
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
}
