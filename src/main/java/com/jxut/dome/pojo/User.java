package com.jxut.dome.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DateTimeException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String email;
    private String passw;
    private String salt;
    private DateTimeException activationTime;
    private Integer isValid;
    private String confirmCode;

}
