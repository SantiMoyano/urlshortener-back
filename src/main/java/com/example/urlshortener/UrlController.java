package com.example.urlshortener;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shorty")
public class UrlController {

    @GetMapping
    public ResponseEntity<String> GetShortURL() {
        return new ResponseEntity<>("shortygenerated", HttpStatus.OK);
    }

}
