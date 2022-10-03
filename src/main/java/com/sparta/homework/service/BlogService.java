package com.sparta.homework.service;

import com.sparta.homework.entity.Blog;
import com.sparta.homework.dto.BlogRequestDto;
import com.sparta.homework.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    @Transactional
    public Long update(Long id, BlogRequestDto requestDto) {
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        blog.update(requestDto);
        return blog.getId();
    }

    @Transactional // delete기능
    public Long delete(Long id) {
        blogRepository.deleteById(id);
        return id;
    }

    @Transactional //posting service (create)
    public Long post(BlogRequestDto requestDto) {
        Blog post = new Blog(requestDto);
        blogRepository.save(post);
        return post.getId();
    }

    @Transactional //글 전체 목록 loading
    public List<Blog> get() {
        return blogRepository.findAllByOrderByCreatedAtDesc();
    }

    @Transactional //하나의 글만 가지고 올 때
    public Blog getOne(Long id) {
        return blogRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
    }

    @Transactional
    public boolean check(Long id, BlogRequestDto requestDto) {
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        if(requestDto.getPassword().equals(blog.getPassword())){
            return true;
        } else {
            return false;
        }
    }

}