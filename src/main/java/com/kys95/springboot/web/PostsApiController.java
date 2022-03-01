package com.kys95.springboot.web;


import com.kys95.springboot.service.PostsService;
import com.kys95.springboot.web.dto.PostsResponseDto;
import com.kys95.springboot.web.dto.PostsSaveRequestDto;
import com.kys95.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){

        return postsService.save(requestDto);
    }

}
