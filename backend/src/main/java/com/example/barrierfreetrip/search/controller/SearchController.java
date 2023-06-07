package com.example.barrierfreetrip.search.controller;

import com.example.barrierfreetrip.search.SearchDto;
import com.example.barrierfreetrip.search.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;

    @GetMapping("/search/{keyword}")
    public ResponseEntity search(@PathVariable("keyword") String keyword) {
        SearchDto result = searchService.search(keyword);

        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

}
