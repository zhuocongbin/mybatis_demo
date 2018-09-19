package com.zcb.demo.mybatis.dao;

import com.zcb.demo.mybatis.component.SQLSessionFactory;
import com.zcb.demo.mybatis.sqlMapperInterface.AuthorMapper;
import com.zcb.demo.mybatis.sqlModel.Author;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by zhuocongbin
 * date 2018/9/19
 */
@Slf4j
public class AuthorDao {

    public List<Author> getAll() {
        try(SqlSession session = SQLSessionFactory.getSession()) {
            AuthorMapper mapper = session.getMapper(AuthorMapper.class);
            List<Author> authors = mapper.getAll();
            log.info("get all authors");
            return authors;
        }
    }
    public Author getByAid(Integer aid) {
        try(SqlSession session = SQLSessionFactory.getSession()) {
            AuthorMapper mapper = session.getMapper(AuthorMapper.class);
            log.info("get author, id: {}", aid);
            return mapper.getByAid(aid);
        }
    }
    public int insert(Author author) {
        try(SqlSession session = SQLSessionFactory.getSession()) {
            AuthorMapper mapper = session.getMapper(AuthorMapper.class);
            mapper.insert(author);
            log.info("insert author, id: {}", author.getAid());
            return author.getAid();
        }
    }
    public void delete(Integer aid) {
        try(SqlSession session = SQLSessionFactory.getSession()) {
            AuthorMapper mapper = session.getMapper(AuthorMapper.class);
            mapper.deleteByAid(aid);
        }
    }
}
