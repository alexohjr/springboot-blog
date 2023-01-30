package com.och.vueblog.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository <- 생략가능
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
