package com.example.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shorty")
public class UrlController {

    @Autowired
    UrlService urlService;

    @PostMapping
    public ResponseEntity<String> shortenUrl(@RequestBody String longUrl) {
        return new ResponseEntity<String>(urlService.generateUrl(longUrl), HttpStatus.OK);
    }

}
