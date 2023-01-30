package com.och.vueblog.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;

//    @Builder
//    public PostsUpdateRequestDto(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
}
