package com.sparta.backs.domain.like;

import com.sparta.backs.domain.post.Post;
import com.sparta.backs.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {
    int countByPost(Post post);
    Optional<Like> findByUserAndPost(User user, Post post);
}
