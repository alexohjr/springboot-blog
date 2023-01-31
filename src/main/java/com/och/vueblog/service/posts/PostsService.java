package com.och.vueblog.service.posts;

import com.och.vueblog.domain.posts.Posts;
import com.och.vueblog.domain.posts.PostsRepository;
import com.och.vueblog.web.dto.PostsListResponseDto;
import com.och.vueblog.web.dto.PostsResponseDto;
import com.och.vueblog.web.dto.PostsSaveRequestDto;
import com.och.vueblog.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;


    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id = " +id));
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));
        return new PostsResponseDto(entity);
    }

    @Transactional(readOnly = true) // readOnly = true -> 트랜잭션 범위 유지, 조회속도 개선
    public List<PostsListResponseDto> findAllDesc() {
        return postsRepository.getAllPostsOrderByIdDesc()
                .stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
