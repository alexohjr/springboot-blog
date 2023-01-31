package com.och.vueblog.domain.posts;

import java.util.List;

public interface PostsRepositoryCustom {

    List<Posts> getAllPostsOrderByIdDesc();

}
