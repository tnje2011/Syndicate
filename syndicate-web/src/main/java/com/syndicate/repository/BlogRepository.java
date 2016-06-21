package com.syndicate.repository;

import com.syndicate.model.BlogEntity;
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
public interface BlogRepository extends JpaRepository<BlogEntity, Integer> {

    // 修改博文操作
    @Modifying
    @Transactional
    @Query("update BlogEntity blog set blog.title=:title, blog.userByUserId.id=:userId, blog.content=:content where blog.id=:id")
    void updateBlog(@Param("title") String title, @Param("userId") int userId, @Param("content") String content,
                    @Param("id") int id);

    // 修改博文操作
    @Modifying
    @Transactional
    @Query("update BlogEntity blog set blog.status=:status where blog.id=:id")
    void updateBlogStatus(@Param("status") int status, @Param("id") int id);
}
