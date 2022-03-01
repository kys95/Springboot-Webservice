package com.kys95.springboot.service;

import com.kys95.springboot.domain.posts.Posts;
import com.kys95.springboot.domain.posts.PostsRepository;
import com.kys95.springboot.web.dto.PostsResponseDto;
import com.kys95.springboot.web.dto.PostsSaveRequestDto;
import com.kys95.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity())
                .getId();
    }

}
