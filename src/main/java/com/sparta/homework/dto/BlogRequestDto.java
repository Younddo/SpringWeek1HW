package com.sparta.homework.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BlogRequestDto {
    private String username;
    private String title;
    private String contents;
    private String password;

    public BlogRequestDto(String username, String title, String contents, String password) {
        this.username = username;
        this.title = title;
        this.contents = contents;
        this.password = password;
    }

    public BlogRequestDto(String username, String title) {
        this.username = username;
        this.title = title;
    }

}
