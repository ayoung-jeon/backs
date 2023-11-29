package com.sparta.backs.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignupResponseDto {
    private Long userId;
    private String email;
    private String userName;
    private String nickname;
}
