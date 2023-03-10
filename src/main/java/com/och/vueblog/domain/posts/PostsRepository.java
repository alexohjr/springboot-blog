package com.och.vueblog.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Repository <- 생략가능
public interface PostsRepository extends JpaRepository<Posts, Long>, PostsRepositoryCustom {

//    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
//    List<Posts> findAllByOrderByIdDesc();
}
