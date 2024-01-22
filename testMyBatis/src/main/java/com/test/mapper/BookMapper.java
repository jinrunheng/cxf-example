package com.test.mapper;

import com.test.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Dooby Kim
 * @Date 2024/1/19 10:23 下午
 * @Version 1.0
 */
@Mapper
public interface BookMapper {
    Book selectBookById(int id);
}
