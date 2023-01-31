package com.och.vueblog.domain.posts;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PostsRepositoryImpl implements PostsRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Posts> getAllPostsOrderByIdDesc() {
        QPosts qPosts = QPosts.posts;
        return queryFactory.selectFrom(qPosts)
                .orderBy(qPosts.id.desc()).fetch();
    }
}
