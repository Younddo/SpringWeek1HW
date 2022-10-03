package com.sparta.homework.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.homework.dto.BlogRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Blog extends Timestamped { // 생성,수정 시간을 자동으로 만들어줍니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column (nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    @JsonIgnore
    @Column(nullable = false)
    private String password;



    public Blog(String username, String title, String contents, String password) {
        this.username = username;
        this.title = title;
        this.contents = contents;
        this.password = password;
    }

    public Blog(BlogRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
    }

    public void update(BlogRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
    }

}



