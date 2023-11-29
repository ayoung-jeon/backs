package com.sparta.backs.domain.post.dto;

import com.sparta.backs.domain.comment.dto.CommentResponseDto;
import com.sparta.backs.domain.post.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDetailsResponseDto extends PostResponseDto {
    private List<CommentResponseDto> commentList; // 댓글 목록

    public PostDetailsResponseDto(Post post, List<CommentResponseDto> commentList, int likeCount) {
        super(post, commentList.size(), likeCount); // PostResponseDto 생성자 호출
        this.commentList = commentList;
    }
}
