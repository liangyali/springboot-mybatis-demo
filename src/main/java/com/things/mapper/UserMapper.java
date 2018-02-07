package com.things.mapper;

import com.things.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User Mapper.
 *
 * @author liangyali
 */
@Component
@Mapper
public interface UserMapper {
    User findById(@Param("id") Long id);

    void insertBatch(List<User> users);

    void updateBatch(List<User> users);
}
