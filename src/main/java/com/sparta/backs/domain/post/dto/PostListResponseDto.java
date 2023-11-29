package com.sparta.backs.domain.post.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PostListResponseDto {
    private List<PostResponseDto> data;
}
