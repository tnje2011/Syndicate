package com.syndicate.repository;

import com.syndicate.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tom on 2016/6/19.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update UserEntity user set user.nickname=:nickname, user.password=:password, user.name=:name,user.status=:status where user.id=:id")
    void updateUser(@Param("nickname") String nickname, @Param("password") String password, @Param("name") String name, @Param("status") int status, @Param("id") Integer id);

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update UserEntity user set user.status=:status where user.id=:id")
    void updateUserStatus(@Param("status") int Status, @Param("id") Integer id);

}
