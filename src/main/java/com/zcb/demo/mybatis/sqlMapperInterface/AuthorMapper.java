package com.zcb.demo.mybatis.sqlMapperInterface;

import com.zcb.demo.mybatis.sqlModel.Author;

import java.util.List;

/**
 * Created by zhuocongbin
 * date 2018/9/19
 */
public interface AuthorMapper {
    public List<Author> getAll();
    public Author getByAid(Integer aid);
    public int insert(Author author);
    public void deleteByAid(Integer aid);
}
