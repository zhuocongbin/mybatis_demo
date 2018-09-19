package com.zcb.demo.mybatis;

import com.zcb.demo.mybatis.dao.AuthorDao;
import com.zcb.demo.mybatis.sqlModel.Author;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by zhuocongbin
 * date 2018/9/19
 */
@Slf4j
public class MybatisServer {
    public static void main(String[] args) {
        AuthorDao authorDao = new AuthorDao();
        // 获取所有列表
        List<Author> all = authorDao.getAll();
        all.forEach(author -> log.info(author.toString()));
        // 插入一条列表，并返回主键id
        Author author = new Author();
        author.setCountry("china");
        author.setFname("li");
        author.setLname("wang");
        int insert = authorDao.insert(author);
        log.info("insert success, id: {}", insert);
        // 根据author_id查询单条目录
        log.info("get author, id: {}, author: {}", insert, authorDao.getByAid(insert));
        // 删除指定目录
        authorDao.delete(insert);
    }
}
