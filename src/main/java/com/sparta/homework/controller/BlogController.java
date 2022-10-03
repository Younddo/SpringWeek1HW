package com.sparta.homework.controller;

import com.sparta.homework.entity.Blog;
import com.sparta.homework.dto.BlogRequestDto;
import com.sparta.homework.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class BlogController {
    private final BlogService blogService;




    @GetMapping("/api/blogs")  // 전체목록조회
    public List<Blog> getBlogs() {
        return blogService.get();
    }

    @GetMapping("/api/blogs/{id}") // 개별목록조회
    public Blog getOne(@PathVariable Long id) {
        return blogService.getOne(id);
    }


    @PostMapping("/api/blogs") // 글 생성 controller
    public Long createBlog(@RequestBody BlogRequestDto requestDto) {
        return blogService.post(requestDto);
    }


    @DeleteMapping("/api/blogs/{id}") // 글 삭제 controller
    public Long deleteBlog(@PathVariable Long id) {
        blogService.delete(id);
        return id;
    }

    @PutMapping("/api/blogs/{id}") // 글 수정 controller
    public Long updateBlog(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) {
        blogService.update(id, requestDto);
        return id;
    }

    @PostMapping("/api/blogs/{id}") // 비밀번호 찾기 controller
    public boolean check(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) {
        return blogService.check(id, requestDto);
    }

}
