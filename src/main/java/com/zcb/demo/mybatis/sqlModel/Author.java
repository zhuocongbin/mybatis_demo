package com.zcb.demo.mybatis.sqlModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by zhuocongbin
 * date 2018/9/19
 */
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Author {
    private Integer aid;
    private String fname;
    private String lname;
    private String country;
}
